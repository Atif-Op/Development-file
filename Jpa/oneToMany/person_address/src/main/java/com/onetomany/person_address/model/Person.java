package com.onetomany.person_address.model;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private List<Address> addresses;
}
