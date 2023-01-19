package com.onetomany.person.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private List<Address> addresses;
}
