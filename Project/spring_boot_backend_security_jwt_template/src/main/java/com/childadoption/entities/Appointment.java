package com.childadoption.entities;

import java.time.LocalDate;
import java.time.LocalTime;

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
    @Column(name = "appointment_id")
    private Long appointmentId;
 
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Person user;

    @ManyToOne
    @JoinColumn(name = "ngo_id", nullable = false)
    private Ngo ngo;
    
    @Column(name = "appointment_date", nullable = false)
    private LocalDate apponintmentDate;
    
    @Column(name = "appointment_time", nullable = false)
    private LocalTime appointmentTime;
    
//    @Column(name = "date_id", nullable = false, unique = true)
//    private Date date;

//    @Column(name = "ngo_admin_id", unique = true)
//    private Person ngoAdminId;
//
//    @Column(name = "meeting_time", nullable = false)
//    private LocalDate meetingTime;
}
