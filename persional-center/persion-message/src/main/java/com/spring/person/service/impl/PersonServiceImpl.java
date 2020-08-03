package com.spring.person.service.impl;

import com.spring.person.domain.entity.Person;
import com.spring.person.mapper.PersonMapper;
import com.spring.person.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    PersonMapper personMapper;
    @Override
    public String insert(Person person) {
        String str = "插入失败";
        int insert = personMapper.insert(person);
        if (insert > 0) {
            str = "插入成功";
        }
        return str;
    }

    @Override
    public Person select(int personId) {
        Person person = personMapper.selectById(personId);
        return person;
    }
}
