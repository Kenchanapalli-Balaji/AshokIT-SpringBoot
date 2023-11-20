package com.ashokit.services;

import com.ashokit.entity.Passport;
import com.ashokit.entity.Person;
import com.ashokit.repos.PassportRepo;
import com.ashokit.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PersonService
{
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private PassportRepo passportRepo;

    public void saveData()
    {
        Person p1=new Person("Balaji","male");
        Passport passport1=new Passport("ABC123", LocalDate.now(), LocalDate.now().plusYears(10));
        p1.setPassport(passport1);
        passport1.setPerson(p1);
        personRepo.save(p1);
    }

}
