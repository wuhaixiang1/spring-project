package com.spring.person.service;


import com.spring.person.domain.entity.Person;

public interface PersonService {
    String insert(Person person);
    Person select(int personId);
    String update(Person person);
    String delete(int personId);
}
