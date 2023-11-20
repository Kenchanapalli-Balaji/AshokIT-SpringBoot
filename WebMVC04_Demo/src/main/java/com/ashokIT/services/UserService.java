package com.ashokIT.services;

import com.ashokIT.entities.User;
import com.ashokIT.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepo userRepo;
    public boolean saveUser(User user)
    {
        userRepo.save(user);
        return user.getId()>0;
    }
    public List<User> getAllUsers()
    {
        return userRepo.findAll();
    }

}
