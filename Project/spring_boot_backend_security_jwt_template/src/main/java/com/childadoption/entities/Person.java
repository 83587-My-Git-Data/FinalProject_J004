package com.childadoption.entities;
import javax.persistence.*;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString


@Entity
@Table(name="persons")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="person_id",nullable=false)
	private Long personId;
	
	@OneToOne
<<<<<<< HEAD
	@JoinColumn(name="ngo_id")
=======
	@JoinColumn(name="ngo_id",nullable=false)
>>>>>>> origin/Developed
	private Ngo ngo;
	
	@Column(name="full_name",nullable=false)
	private String fullName;
	
<<<<<<< HEAD
	@JoinColumn(name="role_id",nullable=false)
	private Role role;
	
	@Column(name = "mob_no")
=======
	@OneToOne
	@JoinColumn(name="role_id",nullable=false)
	private Role role;
	
>>>>>>> origin/Developed
	private String mobNo; /// string
	
	@Column(name="email_id",nullable=false)
	private String emailId;
	
	@Column(name="password",nullable=false)
	private String password;
	
	private String address;
	
<<<<<<< HEAD
	@OneToOne
	@JoinColumn(name="city_id",nullable=false)
	private City city; // string
	
	@Column(name = "profile_image_path")
	private String profileImagePath;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "is_online")
=======
	@OneToMany
	@Column(name="city_id",nullable=false)
	private City city; // string
	
	private String profileImagePath;
	
	private boolean isActive;
	
>>>>>>> origin/Developed
	private boolean isOnline;
	
	
	// Initially in adoption table only one directional from adoption to Person we can do it bidirectional later
}
