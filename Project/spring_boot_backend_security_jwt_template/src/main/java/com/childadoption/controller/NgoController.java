package com.childadoption.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.NgoRespDto;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

>>>>>>> origin/Developed
import com.childadoption.services.NgoService;

@RestController
@RequestMapping("/ngo")
public class NgoController {
<<<<<<< HEAD
	@Autowired
	public NgoService ngoService;
	
	@GetMapping("/list")
	public List<NgoRespDto> getNgoList(){
		return ngoService.getAllNgos();
	}
	
	@GetMapping("/searchByCity/{city}")
	public ResponseEntity<?> searchByCity(@PathVariable String city){
			return ResponseEntity.ok(ngoService.searchByCity(city));
	}
	
	@GetMapping("/searchByNgo/{ngo}")
	public ResponseEntity<?> searchByNgo(@PathVariable String ngo){
			return ResponseEntity.ok(ngoService.searchByNgoName(ngo));
	}
	
	@GetMapping("/deactivate/{ngoId}")
	public ApiResponse deactivateNgo(@PathVariable Long ngoId){
		ngoService.deactivateNgo(ngoId);
		return new ApiResponse("Ngo Successfully Deactivated!!!");
	}
	
	@GetMapping("/activate/{ngoId}")
	public ApiResponse activateNgo(@PathVariable Long ngoId){
		ngoService.activateNgo(ngoId);
		return new ApiResponse("Ngo Successfully Activated!!!");
	}
=======

	@Autowired
	private NgoService ngoSrvc;
	
	public NgoController() {
		System.out.println("Ngo Controller");
	}
	
//	@GetMapping("/{city}")
//	public ResponseEntity<?> getCategoryDetails(@PathVariable Long catId) {
//		System.out.println("in get category " + catId);
//		try {
//			// invoke service layer method
//			return ResponseEntity.ok(categoryService.getCategoryDetails(catId));
//		} catch (RuntimeException e) {
//			System.out.println(e);
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage()));
//		}
//	}
	
	
>>>>>>> origin/Developed
}
