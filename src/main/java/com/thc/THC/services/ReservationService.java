package com.thc.THC.services;

import com.thc.THC.models.Reservation;

import java.util.List;

public interface ReservationService {
    boolean addReservation(Reservation reservation);
    boolean deleteReservation(Reservation reservation);
    List<Reservation> getReservation();
}
