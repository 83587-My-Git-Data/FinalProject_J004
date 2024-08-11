package com.childadoption.entities;

<<<<<<< HEAD
public enum Role {
	ROLE_USER, ROLE_ADMIN, ROLE_NGOADMIN
=======
import javax.persistence.*;
import lombok.*;
@Setter
@Getter
@NoArgsConstructor

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="role_id",nullable=false)
	private Long roleId;
	private String roleType;
>>>>>>> origin/Developed
}
