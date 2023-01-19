package com.onetomany.person.respositoy;

import com.onetomany.person.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRespository extends JpaRepository<PersonEntity,Long> {
}
