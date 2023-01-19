package com.onetomany.person_address.mapper;

import com.onetomany.person_address.enitity.AddressEntity;
import com.onetomany.person_address.enitity.PersonEntity;
import com.onetomany.person_address.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEntity toPersonEntity(Person person);

  //  AddressEntity toAddressEntity(Person person);
}
