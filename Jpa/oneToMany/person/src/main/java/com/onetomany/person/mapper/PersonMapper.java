package com.onetomany.person.mapper;

import com.onetomany.person.entity.AddressEntity;
import com.onetomany.person.entity.PersonEntity;
import com.onetomany.person.model.Address;
import com.onetomany.person.model.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonEntity modelToEntity(Person person);

    List<AddressEntity> toAddressEntity(List<Address> address);
}
