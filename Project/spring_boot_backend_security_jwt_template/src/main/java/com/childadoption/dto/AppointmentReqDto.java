package com.childadoption.dto;

<<<<<<< HEAD
=======
import javax.persistence.Column;
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Person;
>>>>>>> origin/Developed
import lombok.*;

@Getter
@Setter
public class AppointmentReqDto {
	private Long appointmentId;
<<<<<<< HEAD
    private Long personId;
    private Long orphanId;
    private Long slotId;
    private Boolean isCancelled;
=======
    private Person user;
    private Ngo ngo;
>>>>>>> origin/Developed
}
