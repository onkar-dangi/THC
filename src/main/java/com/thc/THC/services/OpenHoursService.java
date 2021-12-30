package com.thc.THC.services;

import com.thc.THC.models.Location;
import com.thc.THC.models.OpenHours;

import java.time.LocalTime;

public interface OpenHoursService {

    boolean addTime(OpenHours openHours);
    boolean remove(Long id);
}
