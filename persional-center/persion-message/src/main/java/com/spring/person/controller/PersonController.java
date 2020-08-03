package com.spring.person.controller;

import com.spring.person.common.RespEntity;
import com.spring.person.domain.entity.Person;
import com.spring.person.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Resource
    PersonService personService;
    @PostMapping("/add")
    public RespEntity<String> add(Person person) {
        String insert = personService.insert(person);
        return RespEntity.success(insert);
    }
    @GetMapping("/select")
    public RespEntity<Person> select(int personId) {
        Person select = personService.select(personId);
        return RespEntity.success(select);
    }

}
