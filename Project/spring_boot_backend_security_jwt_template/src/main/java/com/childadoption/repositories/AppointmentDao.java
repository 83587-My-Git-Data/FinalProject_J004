package com.childadoption.repositories;

import java.util.Optional;

<<<<<<< HEAD

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.childadoption.entities.Appointment;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentDao extends JpaRepository<Appointment, Long> {	
	Optional<Appointment> findByAppointmentId(Long id);
	@Query("select a from Appointment a where a.orphan.orphanId = :orphanId and a.appointmentDate = :date")
	List<Appointment> checkSlotsForOrphanDate(Long orphanId, LocalDate date);
	@Query("select a from Appointment a where a.user.personId = :personId and a.appointmentDate = :date")
	List<Appointment> checkSlotsForPersonDate(Long personId, LocalDate date);
}
	
=======
import org.springframework.data.jpa.repository.JpaRepository;
import com.childadoption.entities.Appointment;
import com.childadoption.entities.Donation;

public interface AppointmentDao extends JpaRepository<Appointment, Long> {
	Optional<Appointment> findByAppointmentId(Long id);
}
>>>>>>> origin/Developed
