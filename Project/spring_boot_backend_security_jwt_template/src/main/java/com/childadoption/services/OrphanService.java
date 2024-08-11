package com.childadoption.services;

import java.util.List;

import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.OrphanReqDto;
import com.childadoption.dto.OrphanRespDto;

public interface OrphanService {
	public ApiResponse addOrphan(OrphanReqDto orphanReq, Long ngoId);
	public ApiResponse deleteOrphan(Long id);
	public ApiResponse editOrphan(OrphanReqDto orphanReq, Long orphanId, Long ngoId);
	public List<OrphanRespDto> GetOrphanListOfNgo(Long id);
	public OrphanRespDto fetchOrphanById(Long id);
}
