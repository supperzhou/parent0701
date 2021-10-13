package com.kgc.service.impl;

import com.kgc.Person;
import com.kgc.mapper.PersonMapper;
import com.kgc.service.Personservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Personserviceimpl implements Personservice {
    @Resource
    PersonMapper personMapper;
    @Override
    public List<Person> getAll() {
        return personMapper.getAll();
    }
}
