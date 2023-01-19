package com.onetomany.person.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address_table")
public class AddressEntity {

    @Id
    @SequenceGenerator(name = "seq_address_id", initialValue = 1, sequenceName = "seq_address_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_address_id")
    private Long address_id;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private long zipCode;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;
}
