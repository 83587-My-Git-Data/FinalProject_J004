package com.childadoption.dto;

import lombok.*;

@Getter
@Setter
public class OrphanReqDto {
	    private String orphanName;
	    private String orphanGender;
	    private int orphanAge;
	    private String orphanDetails;
	    private boolean isAdopted;

}
