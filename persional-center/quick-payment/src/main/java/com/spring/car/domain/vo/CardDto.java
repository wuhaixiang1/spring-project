package com.spring.car.domain.vo;

import com.spring.car.domain.entity.Card;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("把参数封装为银行卡对象")
@Data
public class CardDto {
    /**
     * 银行卡id
     */
    @ApiModelProperty("银行卡id")
    private Integer cardId;

    /**
     * 用户id
     */
    @ApiModelProperty("外键id")
    private Integer personId;

    /**
     * 真实姓名
     */

    private String cardName;

    /**
     * 手机号码
     */

    private String carPhon;

    /**
     * 身份证
     */

    private String idCard;

    /**
     * 0为正常数据,1为删除的数据
     */

    private Integer isDelete;

    private Integer is;

    private Integer delete;

}
