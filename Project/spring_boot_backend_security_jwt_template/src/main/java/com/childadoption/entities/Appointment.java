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

    @Column(name = "user_id", unique = true)
    private Person user;

    @Column(name = "ngo_id", nullable = false, unique = true)
    private Ngo ngo;

//    @Column(name = "ngo_admin_id", unique = true)
//    private Person ngoAdminId;
//
//    @Column(name = "meeting_time", nullable = false)
//    private LocalDate meetingTime;
}
