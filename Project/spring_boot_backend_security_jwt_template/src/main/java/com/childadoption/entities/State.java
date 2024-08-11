package com.childadoption.entities;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="states")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "state_id")
	@JsonProperty(access = Access.READ_ONLY)
	private Long stateId;
	
	@Column(name="state_name",nullable= false, unique = true)
	private String stateName;
	
}
