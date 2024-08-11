package com.childadoption.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.childadoption.custom_exceptions.ResourceNotFoundException;
import com.childadoption.dto.NgoReqDto;
import com.childadoption.dto.NgoRespDto;
import com.childadoption.entities.Ngo;
import com.childadoption.repositories.NgoDao;

@Service
@Transactional
public class NgoServiceImpl implements NgoService {

	@Autowired
	NgoDao ngoDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public void activateNgo(Long ngoId) {
		Ngo ngo = ngoDao.findByNgoId(ngoId).orElseThrow(() -> new ResourceNotFoundException("Ngo doesn't Exist"));// ApiResponse
		ngo.setActive(true);
		ngoDao.save(ngo);
	}
	
	public void deactivateNgo(Long ngoId) {
		Ngo ngo = ngoDao.findByNgoId(ngoId).orElseThrow(() -> new ResourceNotFoundException("Ngo doesn't Exist"));// ApiResponse
		ngo.setActive(false);
		System.out.println(ngo);
		ngoDao.save(ngo);
	}

	@Override
	public void validateForm(NgoRespDto ngo) {
		Ngo n=null;
		 if(ngo!=null)
		 {
			n.setNgoName(ngo.getNgoName());
			n.setNgoAddress(ngo.getNgoAddress());
			n.setTotalOrphans(ngo.getTotalOrphans());
			n.setActive(false);
			ngoDao.save(n);
		 }
	}

	@Override
	public List<NgoRespDto> searchByCity(String city) {
		List<NgoRespDto> ngoList = new ArrayList<>();
		List<Ngo> p = ngoDao.findByCity(city);
		for (Ngo ngo : p) {
			ngoList.add(mapper.map(ngo, NgoRespDto.class));
		}
		return ngoList;
	}

	@Override
	public List<NgoRespDto> searchByNgoName(String name) {
		List<NgoRespDto> ngoList = new ArrayList<>();
		String strName = "%" + name + "%";
		List<Ngo> p = ngoDao.findByNgoName(strName);
		for (Ngo ngo : p) {
			ngoList.add(mapper.map(ngo, NgoRespDto.class));
		}
		return ngoList;
	}

	@Override
	public List<NgoRespDto> getAllNgos() {
		List<NgoRespDto> ngoList = new ArrayList<>();
		List<Ngo> p = ngoDao.findAll();
		for (Ngo ngo : p) {
			ngoList.add(mapper.map(ngo, NgoRespDto.class));
		}
		return ngoList;
	}	
}
