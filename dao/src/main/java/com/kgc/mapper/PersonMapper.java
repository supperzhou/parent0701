package com.kgc.mapper;

import com.kgc.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PersonMapper {
    public List<Person> getAll();
}
