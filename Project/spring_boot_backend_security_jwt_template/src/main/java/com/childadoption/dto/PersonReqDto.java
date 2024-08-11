package com.childadoption.dto;

import com.childadoption.entities.Ngo;
import com.childadoption.entities.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Getter
@Setter
public class PersonReqDto {
	@JsonIgnore
	private Long personId;
	private Long ngoId;
	private String fullName;
	private Role role;
	private String mobNo;
	private String emailId;
	private String password;
	private String address;
	private Long cityId;
	private String profileImagePath;
}
