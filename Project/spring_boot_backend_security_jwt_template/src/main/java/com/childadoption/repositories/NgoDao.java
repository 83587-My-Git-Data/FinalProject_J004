package com.childadoption.repositories;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.childadoption.entities.Ngo;


public interface NgoDao extends JpaRepository<Ngo, Long> {
	Optional<Ngo> findByNgoId(Long id);
	@Query("select n from Ngo n where n.ngoName Like :name")
	List<Ngo> findByNgoName(String name);
	@Query("select n from Ngo n left join fetch n.city c where c.cityName = :city")
	List<Ngo> findByCity(String city);
=======
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.childadoption.dto.NgoReqDto;
import com.childadoption.entities.Ngo;

public interface NgoDao extends JpaRepository<Ngo, Long> {
	Optional<Ngo> findByNgoId(Long id);
	Optional<Ngo> findByCity(String city);
	Optional<Ngo> findByNgoName(String name);
>>>>>>> origin/Developed
}
