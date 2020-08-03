package com.spring.person.controller;

import com.spring.person.common.RespEntity;
import com.spring.person.domain.entity.Person;
import com.spring.person.service.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Resource
    PersonService personService;
    @PostMapping("/add")
    public RespEntity<String> add(@RequestBody Person person) {
        String insert = personService.insert(person);
        return RespEntity.success(insert);
    }
    @GetMapping("/select")
    public RespEntity<Person> select(int personId) {
        Person select = personService.select(personId);
        return RespEntity.success(select);
    }
    @PutMapping("/update")
    public RespEntity<String> update(Person person) {
        String update = personService.update(person);
        return RespEntity.success(update);
    }
    @DeleteMapping("/delete")
    public RespEntity<String> delete(int personId) {
        String delete = personService.delete(personId);
        return RespEntity.success(delete);
    }

}
