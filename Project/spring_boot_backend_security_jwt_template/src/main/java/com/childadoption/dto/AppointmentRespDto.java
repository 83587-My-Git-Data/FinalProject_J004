package com.childadoption.dto;

<<<<<<< HEAD
import java.time.LocalDate;


import com.childadoption.entities.Orphan;
import com.childadoption.entities.Person;
import com.childadoption.entities.Slot;

=======
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Person;
>>>>>>> origin/Developed
import lombok.*;

@Getter
@Setter
public class AppointmentRespDto {
<<<<<<< HEAD
	private Long appointmentId;
    private Person user;
    private Orphan orphan;
    private Slot slot;
    private LocalDate appointmentDate;
=======
    private Person user;
    private Ngo ngo;
>>>>>>> origin/Developed
}
