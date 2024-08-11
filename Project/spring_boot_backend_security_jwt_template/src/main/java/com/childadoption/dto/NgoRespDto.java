package com.childadoption.dto;

import com.childadoption.entities.City;

import lombok.*;

@Getter
@Setter
public class NgoRespDto {
    private String ngoName;
    private String ngoAddress;
    private int totalOrphans;
    private City city;
    private boolean isActive;
}
