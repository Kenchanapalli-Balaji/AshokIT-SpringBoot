package com.ashokit.services;

import com.ashokit.entities.PersonEntity;
import com.ashokit.entities.PersonPK;
import com.ashokit.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService
{
    @Autowired
    private PersonRepo personRepo;

    public void savePerson()
    {
        PersonPK pk1=new PersonPK(909876440088l,"DEF123");
        PersonEntity p1=new PersonEntity("Meena","kurllapallimeena123@gmail.com",pk1);
        personRepo.save(p1);
    }
    public void getPersons()
    {
       List<PersonEntity> persons= personRepo.findAll();
       persons.forEach(p->{System.out.println(p);});
    }
    public  void getPerson()
    {
        PersonPK pk1=new PersonPK(909876440099l,"ABC123");
        Optional<PersonEntity> findById=personRepo.findById(pk1);
        if(findById.isPresent())
        {
            System.out.println(findById.get());
        }
        else {
            System.out.println("The data does not exist with given Primary data");
        }
    }


}
