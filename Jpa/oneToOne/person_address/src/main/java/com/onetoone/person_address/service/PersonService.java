package com.onetoone.person_address.service;

import com.onetoone.person_address.enitity.AddressEnitity;
import com.onetoone.person_address.enitity.PersonEntity;
import com.onetoone.person_address.model.Person;
import com.onetoone.person_address.model.PersonResponse;
import com.onetoone.person_address.repository.PersonRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonResponse addResource(Person person) {
        log.info("Data " + person.getFirstName());
        PersonResponse personResponse = new PersonResponse();
        PersonEntity personEntity = new PersonEntity();
        AddressEnitity addressEnitity = new AddressEnitity();
        personEntity.setFirstName(person.getFirstName());
        log.info("PersonEntity data set " + personEntity.getFirstName());

        personEntity.setLastName(person.getLastName());
        addressEnitity.setAddress1(person.getAddress().getAddress1());
        addressEnitity.setAddress2(person.getAddress().getAddress2());
        addressEnitity.setCity(person.getAddress().getCity());
        addressEnitity.setState(person.getAddress().getState());
        addressEnitity.setZipcode(person.getAddress().getZipcode());
        log.info("AddressEntity data set " + addressEnitity.getAddress1());
        personEntity.setAddress(addressEnitity);
        personRepository.save(personEntity);
        personResponse.setPersonId(personEntity.getId());
        log.info("data saved in database..." + personResponse.getPersonId());
        return personResponse;
    }
}
