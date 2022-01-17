package com.sb.hotelrms.controller;

import com.sb.hotelrms.data.model.Hotel;
import com.sb.hotelrms.data.model.Party;
import com.sb.hotelrms.data.model.Reservation;
import com.sb.hotelrms.data.model.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationControllerTest {
    @Test
    public void testMakeReservation(){
        User user = new User();
        user.setEmail("email@email.com");
        user.setFirstName("first name");
        User user1 = new User();
        user1.setEmail("email1@email.com");
        user1.setFirstName("first name1");
        Party party = new Party();
        party.setPrimaryContact(user);
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        party.setMembers(list);
        LocalDate fromLocalDate = LocalDate.of(2022,01,01);
        LocalDate toLocalDate = LocalDate.of(2022,01,03);
        ReservationController reservationController = new ReservationController();
        Hotel hotel = new Hotel();
        //default time zone
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Date fromDate = Date.from(fromLocalDate.atStartOfDay(defaultZoneId).toInstant());
        Date toDate = Date.from(fromLocalDate.atStartOfDay(defaultZoneId).toInstant());
        Reservation reservation = reservationController.makeReservation(party, hotel, fromDate, toDate);
        System.out.println(reservation.getConfirmationNumber());
        assertNotNull(reservation.getConfirmationNumber());


    }

}
