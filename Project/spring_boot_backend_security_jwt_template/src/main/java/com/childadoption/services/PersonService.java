package com.childadoption.services;

<<<<<<< HEAD
import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.AuthRequest;
import com.childadoption.dto.ChangePasswordDto;
=======
import com.childadoption.dto.AuthRequest;
>>>>>>> origin/Developed
import com.childadoption.dto.PersonReqDto;
import com.childadoption.dto.PersonRespDto;

public interface PersonService {

<<<<<<< HEAD
	public ApiResponse signUp(PersonReqDto personReqDto);    //ApiResponse
	public ApiResponse authenticateUser(AuthRequest dto);  //ApiResponse........?????????????
	 public ApiResponse changePassword(ChangePasswordDto changePasswordDto, Long personId); //ApiRespomse
	 public ApiResponse updateUserDetails(PersonReqDto personReqDto, Long personId);
=======
	public PersonRespDto signUp(PersonRespDto personResp);    //ApiResponse
	public PersonRespDto authenticateUser(AuthRequest dto);  //ApiResponse........?????????????
	 public PersonRespDto changePassword(PersonRespDto perDto, String newPassword); //ApiRespomse
	 public PersonRespDto updateUserDetails(PersonReqDto perDto);
	 public PersonRespDto findUserByCity(String city);
>>>>>>> origin/Developed
	 
}