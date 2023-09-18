package com.haite.medical.api.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RecordDto {
    /**
     * id
     */
    @TableId
    private Integer id;
    /**
     * 会员卡Id
     */
    private Integer cardId;
    /**
     * 使用日期
     */
    private LocalDate useDate;
    /**
     * 消费备注
     */
    private String project;
    /**
     * 备注
     */
    private String remark;
    /**
     * 余次
     */
    private String remain;

    /**
     * 姓名
     */
    private String name;
    /**
     * 删除标识
     */
    @TableLogic
    private int delFlag;
}
