package com.ashokit.repositories;

import com.ashokit.entities.PersonEntity;
import com.ashokit.entities.PersonPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<PersonEntity, PersonPK>
{

}
