package com.childadoption.dto;

import com.childadoption.entities.Ngo;
import com.childadoption.entities.Person;
import lombok.*;

@Getter
@Setter
public class AppointmentRespDto {
    private Person user;
    private Ngo ngo;
}
