package com.childadoption.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.childadoption.dto.NgoReqDto;
import com.childadoption.entities.Ngo;

public interface NgoDao extends JpaRepository<Ngo, Long> {
	Optional<Ngo> findByNgoId(Long id);
	Optional<Ngo> findByCity(String city);
	Optional<Ngo> findByNgoName(String name);
}
