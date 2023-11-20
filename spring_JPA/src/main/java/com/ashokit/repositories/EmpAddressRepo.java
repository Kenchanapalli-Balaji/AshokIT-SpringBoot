package com.ashokit.repositories;

import com.ashokit.entities.EmpAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpAddressRepo extends JpaRepository<EmpAddress,Integer> {
}
