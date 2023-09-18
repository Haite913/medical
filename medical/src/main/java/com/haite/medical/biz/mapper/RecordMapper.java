package com.haite.medical.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haite.medical.api.entity.Card;
import com.haite.medical.api.entity.Record;
import com.haite.medical.api.query.CardQuery;
import com.haite.medical.api.vo.CardVo;
import com.haite.medical.api.vo.detail.CardDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordMapper extends BaseMapper<Record> {
    List<Record> selectAll(Integer id);

    void saveRecord(@Param("record1")Record record);
}
