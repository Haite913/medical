package com.haite.medical.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.haite.medical.api.R.R;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@TableName("record")
@EqualsAndHashCode(callSuper = true)
public class Record extends Model<Record> {
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
