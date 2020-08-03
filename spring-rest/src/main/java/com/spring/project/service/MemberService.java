package com.spring.project.service;

import com.spring.project.commom.RespEntity;
import com.spring.project.domain.entity.Member;
import com.spring.project.domain.vo.MemberVo;

public interface MemberService {
    RespEntity<String> insert(Member member);
    Member select(int memberId);
    String update(Member member);
    MemberVo selectList(int memberId);
}
