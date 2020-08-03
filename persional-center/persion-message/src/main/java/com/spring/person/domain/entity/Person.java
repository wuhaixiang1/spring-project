package com.spring.person.domain.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "tb_person")
public class Person {
    /**
     * 个人信息Id
     */
    @TableId(value = "person_id", type = IdType.AUTO)
    private Integer personId;

    /**
     * 昵称
     */
    @TableField(value = "person_nickname")
    private String personNickname;

    /**
     * 姓名
     */
    @TableField(value = "person_name")
    private String personName;

    /**
     * 性别
     */
    @TableField(value = "person_gender")
    private String personGender;

    /**
     * 生日
     */
    @TableField(value = "person_birthday")
    private Date personBirthday;

    /**
     * 电话
     */
    @TableField(value = "person_phon")
    private String personPhon;

    /**
     * 电子邮件
     */
    @TableField(value = "person_email")
    private String personEmail;

    /**
     * 头像
     */
    @TableField(value = "person_icon")
    private String personIcon;

    /**
     * 0为正常数据,1为删除的数据
     */
    @TableField(value = "is_delete")
    @TableLogic
    private Integer isDelete;

    public static final String COL_PERSON_ID = "person_id";

    public static final String COL_PERSON_NICKNAME = "person_nickname";

    public static final String COL_PERSON_NAME = "person_name";

    public static final String COL_PERSON_GENDER = "person_gender";

    public static final String COL_PERSON_BIRTHDAY = "person_birthday";

    public static final String COL_PERSON_PHON = "person_phon";

    public static final String COL_PERSON_EMAIL = "person_email";

    public static final String COL_PERSON_ICON = "person_icon";

    public static final String COL_IS_DELETE = "is_delete";
}