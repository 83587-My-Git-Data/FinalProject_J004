package com.childadoption.entities;

import java.time.LocalDate;
<<<<<<< HEAD

=======
>>>>>>> origin/Developed
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
<<<<<<< HEAD
=======

>>>>>>> origin/Developed
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id", unique = true)
    private Long appointmentId;
<<<<<<< HEAD
 
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
=======

    @Column(name = "user_id", unique = true)
    private Person user;

    @Column(name = "ngo_id", nullable = false, unique = true)
    private Ngo ngo;

//    @Column(name = "ngo_admin_id", unique = true)
//    private Person ngoAdminId;
//
//    @Column(name = "meeting_time", nullable = false)
//    private LocalDate meetingTime;
>>>>>>> origin/Developed
}
