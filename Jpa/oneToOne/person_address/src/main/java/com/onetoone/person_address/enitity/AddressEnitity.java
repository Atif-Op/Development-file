package com.onetoone.person_address.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressEnitity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
//    @OneToOne(mappedBy = "address")
//    private PersonEntity person;
}
