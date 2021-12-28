package com.thc.THC.services.Impl;

import com.thc.THC.models.Location;
import com.thc.THC.repository.THCRepository;
import com.thc.THC.services.THCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTHCService implements THCService {

    @Autowired
    private THCRepository thcRepository;

    public DefaultTHCService(THCRepository thcRepository) {
        this.thcRepository = thcRepository;
    }

    @Override
    public boolean addLocation(Location location) {
        thcRepository.save(location);
        return true;
    }

    @Override
    public List<Location> getLocations() {
        return thcRepository.findAll();
    }

    @Override
    public Location search(Long id) {
        return thcRepository.getById(id);
    }

    @Override
    public void deleteLocation(Location location) {
        thcRepository.delete(location);
    }
}
