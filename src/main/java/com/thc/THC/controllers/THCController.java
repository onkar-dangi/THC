package com.thc.THC.controllers;

import com.thc.THC.models.Location;
import com.thc.THC.models.Reservation;
import com.thc.THC.services.ReservationService;
import com.thc.THC.services.THCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/THC")
public class THCController {

    @Autowired
    private THCService thcService;
    @Autowired
    private ReservationService reservationService;

    public THCController(THCService thcService, ReservationService reservationService) {
        this.thcService = thcService;
        this.reservationService = reservationService;
    }

    @GetMapping("/testing")
    public String testing() {
        return "Testing";
    }

    @GetMapping("/locations")
    public List<Location> getListLocation() {
        return thcService.getLocations();
    }

    @GetMapping("/search/{id}")
    public Location getLocation(@PathVariable Long id) {
        return thcService.search(id);
    }

    @PostMapping("/add")
    public boolean addLocation(Location location) {
        System.out.println(location);
        thcService.addLocation(location);
        return true;
    }

    @PostMapping("/delete")
    public void deleteLocation(Location location) {
        thcService.deleteLocation(location);
    }

    @PostMapping("/addReservation")
    public boolean addReservation(Reservation reservation) {
        System.out.println(reservation);
        reservationService.addReservation(reservation);
        return true;
    }

    @PostMapping("/deleteReservation")
    public boolean deleteReservation(Reservation reservation) {
        System.out.println(reservation);
        reservationService.deleteReservation(reservation);
        return true;
    }

    @GetMapping("/getReservations")
    public List<Reservation> getReservations() {
        return reservationService.getReservation();
    }

}
