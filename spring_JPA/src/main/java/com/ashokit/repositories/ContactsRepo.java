package com.ashokit.repositories;

import com.ashokit.entities.ContactsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactsRepo extends CrudRepository<ContactsEntity,Integer>
{
    //select * from contacts where contactName=name;
    public List<ContactsEntity> findByContactName(String contactName);
    public ContactsEntity findByContactNumber(Integer contactnumber);

    @Query(value="From ContactsEntity")
    public List<ContactsEntity> getAllUsersHql();

    @Query(value="select * from contacts where contact_name=? ",nativeQuery = true)
    public  List<ContactsEntity> getAllUsersSql(String name);


}
