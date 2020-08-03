package com.spring.project.controller;

import com.spring.project.commom.RespEntity;
import com.spring.project.domain.entity.Member;
import com.spring.project.domain.vo.MemberVo;
import com.spring.project.mapper.OrderMapper;
import com.spring.project.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/member")
@Slf4j
public class MemberController {
    @Resource
    MemberService memberService;
    @PostMapping("add")
    public RespEntity<String> add(@RequestBody Member member) {
        return memberService.insert(member);
    }

    @PutMapping("/update")
    public RespEntity<String> update(@RequestBody Member member) {
        String update = memberService.update(member);
        return RespEntity.success(update);
    }

    @GetMapping("/select")
    public RespEntity<Member> select(int memberId) {
        log.info("123456789012345678901234567890");
        log.info("12345678912345678923456789");
        Member select = memberService.select(memberId);
        return RespEntity.success(select);
    }

    @GetMapping("/memberVo")
    public RespEntity<MemberVo> selectMemberVO(int memberId) {
        MemberVo memberVo = memberService.selectList(memberId);
        return RespEntity.success(memberVo);
    }
}
