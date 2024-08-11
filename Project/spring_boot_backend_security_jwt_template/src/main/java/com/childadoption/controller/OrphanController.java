package com.childadoption.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
>>>>>>> origin/Developed

import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.OrphanReqDto;
import com.childadoption.dto.OrphanRespDto;
<<<<<<< HEAD
import com.childadoption.services.OrphanService;

@RestController
@RequestMapping("/orphan")
public class OrphanController {
	@Autowired
	private OrphanService orphanService;
	
	@GetMapping("/searchOrphansByNgoId/{ngoId}")
	public List<OrphanRespDto> getallOrphans(@PathVariable Long ngoId) {
		return orphanService.GetOrphanListOfNgo(ngoId);
	}
	
	@GetMapping("/searchByOrphanId/{orphanId}")
	public OrphanRespDto getOrphanByID(@PathVariable Long orphanId){
		return orphanService.fetchOrphanById(orphanId);
	}
	
	//Bookslot
	
	@PostMapping("/add")
//	@PreAuthorize("hasRole('NGOADMIN')")
	public ApiResponse addOrphanDetails(@RequestBody OrphanReqDto orphanReqDto, @RequestParam Long ngoId)
	{
			orphanService.addOrphan(orphanReqDto, ngoId);
			return new ApiResponse("Orphan Added Successfully!!!");
=======
import com.childadoption.services.NgoService;
import com.childadoption.services.OrphanService;

@RestController
@RequestMapping("/orphandetails")
public class OrphanController {
	
//	@Autowired
//	private NgoService ngoservice;
	
	@Autowired
	private OrphanService orphanservice;
	
	public OrphanController() {
		System.out.println("Ngo Controller !!!!");
	}

	@PostMapping("/add")
	public ResponseEntity<?> addOrphanDetails(@RequestBody OrphanRespDto dto)
	{
		System.out.println("in add post "+dto);
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(orphanservice.addOrphan(dto));
		}
		catch(RuntimeException e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new ApiResponse(e.getMessage()));
		}
>>>>>>> origin/Developed
	}
	
	
	@PutMapping("/edit")
<<<<<<< HEAD
//	@PreAuthorize("hasRole('NGOADMIN')")
	public ResponseEntity<?> editOrphanDetails(@RequestBody OrphanReqDto dto, @RequestParam Long orphanId, @RequestParam Long ngoId)
	{
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(orphanService.editOrphan(dto, orphanId, ngoId));
=======
	public ResponseEntity<?> editOrphanDetails(@RequestBody OrphanReqDto dto)
	{
		System.out.println("in add post "+dto);
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(orphanservice.editOrphan(dto));
>>>>>>> origin/Developed
		}
		catch(RuntimeException e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new ApiResponse(e.getMessage()));
		}
	}
	
	@DeleteMapping("/{orphanId}")
<<<<<<< HEAD
//	@PreAuthorize("hasRole('NGOADMIN')")
	public ApiResponse deleteOrphanDetails(@PathVariable Long orphanId)
	{
		System.out.println("in delete orphan details "+orphanId);
		orphanService.deleteOrphan(orphanId);
		return new ApiResponse("Orphan deleted Successfully");
	}
	
=======
	public ResponseEntity<?> deleteOrphanDetails(@PathVariable Long orphanId)
	{
		System.out.println("in delete orphan details "+orphanId);
		return ResponseEntity.ok(orphanservice.deleteOrphan(orphanId));
	}
	
	
	
	
	
	
>>>>>>> origin/Developed
}
