package com.childadoption.entities;

import java.time.LocalDate;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", unique = true)
    private Long appointmentId;
 
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Person user;

    @ManyToOne
    @JoinColumn(name = "orphan_id", nullable = false)
    private Orphan orphan;
    
    @Column(name = "appointment_date", nullable = false)
    private LocalDate appointmentDate;
    
    @OneToOne
    @JoinColumn(name = "slot_id", nullable = false)
    private Slot slot;
    
    @Column(name = "is_cancelled", nullable = false)
    private Boolean isCancelled;
}
