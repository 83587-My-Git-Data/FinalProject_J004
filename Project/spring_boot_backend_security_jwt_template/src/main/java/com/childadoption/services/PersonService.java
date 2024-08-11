package com.childadoption.services;

import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.AuthRequest;
import com.childadoption.dto.ChangePasswordDto;
import com.childadoption.dto.PersonReqDto;
import com.childadoption.dto.PersonRespDto;

public interface PersonService {

	public ApiResponse signUp(PersonReqDto personReqDto);    //ApiResponse
	public ApiResponse authenticateUser(AuthRequest dto);  //ApiResponse........?????????????
	 public ApiResponse changePassword(ChangePasswordDto changePasswordDto, Long personId); //ApiRespomse
	 public ApiResponse updateUserDetails(PersonReqDto personReqDto, Long personId);
	 
}