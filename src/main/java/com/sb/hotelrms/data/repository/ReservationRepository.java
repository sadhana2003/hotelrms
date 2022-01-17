package com.sb.hotelrms.data.repository;

import com.sb.hotelrms.data.model.Reservation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReservationRepository {
    public Reservation save(Reservation reservation){
        System.out.println("saving reservation " + reservation.toString());
        reservation.setConfirmationNumber(LocalDateTime.now().toString());
        return reservation;
    }
}
