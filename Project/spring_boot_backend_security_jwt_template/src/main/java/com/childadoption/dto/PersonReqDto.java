package com.childadoption.dto;

import com.childadoption.entities.City;
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Role;
import lombok.*;

@Getter
@Setter
public class PersonReqDto {

	private Long personId;
	private Ngo ngo;
	private String fullName;
	private Role role;
	private String mobNo;
	private String emailId;
	private String password;
	private String address;
	private char gender;
	private City city;
	private String profileImagePath;
}
