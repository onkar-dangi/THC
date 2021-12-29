package com.thc.THC.services;

import com.thc.THC.models.Location;
import com.thc.THC.models.Reservation;

import java.util.List;

public interface THCService {

    boolean addLocation(Location location);
    List<Location> getLocations();
    Location search(Long id);
    void deleteLocation(Location location);

}
