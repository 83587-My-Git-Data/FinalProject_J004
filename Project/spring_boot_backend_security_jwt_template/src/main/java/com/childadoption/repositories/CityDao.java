package com.childadoption.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.childadoption.entities.City;

public interface CityDao extends JpaRepository<City, Long> {
	
}
