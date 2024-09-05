package com.childadoption.dto;

<<<<<<< HEAD
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

=======
import com.childadoption.entities.City;
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Role;
>>>>>>> origin/Developed
import lombok.*;

@Getter
@Setter
public class PersonReqDto {
<<<<<<< HEAD
	@JsonIgnore
	private Long personId;
	private Long ngoId;
=======

	private Long personId;
	private Ngo ngo;
>>>>>>> origin/Developed
	private String fullName;
	private Role role;
	private String mobNo;
	private String emailId;
	private String password;
	private String address;
<<<<<<< HEAD
	private Long cityId;
=======
	private City city;
>>>>>>> origin/Developed
	private String profileImagePath;
}
