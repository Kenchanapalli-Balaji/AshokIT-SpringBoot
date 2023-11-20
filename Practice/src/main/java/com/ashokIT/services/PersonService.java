package com.ashokIT.services;

import com.ashokIT.entities.Address;
import com.ashokIT.entities.Passport;
import com.ashokIT.entities.Person;
import com.ashokIT.repo.AddressRepo;
import com.ashokIT.repo.PassportRepo;
import com.ashokIT.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService
{
    @Autowired
    public PersonRepo personRepo;
    @Autowired
    public PassportRepo passportRepo;
    @Autowired
    public AddressRepo addressRepo;

    public void savePerson()
    {
        Person person1=new Person("Meena");
        Passport passport1=new Passport(123456, LocalDateTime.now(),LocalDateTime.now().plusYears(10));
        Address address1=new Address("Hindupur","AP","Permanent");
        Address address2=new Address("Bangalore","KA","temprory");
        Address address3=new Address("Whitefield","KA","Office");
        List<Address> list= Arrays.asList(address1,address2,address3);
        address1.setPerson(person1);
        address2.setPerson(person1);
        address3.setPerson(person1);
        passport1.setPerson(person1);
        person1.setAddresses(list);
        person1.setPassport(passport1);
        passportRepo.save(passport1);
    }

}
