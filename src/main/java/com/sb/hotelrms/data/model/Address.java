package com.sb.hotelrms.data.model;

import lombok.Data;

@Data
public class Address {
    private String streetName;
    private String streetNo;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
