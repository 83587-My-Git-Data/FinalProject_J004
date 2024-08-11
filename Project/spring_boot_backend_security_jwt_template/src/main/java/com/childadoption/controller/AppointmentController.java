package com.childadoption.controller;
<<<<<<< HEAD
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
>>>>>>> origin/Developed
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
=======
>>>>>>> origin/Developed
import org.springframework.web.bind.annotation.RestController;

import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.AppointmentReqDto;
import com.childadoption.dto.AppointmentRespDto;
import com.childadoption.dto.OrphanReqDto;
import com.childadoption.dto.OrphanRespDto;
import com.childadoption.services.AppointmentService;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentSrvc;
	
	public AppointmentController() {
		System.out.println("Appointment Controller ");
	}
	
	@PostMapping("/add")
<<<<<<< HEAD
	public ApiResponse addAppointment(@RequestBody AppointmentReqDto dto, @RequestParam String appointmentDateString)
	{
		LocalDate date = LocalDate.parse(appointmentDateString);
		appointmentSrvc.addAppointment(dto, date);
		return new ApiResponse("Appointment Added Successfully");
	}
	
	@PutMapping("/edit")
	public ApiResponse editAppointment(@RequestBody AppointmentReqDto dto, @RequestParam String appointmentDateString)
	{
		LocalDate date = LocalDate.parse(appointmentDateString);
		appointmentSrvc.editAppointment(dto, date);
		return new ApiResponse("Appointemnt Edited Succesfully");	
	}
	
	@PostMapping("/cancel/{appointmentId}")
	public ApiResponse cancelAppointment(@PathVariable Long appointmentId)
	{
		appointmentSrvc.cancelAppoinment(appointmentId);
		return new ApiResponse("Appointmet Cancelled!!");
	}	
	
	@GetMapping("test")
	@CrossOrigin("http://localhost:8080/swagger-ui/index.html#/appointment-controller/test")
	public List<AppointmentRespDto> test(@RequestParam Long personId,@RequestParam String appointmentDateString){
		LocalDate date = LocalDate.parse(appointmentDateString);
		return appointmentSrvc.checkSlotsForOrphanDate(personId, date);
	}
	
	@GetMapping("test1")
	@CrossOrigin("http://localhost:8080/swagger-ui/index.html#/appointment-controller/test")
	public List<AppointmentRespDto> test1(@RequestParam Long personId,@RequestParam String appointmentDateString){
		LocalDate date = LocalDate.parse(appointmentDateString);
		return appointmentSrvc.checkSlotsForPersonDate(personId, date);
	}
=======
	public ResponseEntity<?> addAppointment(@RequestBody AppointmentRespDto dto)
	{
		System.out.println("in add post "+dto);
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(appointmentSrvc.addAppointment(dto));
		}
		catch(RuntimeException e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new ApiResponse(e.getMessage()));
		}
	}
	
	@PutMapping("/edit")
	public ResponseEntity<?> editAppointment(@RequestBody AppointmentReqDto dto)
	{
		System.out.println("in add post "+dto);
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(appointmentSrvc.editAppointment(dto));
		}
		catch(RuntimeException e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new ApiResponse(e.getMessage()));
		}
	}
	
	@DeleteMapping("/{appointmentId}")
	public ResponseEntity<?> deleteOrphanDetails(@PathVariable Long appointmentId)
	{
		System.out.println("in delete orphan details "+appointmentId);
		return ResponseEntity.ok(appointmentSrvc.deleteAppointment(appointmentId));
	}
	
>>>>>>> origin/Developed
}
