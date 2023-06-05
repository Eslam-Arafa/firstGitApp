package com.example.SpringExample2.services;

import com.example.SpringExample2.entities.Employee;
import com.example.SpringExample2.repositories.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    Repo repo;

    public void addEmps(){
        repo.save(new Employee("Eslam", "khanka"));
        repo.save(new Employee("Ali", "Gabal"));
        repo.save(new Employee("Sayed", "Marg"));
    }

    public void deleteAll(){
        repo.deleteAll();
    }

}
