package com.example.SpringExample2.repositories;

import com.example.SpringExample2.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Employee, Long> {
//    ArrayList<Employee> findAllEmployee();
}
