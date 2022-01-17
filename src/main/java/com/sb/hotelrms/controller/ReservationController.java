package com.sb.hotelrms.controller;

import com.sb.hotelrms.data.model.Hotel;
import com.sb.hotelrms.data.model.Party;
import com.sb.hotelrms.data.model.Reservation;
import com.sb.hotelrms.services.ReservationService;

import java.security.Provider;
import java.util.Date;

public class ReservationController {
    public Reservation makeReservation(Party party, Hotel hotel, Date fromDate, Date toDate){
        //validate inputs
        //perform business logic
        //store data
        //return reservation details
        ReservationService reservationService = new ReservationService();
        Reservation reservation = reservationService.makeReservation(party, hotel, fromDate, toDate);
        return reservation;
    }
}
