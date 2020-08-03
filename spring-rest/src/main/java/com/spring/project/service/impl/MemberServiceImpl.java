package com.spring.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spring.project.commom.RespEntity;
import com.spring.project.domain.entity.Member;
import com.spring.project.domain.entity.Order;
import com.spring.project.domain.vo.MemberVo;
import com.spring.project.mapper.MemberMapper;
import com.spring.project.mapper.OrderMapper;
import com.spring.project.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;
    @Resource
    OrderMapper orderMapper;
    @Override
    public RespEntity<String> insert(Member member) {
        int i = memberMapper.insert(member);
        if (i > 0) {
            return RespEntity.success("插入成功666");
        }
        return RespEntity.error();
    }

    @Override
    public Member select(int memberId) {
        Member member = memberMapper.selectById(memberId);
        return member;
    }

    @Override
    public String update(Member member) {
        int update = memberMapper.updateById(member);
        if (update > 0) {
            return "更新成功666";
        }
        return "更新失败111";
    }

    @Override
    public MemberVo selectList(int memberId) {
        Member member = memberMapper.selectById(memberId);
        QueryWrapper<Order> qw = new QueryWrapper<Order>();
        qw.eq(Order.COL_MEMBER_ID, memberId);
        List<Order> orders = orderMapper.selectList(qw);
        MemberVo memberVo = new MemberVo();
        BeanUtils.copyProperties(member, memberVo);
        memberVo.setOrders(orders);
        return memberVo;
    }
}
