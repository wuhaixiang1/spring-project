package com.spring.project.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "my_order")
public class Order {
    /**
     * 外键字段
     */
    @TableField(value = "member_id")
    private Integer memberId;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Integer orderId;

    /**
     * 订单物品是
     */
    @TableField(value = "order_item")
    private String orderItem;

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_ORDER_ITEM = "order_item";
}