package com.thc.THC.controllers;

import com.thc.THC.models.*;
import com.thc.THC.services.*;
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
    @Autowired
    private OpenHoursService openHoursService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private FoodItemService foodItemService;

    public THCController(THCService thcService, ReservationService reservationService, OpenHoursService openHoursService, MenuService menuService, FoodItemService foodItemService) {
        this.thcService = thcService;
        this.reservationService = reservationService;
        this.openHoursService = openHoursService;
        this.menuService = menuService;
        this.foodItemService = foodItemService;
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
    public boolean addLocation(@RequestBody Location location) {
        System.out.println(location);
        thcService.addLocation(location);
        return true;
    }

    @PostMapping("/delete")
    public void deleteLocation(@RequestBody Location location) {
        thcService.deleteLocation(location);
    }

    @PostMapping("/reservation")
    public boolean addReservation(@RequestBody Reservation reservation) {
        System.out.println(reservation);
        reservationService.addReservation(reservation);
        return true;
    }

    @PostMapping("/reservation/{id}")
    public boolean deleteReservation(@PathVariable Long id) {
        System.out.println(id);
        reservationService.deleteReservation(id);
        return true;
    }

    @GetMapping("/reservation")
    public List<Reservation> getReservations() {
        return reservationService.getReservation();
    }

    @PostMapping("/addHours")
    public boolean addHours(@RequestBody OpenHours openHours) {
        openHoursService.addTime(openHours);
        System.out.println(openHours);
        return true;
    }

    @PostMapping("/openHours/{id}")
    public boolean removeHours(@PathVariable Long id) {
        openHoursService.remove(id);
        return true;
    }

    @GetMapping("/menus")
    public List<Menu> getMenus() {
        return menuService.getMenu();
    }

    @PostMapping("/menu/{id}")
    public boolean removeMenu(@PathVariable Long id) {
        menuService.removeMenu(id);
        return true;
    }

    @PostMapping("/menu")
    public boolean addMenu(@RequestBody Menu menu) {
        menuService.addMenu(menu);
        return true;
    }

    @PostMapping("/fooditem/{id}")
    public boolean deleteFood(@PathVariable Long id) {
        foodItemService.removeFoodItem(id);
        return true;
    }

    @PostMapping("/fooditem")
    public boolean addFood(FoodItem foodItem) {
        foodItemService.addFoodItem(foodItem);
        return true;
    }
}
