package com.ashokit.services;

import com.ashokit.entities.ContactsEntity;
import com.ashokit.repositories.ContactsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ContactsService
{
    @Autowired
    private ContactsRepo contactsRepo;
    public void saveUsers()
    {
        ContactsEntity entity1=new ContactsEntity();
        entity1.setContactId(105);
        entity1.setContactName("Deekshith");
        entity1.setContactNumber(258);

        ContactsEntity entity2=new ContactsEntity();
        entity2.setContactId(106);
        entity2.setContactName("Vishnu");
        entity2.setContactNumber(852);

        List<ContactsEntity> list= Arrays.asList(entity1,entity2);
        contactsRepo.saveAll(list);
    }
    public  void deleteUser()
    {
        contactsRepo.deleteById(105);
       // contactsRepo.deleteAllById(Arrays.asList(101,102));
       // contactsRepo.deleteAll();
    }

    public void getUser()
    {
        Optional<ContactsEntity> findById=contactsRepo.findById(101);
        if(findById.isPresent())
            System.out.println(findById.get());
        else
            System.out.println("No record found with the given Id");

    }
    public void getUsers()
    {
        List<Integer> ids=Arrays.asList(101,102,103,104);
        Iterable<ContactsEntity> list=contactsRepo.findAllById(ids);
        list.forEach(e->
                {
                    System.out.println(e);
                }
                );
    }
    public void test()
    {
        System.out.println(contactsRepo.count());
        System.out.println(contactsRepo.existsById(101));
    }

    public void testFindByMethods1()
    {
       List<ContactsEntity> list= contactsRepo.findByContactName("Meena");
       list.forEach(e->System.out.println(e));
    }
    public void testFindByMethods2()
    {
        ContactsEntity entities=contactsRepo.findByContactNumber(12345);
        System.out.println(entities);
    }

    public void customQuiries()
    {
        List<ContactsEntity> entities=contactsRepo.getAllUsersSql("Meena");
        entities.forEach(e->System.out.println(e));
    }

}
