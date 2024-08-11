package com.childadoption.services;

<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

=======
>>>>>>> origin/Developed
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.childadoption.custom_exceptions.ResourceNotFoundException;
=======
import org.springframework.stereotype.Service;

>>>>>>> origin/Developed
import com.childadoption.dto.ApiResponse;
import com.childadoption.dto.AppointmentReqDto;
import com.childadoption.dto.AppointmentRespDto;
import com.childadoption.dto.OrphanReqDto;
import com.childadoption.dto.OrphanRespDto;
import com.childadoption.entities.Appointment;
<<<<<<< HEAD
import com.childadoption.entities.Ngo;
import com.childadoption.entities.Orphan;
import com.childadoption.entities.Person;
import com.childadoption.entities.Slot;
import com.childadoption.exception.ApiException;
import com.childadoption.repositories.AppointmentDao;
import com.childadoption.repositories.NgoDao;
import com.childadoption.repositories.OrphanDao;
import com.childadoption.repositories.PersonDao;
import com.childadoption.repositories.SlotDao;

import net.bytebuddy.asm.Advice.Local;
=======
import com.childadoption.entities.Orphan;
import com.childadoption.exception.ApiException;
import com.childadoption.repositories.AppointmentDao;
>>>>>>> origin/Developed

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private AppointmentDao appointmentDao;
	
<<<<<<< HEAD
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private OrphanDao orphanDao;
	
	@Autowired
	private SlotDao slotDao;
	
	public ApiResponse addAppointment(AppointmentReqDto appointmentReq, LocalDate date)
	{
		Person p = personDao.findByPersonId(appointmentReq.getPersonId()).orElseThrow(() -> new ResourceNotFoundException("Person Doesn't Exist"));
		Orphan o = orphanDao.findByOrphanId(appointmentReq.getOrphanId()).orElseThrow(() -> new ResourceNotFoundException("Orphan Deoesn't exist"));
		Slot s = slotDao.findBySlotId(appointmentReq.getSlotId()).orElseThrow(() -> new ResourceNotFoundException("Slot Doesn't exist"));
		Appointment a = null;
		a.setUser(p);
		a.setOrphan(o);
		a.setSlot(s);
		a.setAppointmentDate(date);
		a.setIsCancelled(false);
		appointmentDao.save(a);
		return new ApiResponse("Appointment added!!!");
	}
	
	public ApiResponse cancelAppoinment(Long id)
	{
		Appointment a = appointmentDao.findByAppointmentId(id).orElseThrow(()->new ApiException("No appointment recieved"));
		a.setIsCancelled(true);
		appointmentDao.save(a);
		return new ApiResponse("Appointment Cancelled!!!");
	}
	
	public ApiResponse editAppointment(AppointmentReqDto appointmentReq, LocalDate date)
	{
		Appointment a = appointmentDao.findByAppointmentId(appointmentReq.getAppointmentId()).orElseThrow(()->new ApiException("No appointment recieved"));
		Slot s = slotDao.findBySlotId(appointmentReq.getSlotId()).orElseThrow(() -> new ResourceNotFoundException("Slot Doesn't exist"));
		a.setSlot(s);
		Orphan o = orphanDao.findByOrphanId(appointmentReq.getOrphanId()).orElseThrow(() -> new ResourceNotFoundException("Orphan Deosn't exist"));
		a.setOrphan(o);
		a.setAppointmentDate(date);
		appointmentDao.save(a);
		return new ApiResponse("Appointment edited!!!");
	}
	
	public AppointmentRespDto getAppointmentDetails(Long appointmentId) {
		Appointment a = appointmentDao.findById(appointmentId).orElseThrow(() -> new ResourceNotFoundException("Apointment Doesn't exist"));
		AppointmentRespDto ar = mapper.map(a, AppointmentRespDto.class);
		return ar;
	}

	@Override
	public List<AppointmentRespDto> checkSlotsForOrphanDate(Long orphanId, LocalDate date) {
		List<Appointment> a = appointmentDao.checkSlotsForOrphanDate(orphanId, date);
		List<AppointmentRespDto> ar = new ArrayList<AppointmentRespDto>();
		for (Appointment appointment : a) {
			ar.add(mapper.map(appointment,AppointmentRespDto.class));
		}
		return ar;
	}

	@Override
	public List<AppointmentRespDto> checkSlotsForPersonDate(Long personId, LocalDate date) {
		List<Appointment> a = appointmentDao.checkSlotsForPersonDate(personId, date);
		List<AppointmentRespDto> ar = new ArrayList<AppointmentRespDto>();
		for (Appointment appointment : a) {
			ar.add(mapper.map(appointment,AppointmentRespDto.class));
		}
		return ar;
	}
=======
	public ApiResponse addAppointment(AppointmentRespDto appointmentResp)
	{
		Appointment o = mapper.map(appointmentResp, Appointment.class);
		appointmentDao.save(o);
		return new ApiResponse("Appointment added!!!");
	}
	public ApiResponse deleteAppointment(Long id)
	{
		Appointment o = appointmentDao.findByAppointmentId(id).orElseThrow(()->new ApiException("No appointment recieved"));
		if(o!=null)
		{
			appointmentDao.delete(o);
		}
		
		return new ApiResponse("Appointment deleted!!!");
	}
	public ApiResponse editAppointment(AppointmentReqDto appointmentReq)
	{
		Appointment o1 = appointmentDao.findByAppointmentId(appointmentReq.getAppointmentId()).orElseThrow(()->new ApiException("No appointment recieved"));
		if(o1!=null)
		{
			o1.setNgo(appointmentReq.getNgo());
			o1.setUser(appointmentReq.getUser());
			appointmentDao.save(o1);
			
		}
		

		return new ApiResponse("Appointment edited!!!");
	}
>>>>>>> origin/Developed
}
