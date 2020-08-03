package com.spring.project;


import com.spring.project.commom.RespEntity;
import com.spring.project.controller.MemberController;
import com.spring.project.domain.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class RestApplicationTest {
    @Resource
    MemberController memberController;
    @Test
    public void test() {
//        Member member = new Member();
//        member.setEmail("124234@4567");
//        member.setNickname("8888");
//        RespEntity<String> add = memberController.add(member);
        RespEntity<Member> select = memberController.select(23);
        log.info(select.toString());
        log.info("12345678912345678923456789");
        System.out.println(select);
        System.out.println("1234567890");
    }
}