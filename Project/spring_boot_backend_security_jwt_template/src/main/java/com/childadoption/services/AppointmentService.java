package com.childadoption.services;

import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.AppointmentReqDto;
import com.childadoption.dto.AppointmentRespDto;

public interface AppointmentService {
	public ApiResponse addAppointment(AppointmentRespDto orphanResp);
	public ApiResponse deleteAppointment(Long id);
	public ApiResponse editAppointment(AppointmentReqDto orphanReq);
}
