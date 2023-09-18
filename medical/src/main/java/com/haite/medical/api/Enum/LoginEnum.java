package com.haite.medical.api.Enum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoginEnum {
    /**
     * 未删除
     */
    UNLOGIN(0, "未登录"),

    /**
     * 删除
     */
    LOGIN(1, "登陆");

    /**
     * 审核状态
     */
    private Integer type;
    /**
     * 描述
     */
    private String status;
}
