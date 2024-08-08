package com.childadoption.entities;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "ngos")
public class Ngo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ngo_id", unique = true)
    private Long ngoId;

    @Column(name = "ngo_name", nullable = false, unique = true, length = 100)
    private String ngoName;

    @Column(name = "ngo_address", nullable = false)
    private String ngoAddress;

    @Column(name = "total_orphans", nullable = false)
    private int totalOrphans;
    
    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}
