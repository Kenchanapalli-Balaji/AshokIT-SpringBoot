package com.ashokit.services;

import com.ashokit.entities.EmpAddress;
import com.ashokit.entities.Employee;
import com.ashokit.repositories.EmpAddressRepo;
import com.ashokit.repositories.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private EmpAddressRepo empAddressRepo;

    @Transactional(rollbackOn = Exception.class)
    public void saveData()
    {
        Employee e1=new Employee("Sushanth",20000.50);
        Employee emp=employeeRepo.save(e1);
        //int i=10/0;
        EmpAddress ea1=new EmpAddress("KLR","AP","INDIA",emp.getEmpId());
        empAddressRepo.save(ea1);
    }

}
