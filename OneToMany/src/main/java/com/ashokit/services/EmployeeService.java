package com.ashokit.services;

import com.ashokit.entities.Address;
import com.ashokit.entities.Employee;
import com.ashokit.repos.AddressRepo;
import com.ashokit.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private AddressRepo addressRepo;

    public void saveData()
    {
        Employee emp1=new Employee("Balaji",25000.00);

        Address adr1=new Address("BNG","KA","present");
        adr1.setEmployee(emp1); // setting employee to address
        Address adr2=new Address("KLR","AP","permanent");
        adr2.setEmployee(emp1);  // setting employee to address

        List<Address> adrList=Arrays.asList(adr1,adr2);
        emp1.setAddresses(adrList); //setting address list to Employee

        employeeRepo.save(emp1);
    }

    public void getEmpData()
    {
       Optional<Employee> findById= employeeRepo.findById(1);
    }

    public void getAddrData()
    {
        Optional<Address> res=addressRepo.findById(1);
        if(res.isPresent())
        {
            System.out.println(res);
        }
    }


}
