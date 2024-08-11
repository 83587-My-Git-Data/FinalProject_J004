package com.childadoption.dto;

import java.time.LocalDate;


import com.childadoption.entities.Orphan;
import com.childadoption.entities.Person;
import com.childadoption.entities.Slot;

import lombok.*;

@Getter
@Setter
public class AppointmentRespDto {
	private Long appointmentId;
    private Person user;
    private Orphan orphan;
    private Slot slot;
    private LocalDate appointmentDate;
}
