package com.childadoption.dto;

import com.childadoption.entities.Ngo;
import lombok.*;

@Getter
@Setter
public class OrphanReqDto {
	 	private Long orphanId;
	    private String orphanName;
	    private String orphanGender;
	    private int orphanAge;
	    private String orphanDetails;
	    private Ngo ngo;
	    private String ngoName;
	    private boolean isAdopted;

}
