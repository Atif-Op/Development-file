package com.onetomany.person.service;

import com.onetomany.person.entity.AddressEntity;
import com.onetomany.person.entity.PersonEntity;
import com.onetomany.person.mapper.PersonMapper;
import com.onetomany.person.model.Address;
import com.onetomany.person.model.Person;
import com.onetomany.person.model.PersonResponse;
import com.onetomany.person.respositoy.PersonRespository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Log4j2
public class PersonService {
    private final PersonMapper personMapper;
    private final PersonRespository personRespository;

    public PersonService(PersonMapper personMapper, PersonRespository personRespository) {
        this.personMapper = personMapper;
        this.personRespository = personRespository;
    }

    public Person addPerson(Person person) {
        log.info(person.getFirstName());
        PersonResponse personResponse = new PersonResponse();
        PersonEntity personEntity=personMapper.modelToEntity(person);
        List<Address> getAddress=person.getAddresses();
        List<AddressEntity> addressEntities = personMapper.toAddressEntity(person.getAddresses());
        personEntity.setAddresses(addressEntities);

        personRespository.save(personEntity);
        personResponse.setPersonId(personEntity.getPerson_id());
        return person;
    }
}
