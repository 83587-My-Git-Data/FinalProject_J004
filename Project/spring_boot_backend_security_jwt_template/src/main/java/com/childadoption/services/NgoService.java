package com.childadoption.services;

import java.util.List;


import com.childadoption.dto.NgoRespDto;

public interface NgoService {
	public void activateNgo(Long ngoId);  //ApiResponse
	public void validateForm(NgoRespDto ngo);
	public List<NgoRespDto> searchByCity(String city);
	public List<NgoRespDto> searchByNgoName(String name);
	public List<NgoRespDto> getAllNgos();
	public void deactivateNgo(Long ngoId);
}
