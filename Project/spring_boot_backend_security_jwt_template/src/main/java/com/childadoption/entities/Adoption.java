package com.childadoption.entities;

import java.time.LocalDateTime;
<<<<<<< HEAD

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="adoptions")
=======
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

>>>>>>> origin/Developed
public class Adoption {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adoption_id", unique = true)
    private Long adoptionId;
	
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@OneToOne
	@JoinColumn(name = "orphan_id")
	private Orphan orphan;
	
	@Column(name = "time_adopted")
=======
	
	private Person person;
	
	@OneToOne
	private Orphan orphan;
	
>>>>>>> origin/Developed
	private LocalDateTime timeAdopted;
}
