package com.example.SpringExample2.controllers;

import com.example.SpringExample2.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    MyService serv;

    @PostMapping("/")
    public void add() {
        serv.addEmps();
    }

    @DeleteMapping("/")
    public void deleteAll(){
        serv.deleteAll();
    }

}
