package com.childadoption.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.childadoption.entities.Appointment;
import com.childadoption.entities.Donation;

public interface AppointmentDao extends JpaRepository<Appointment, Long> {
	Optional<Appointment> findByAppointmentId(Long id);
}
