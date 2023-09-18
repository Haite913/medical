package com.haite.medical.api.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CardVo {

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
     * 电话
     */
    private String phone;

    /**
     * 生日
     */
    private LocalDate birth;
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
}
