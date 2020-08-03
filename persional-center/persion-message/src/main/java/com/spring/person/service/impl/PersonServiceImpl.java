package com.spring.person.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.spring.person.domain.entity.Person;
import com.spring.person.mapper.PersonMapper;
import com.spring.person.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@DS("master")
@Slf4j
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
        log.info("影响行数" + insert);
        return str;
    }

    @Override
    @DS("slave")
    public Person select(int personId) {
        Person person = personMapper.selectById(personId);
        log.info(person.toString());
        return person;
    }

    @Override
    public String update(Person person) {
        String str = "更新失败";
        int i = personMapper.updateById(person);
        if (i > 0) {
            str = "更新成功";
        }
        log.info("影响行数" + i);
        return str;
    }

    @Override
    public String delete(int personId) {
        String str = "删除失败";
        int i = personMapper.deleteById(personId);
        if (i > 0) {
            str = "删除成功";
        }
        log.info("影响行数" + i);
        return str;
    }
}
