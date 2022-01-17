package com.sb.hotelrms.data.model;

import lombok.Data;

import java.util.Date;

@Data
public class Reservation {
    private Party party;
    private Hotel hotel;
    private Date fromDate;
    private Date toDate;
    private String confirmationNumber;
}
