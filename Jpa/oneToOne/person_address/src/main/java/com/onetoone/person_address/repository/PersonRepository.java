package com.onetoone.person_address.repository;

import com.onetoone.person_address.enitity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
