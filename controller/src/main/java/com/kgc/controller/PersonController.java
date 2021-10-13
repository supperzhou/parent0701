package com.kgc.controller;


import com.kgc.Person;
import com.kgc.service.Personservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PersonController {
    @Resource
    public Personservice personservice;
    @RequestMapping("/show")
    public List<Person> getAll(){
        return personservice.getAll();
    }
}
