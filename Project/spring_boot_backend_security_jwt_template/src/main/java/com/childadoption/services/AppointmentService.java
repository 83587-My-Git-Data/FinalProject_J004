package com.childadoption.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.AppointmentReqDto;
import com.childadoption.dto.AppointmentRespDto;

public interface AppointmentService {
	public ApiResponse addAppointment(AppointmentReqDto appointmentReq, LocalDate date);
	public ApiResponse cancelAppoinment(Long id);
	public ApiResponse editAppointment(AppointmentReqDto orphanReq, LocalDate date);
	public AppointmentRespDto getAppointmentDetails(Long appointmentId);
	public List<AppointmentRespDto> checkSlotsForPersonDate(Long personId, LocalDate date);
	public List<AppointmentRespDto> checkSlotsForOrphanDate(Long orphanId, LocalDate date);
}
