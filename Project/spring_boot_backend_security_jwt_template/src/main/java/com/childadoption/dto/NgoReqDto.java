package com.childadoption.dto;

<<<<<<< HEAD
import com.childadoption.entities.City;

=======
>>>>>>> origin/Developed
import lombok.*;

@Getter
@Setter
public class NgoReqDto {
	private Long ngoId;
    private String ngoName;
    private String ngoAddress;
    private int totalOrphans;
<<<<<<< HEAD
    private City city;
=======
    private String city;
>>>>>>> origin/Developed
    private boolean isActive;
}
