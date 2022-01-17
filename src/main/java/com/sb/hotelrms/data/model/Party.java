package com.sb.hotelrms.data.model;

import lombok.Data;

import java.util.List;
@Data
public class Party {
    private User primaryContact;
    private List<User> members;

}
