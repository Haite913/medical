package com.haite.medical.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haite.medical.api.entity.Card;
import com.haite.medical.api.query.CardQuery;
import com.haite.medical.api.vo.CardVo;
import com.haite.medical.api.vo.detail.CardDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CardMapper extends BaseMapper<Card> {
    IPage<CardVo> queryPage(Page<CardVo> page, @Param("query") CardQuery query);

    CardDetailVo getStimDetialId(Integer id);

    void saveCard(@Param("card1") Card card);
}
