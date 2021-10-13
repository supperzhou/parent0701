package com.kgc.service;

import com.kgc.Person;

import javax.annotation.Resource;
import java.util.List;

public interface Personservice {
    @Resource
    public List<Person> getAll();
}
