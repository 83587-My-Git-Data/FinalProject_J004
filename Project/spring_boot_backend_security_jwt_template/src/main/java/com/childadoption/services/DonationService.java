package com.childadoption.services;

import com.childadoption.dto.DonationReqDto;
import com.childadoption.dto.DonationRespDto;

public interface DonationService {
	

	public DonationRespDto updateDonation(DonationReqDto dDto);
}
