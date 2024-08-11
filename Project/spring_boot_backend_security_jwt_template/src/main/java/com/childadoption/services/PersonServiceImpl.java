package com.childadoption.services;


import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.childadoption.custom_exceptions.ResourceNotFoundException;
import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.AuthRequest;
import com.childadoption.dto.ChangePasswordDto;
import com.childadoption.dto.PersonReqDto;
import com.childadoption.dto.PersonRespDto;
import com.childadoption.entities.City;
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Person;
import com.childadoption.repositories.CityDao;
import com.childadoption.repositories.NgoDao;
import com.childadoption.repositories.PersonDao;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private CityDao cityDao;
	
	@Autowired
	private NgoDao ngoDao;
	
	@Override
	public ApiResponse signUp(PersonReqDto personReqDto) {
		Long cityId = personReqDto.getCityId();
		City city = cityDao.findById(cityId).orElseThrow(() -> new ResourceNotFoundException("Valid city is not assigned to the Person"));
		Person p = mapper.map(personReqDto, Person.class);
		p.setCity(city);
		if(personReqDto.getRole().name() == "ROLE_NGOADMIN") {
			Long ngoId = personReqDto.getNgoId();
			Ngo ngo = ngoDao.findById(ngoId).orElseThrow(() -> new ResourceNotFoundException("Valid Ngo is not assigned to the Ngo Admin. Please assign it"));
			p.setNgo(ngo);
		}
		p.setActive(true);
		personDao.save(p);
		return new ApiResponse("Registration Successful!!!");	 	
	}
	
	@Override
	public ApiResponse authenticateUser(AuthRequest dto) {
		Person p = personDao.findByEmailIdAndPassword(
				dto.getEmailId(),dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Credentials!!!"));
		p.setOnline(true);
		return new ApiResponse("Login Successfull!!!");

}

	@Override
	public ApiResponse changePassword(ChangePasswordDto changePasswordDto, Long personId) {
		Person p1 = personDao.findById(personId).orElseThrow(() -> new ResourceNotFoundException("Person Doesn't Exist"));; 
		 if (p1!=null && p1.getPassword().equals(changePasswordDto.getOldPassword())) { 
			 p1.setPassword(changePasswordDto.getConfirmNewPassword());
	         personDao.save(p1);
	        }
		 else {
			 new ApiResponse("Invalid Credentials");
		 }
		 return new ApiResponse("Password Changed Successfully!!!");
	}

	@Override
	public ApiResponse updateUserDetails(PersonReqDto personReqDto, Long personId) {
		Person p1 = personDao.findByPersonId(personId).orElseThrow(() -> new ResourceNotFoundException("Person Doesn't exist"));
		if(p1!=null)
		{
			p1.setFullName(personReqDto.getFullName());
			p1.setRole(personReqDto.getRole());
			p1.setMobNo(personReqDto.getMobNo());
			p1.setEmailId(personReqDto.getEmailId());
			p1.setPassword(personReqDto.getPassword());
			p1.setAddress(personReqDto.getAddress());
			p1.setProfileImagePath(personReqDto.getProfileImagePath());
			if(personReqDto.getRole().name() == "ROLE_NGOADMIN") {
				Long ngoId = personReqDto.getNgoId();
				Ngo ngo = ngoDao.findById(ngoId).orElseThrow(() -> new ResourceNotFoundException("Valid Ngo is not assigned to the Ngo Admin. Please assign it"));
				p1.setNgo(ngo);
			}
			Long cityId = personReqDto.getCityId();
			City city = cityDao.findById(cityId).orElseThrow(() -> new ResourceNotFoundException("Valid city is not assigned to the Person"));
			p1.setCity(city);
		}
		
		return new ApiResponse("Details Updated Successfully");
	}

}