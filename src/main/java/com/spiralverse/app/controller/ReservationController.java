package com.spiralverse.app.controller;

import com.spiralverse.app.model.Reservation;
import com.spiralverse.app.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    private ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations")
    public Iterable<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

}
