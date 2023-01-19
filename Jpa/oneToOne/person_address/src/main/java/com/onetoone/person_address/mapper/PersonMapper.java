package com.onetoone.person_address.mapper;

import com.onetoone.person_address.enitity.PersonEntity;
import com.onetoone.person_address.model.Person;


//@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonEntity ToEntityDto(Person person);
}
