package com.childadoption.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.childadoption.services.NgoService;

@RestController
@RequestMapping("/ngo")
public class NgoController {

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
	
	
}
