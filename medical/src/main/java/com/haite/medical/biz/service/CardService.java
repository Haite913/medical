package com.haite.medical.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.CardDto;
import com.haite.medical.api.entity.Card;

import com.haite.medical.api.query.CardQuery;
import com.haite.medical.api.query.PageUtils;
import com.haite.medical.api.vo.CardVo;

public interface CardService extends IService<Card> {
    PageUtils<CardVo> queryPage(CardQuery query);

    R saveCard(CardDto cardDto);

    R deleteById(Integer id);

    void modifyCard(CardDto cardDto);

    R getdetailById(Integer id);
}
