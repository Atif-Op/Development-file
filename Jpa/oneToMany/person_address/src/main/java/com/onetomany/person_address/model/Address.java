package com.onetomany.person_address.model;

import lombok.Data;

@Data
public class Address {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private long zipCode;

}
