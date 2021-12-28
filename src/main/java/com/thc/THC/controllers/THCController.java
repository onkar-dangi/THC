package com.thc.THC.controllers;

import com.thc.THC.models.Location;
import com.thc.THC.services.THCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/THC")
public class THCController {

    @Autowired
    private THCService thcService;

    public THCController(THCService thcService) {
        this.thcService = thcService;
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
        thcService.addLocation(location);
        return true;
    }

    @PostMapping("/delete")
    public void deleteLocation(Location location) {
        thcService.deleteLocation(location);
    }

}
