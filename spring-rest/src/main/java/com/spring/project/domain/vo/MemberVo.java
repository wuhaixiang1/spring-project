package com.spring.project.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.spring.project.domain.entity.Member;
import com.spring.project.domain.entity.Order;
import lombok.Data;

import java.util.List;

@Data
public class MemberVo extends Member{
   private List<Order> orders;
}
