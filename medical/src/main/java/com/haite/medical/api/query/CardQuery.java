package com.haite.medical.api.query;


import lombok.Data;

@Data
public class CardQuery extends PageForm {
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
}
