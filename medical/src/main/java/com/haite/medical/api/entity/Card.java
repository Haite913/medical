package com.haite.medical.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@TableName("card")
@EqualsAndHashCode(callSuper = true)
public class Card extends Model<Card> {
    /**
     * id
     */
    @TableId
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别 0男性 1女性
     */
    private Integer gender;

    /**
     * 生日
     */
    private LocalDate birth;

    /**
     * 电话
     */
    private String phone;


    /**
     * 开卡日期
     */
    private LocalDate open;

    /**
     * 开卡项目
     */
    private String project;

    /**
     * 备注
     */
    private String remark;
    /**
     * 删除标识
     */
    @TableLogic
    private int delFlag;
}
