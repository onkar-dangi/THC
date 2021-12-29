package com.thc.THC.services.Impl;

import com.thc.THC.models.Reservation;
import com.thc.THC.repository.ReservationRepository;
import com.thc.THC.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultReservationService implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public DefaultReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public boolean addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
        System.out.println(reservation);
        return true;
    }

    @Override
    public boolean deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
        System.out.println(reservation);
        return true;
    }

    @Override
    public List<Reservation> getReservation() {
        return reservationRepository.findAll();
    }
}
