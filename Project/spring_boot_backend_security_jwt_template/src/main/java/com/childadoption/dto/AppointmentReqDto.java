package com.childadoption.dto;

import javax.persistence.Column;
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Person;
import lombok.*;

@Getter
@Setter
public class AppointmentReqDto {
	private Long appointmentId;
    private Person user;
    private Ngo ngo;
}
