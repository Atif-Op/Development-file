package com.onetoone.person_address.controller;

import com.onetoone.person_address.model.Person;
import com.onetoone.person_address.model.PersonResponse;
import com.onetoone.person_address.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/persons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponse> addResource(@RequestBody Person person) {
        PersonResponse personResponse = personService.addResource(person);
        return new ResponseEntity<>(personResponse, HttpStatus.OK);
    }
}
