package com.childadoption.entities;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "donations")
public class Donation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "donation_id")
	private Long donationId;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Person user;

	@Column(name = "donated_amount", nullable = false)
	private double donatedAmount;

	@Column(name = "donation_time", nullable = false)
	private LocalDate donationTime;
}
