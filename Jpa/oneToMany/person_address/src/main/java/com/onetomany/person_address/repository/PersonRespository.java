package com.onetomany.person_address.repository;

import com.onetomany.person_address.enitity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface PersonRespository extends JpaRepository<PersonEntity,Long> {
}
