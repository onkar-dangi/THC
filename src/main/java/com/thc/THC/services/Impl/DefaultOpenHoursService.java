package com.thc.THC.services.Impl;

import com.thc.THC.models.OpenHours;
import com.thc.THC.repository.OpenHoursRepository;
import com.thc.THC.services.OpenHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultOpenHoursService implements OpenHoursService {

    @Autowired
    private OpenHoursRepository openHoursRepository;

    public DefaultOpenHoursService(OpenHoursRepository openHoursRepository) {
        this.openHoursRepository = openHoursRepository;
    }

    @Override
    public boolean addTime(OpenHours openHours) {
        openHoursRepository.save(openHours);
        return true;
    }

    @Override
    public boolean remove(Long id) {
        openHoursRepository.deleteById(id);
        return true;
    }
}
