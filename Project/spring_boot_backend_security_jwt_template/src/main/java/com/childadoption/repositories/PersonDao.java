package com.childadoption.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.childadoption.entities.Person;

public interface PersonDao extends JpaRepository<Person, Long> {
	Optional<Person> findByEmailIdAndPassword(String email,String pass);
	Optional<Person> findByPersonId(Long id);
	Optional<Person> findByCity(String city);
}
