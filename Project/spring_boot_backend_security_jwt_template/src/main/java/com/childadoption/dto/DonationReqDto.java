package com.childadoption.dto;

import java.time.LocalDate;

import com.childadoption.entities.Person;

import lombok.*;

@Getter
@Setter
public class DonationReqDto {
	private Long donationId;
	private Person user;
	private double donatedAmount;
	private LocalDate donationTime;
}
