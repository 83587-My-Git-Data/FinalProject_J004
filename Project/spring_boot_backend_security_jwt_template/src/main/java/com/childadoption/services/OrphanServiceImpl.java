package com.childadoption.services;

import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.childadoption.custom_exceptions.ResourceNotFoundException;
import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.OrphanReqDto;
import com.childadoption.dto.OrphanRespDto;
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Orphan;
import com.childadoption.repositories.NgoDao;
import com.childadoption.repositories.OrphanDao;

@Service
@Transactional
public class OrphanServiceImpl implements OrphanService {

	@Autowired
	private OrphanDao orphanDao;
	
	@Autowired
	private NgoDao ngoDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ApiResponse addOrphan(OrphanReqDto orphanReq, Long ngoId) {
		Ngo n = ngoDao.findByNgoId(ngoId).orElseThrow(() -> new ResourceNotFoundException("Ngo Doesn't Exist"));
		Orphan o =	mapper.map(orphanReq, Orphan.class);
		o.setNgo(n);
		orphanDao.save(o);
		return new ApiResponse("Orphan Added in the table");
	}
	
	public ApiResponse deleteOrphan(Long id)
	{
		Orphan o = orphanDao.findByOrphanId(id).orElseThrow();
		if(o!=null)
		{
			orphanDao.delete(o);
		}
		
		return new ApiResponse("Orphan details deleted");
	}
	
	public ApiResponse editOrphan(OrphanReqDto orphanReq,Long orphanId, Long ngoId)
	{
		Orphan o1 = orphanDao.findByOrphanId(orphanId).orElseThrow(() -> new ResourceNotFoundException("Orphan Doesn't Exist!"));
		Ngo n = ngoDao.findByNgoId(ngoId).orElseThrow(() -> new ResourceNotFoundException("Ngo Doesn't Exist!"));
		if(o1!=null)
		{
			o1.setOrphanName(orphanReq.getOrphanName());
			o1.setOrphanAge(orphanReq.getOrphanAge());
			o1.setOrphanGender(orphanReq.getOrphanGender());
			o1.setNgo(n);
			o1.setOrphanDetails(orphanReq.getOrphanDetails());
			orphanDao.save(o1);
		}
		
		return new ApiResponse("Orphan details updated");
	}
	
	@Override
	public List<OrphanRespDto> GetOrphanListOfNgo(Long id) {
		List<Orphan> orphanList = orphanDao.findByNgoNgoId(id).orElseThrow(() -> new ResourceNotFoundException("Ngo Deosn't Exist"));
		List<OrphanRespDto> orphanRespDtoList = new ArrayList<>();
		for (Orphan orphan : orphanList) {
			orphanRespDtoList.add(mapper.map(orphan, OrphanRespDto.class));
		}
		return orphanRespDtoList;
	}

	@Override
	public OrphanRespDto fetchOrphanById(Long id) {
		Orphan orphan = orphanDao.findByOrphanId(id).orElseThrow(() -> new ResourceNotFoundException("Orphan Doesn't Exist") );
		return mapper.map(orphan, OrphanRespDto.class);
	}
}

