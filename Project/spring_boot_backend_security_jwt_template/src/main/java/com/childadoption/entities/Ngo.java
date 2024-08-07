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
    @Column(name = "ngo_id")
    private Long ngoId;

    @Column(name = "ngo_name", nullable = false, unique = true, length = 100)
    private String ngoName;

    @Column(name = "ngo_address", nullable = false, length = 250)
    private String ngoAddress;

    @Column(name = "total_orphans", nullable = false)
    private int totalOrphans;
    
    @ManyToOne
    @JoinColumn(name = "city", nullable = false)
    private City city;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}
