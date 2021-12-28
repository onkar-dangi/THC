package com.thc.THC.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(targetEntity = Menu.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Menu menu;

    @OneToMany(targetEntity = Reservation.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reservation> reservation;

    @OneToOne(targetEntity = OpenHours.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private OpenHours openHours;
}
