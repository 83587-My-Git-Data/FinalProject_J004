package com.childadoption.entities;

import javax.persistence.*;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="cities")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cityId;
	
	@Column(name="city_name")
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name="state_id",nullable=false)
	private State state;
	
	@Column(name="pincode")
	private int pinCode;
}
