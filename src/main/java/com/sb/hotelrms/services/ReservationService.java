package com.sb.hotelrms.services;

import com.sb.hotelrms.data.model.Hotel;
import com.sb.hotelrms.data.model.Party;
import com.sb.hotelrms.data.model.Reservation;
import com.sb.hotelrms.data.repository.ReservationRepository;

import java.util.Date;

public class ReservationService {
    public Reservation makeReservation(Party party, Hotel hotel, Date fromDate, Date toDate){
        //validate inputs
        //perform business logic
        //store data
        //return reservation details
        Reservation reservation = new Reservation();
        reservation.setParty(party);
        reservation.setHotel(hotel);
        reservation.setFromDate(fromDate);
        reservation.setToDate(toDate);
        ReservationRepository reservationRepository = new ReservationRepository();
        reservation = reservationRepository.save(reservation);
        return reservation;
    }
}
