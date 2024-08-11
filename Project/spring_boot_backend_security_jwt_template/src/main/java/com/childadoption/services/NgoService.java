package com.childadoption.services;

<<<<<<< HEAD
import java.util.List;


import com.childadoption.dto.NgoRespDto;

public interface NgoService {
	public void activateNgo(Long ngoId);  //ApiResponse
	public void validateForm(NgoRespDto ngo);
	public List<NgoRespDto> searchByCity(String city);
	public List<NgoRespDto> searchByNgoName(String name);
	public List<NgoRespDto> getAllNgos();
	public void deactivateNgo(Long ngoId);
=======
import com.childadoption.dto.NgoReqDto;
import com.childadoption.dto.NgoRespDto;

public interface NgoService {
	void activateNgo(NgoReqDto ngoReq);  //ApiResponse
	public void deActivateNgo(NgoReqDto ngoReq);
	
	void validateForm(NgoRespDto ngo);
	
	public NgoRespDto searchByCity(String city);
	public NgoRespDto searchByName(String name);
>>>>>>> origin/Developed
}
