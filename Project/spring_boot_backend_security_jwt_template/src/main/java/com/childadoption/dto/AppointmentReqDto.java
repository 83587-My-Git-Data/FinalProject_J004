package com.childadoption.dto;

import lombok.*;

@Getter
@Setter
public class AppointmentReqDto {
	private Long appointmentId;
    private Long personId;
    private Long orphanId;
    private Long slotId;
    private Boolean isCancelled;
}
