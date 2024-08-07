package com.childadoption.entities;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "orphans")
public class Orphan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orphan_id")
    private Long orphanId;

    @Column(name = "orphan_name", nullable = false, length = 20)
    private String orphanName;

    @Column(name = "orphan_gender", nullable = false, length = 10)
    private char orphanGender;

    @Column(name = "orphan_age", nullable = false)
    private int orphanAge; 

    @Column(name = "orphan_details", nullable = false)
    private String orphanDetails;

    @OneToOne
    @JoinColumn(name = "ngo_id", nullable = false)
    private Ngo ngo;

//    @Column(name = "ngo_name", length = 100, unique = true)
//    private String ngoName;

    @Column(name = "is_adopted", nullable = false)
    private boolean isAdopted;
}
