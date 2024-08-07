package com.childadoption.services;

import java.util.List;

import com.childadoption.dto.OrphanReqDto;
import com.childadoption.dto.OrphanRespDto;

public interface OrphanService {
	public void addOrphan(OrphanRespDto orphanResp); //ApiResponse
	public void deleteOrphan(Long id);
	public OrphanRespDto editOrphan(OrphanReqDto orphanReq);
//	public List<OrphanRespDto> GetOrphanListAsNgo(Long id);
}
