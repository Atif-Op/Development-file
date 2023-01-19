package com.onetomany.person_address.service;

import com.onetomany.person_address.enitity.AddressEntity;
import com.onetomany.person_address.enitity.PersonEntity;
import com.onetomany.person_address.mapper.PersonMapper;
import com.onetomany.person_address.model.Address;
import com.onetomany.person_address.model.Person;
import com.onetomany.person_address.model.PersonResponse;
import com.onetomany.person_address.repository.PersonRespository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class PersonService {
    @Autowired
    private PersonRespository personRespository;
    private PersonMapper personMapper;

    public PersonResponse addPeron(Person person) {
        log.info("person data"+person.getFirstName());
        PersonResponse personResponse = new PersonResponse();
        PersonEntity personEntity=new PersonEntity();
        AddressEntity addressEntity=new AddressEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());

//        personEntity = personMapper.toPersonEntity(person);
        personRespository.save(personEntity);
        personResponse.setPersonId(personEntity.getPerson_id());
        return personResponse;
    }
}
