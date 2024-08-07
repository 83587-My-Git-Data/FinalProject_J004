package com.childadoption.dto;

import lombok.*;

@Getter
@Setter
public class NgoRespDto {
    private String ngoName;
    private String ngoAddress;
    private int totalOrphans;
    private String city;
    private boolean isActive;
}
