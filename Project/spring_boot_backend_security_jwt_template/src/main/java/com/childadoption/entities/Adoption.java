package com.childadoption.entities;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Adoption {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adoption_id", unique = true)
    private Long adoptionId;
	
	
	private Person person;
	
	@OneToOne
	private Orphan orphan;
	
	private LocalDateTime timeAdopted;
}
