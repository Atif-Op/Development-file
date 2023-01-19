package com.onetomany.person_address.enitity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "person_table")
public class PersonEntity {

    @Id
    @SequenceGenerator(name = "seq_person_id", initialValue = 1, sequenceName = "seq_person_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_person_id")
    private Long person_id;
    private String firstName;
    private String lastName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "person")
    private List<AddressEntity> addresses;
}
