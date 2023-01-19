package com.onetomany.person.controller;

import com.onetomany.person.model.Person;
import com.onetomany.person.model.PersonResponse;
import com.onetomany.person.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person personResponse= personService.addPerson(person);
        return new ResponseEntity<>(personResponse, HttpStatus.OK);
    }
}
