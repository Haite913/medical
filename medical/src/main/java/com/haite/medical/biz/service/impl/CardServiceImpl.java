package com.haite.medical.biz.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.CardDto;
import com.haite.medical.api.entity.Card;
import com.haite.medical.api.query.PageUtils;
import com.haite.medical.api.query.CardQuery;
import com.haite.medical.api.vo.CardVo;
import com.haite.medical.api.vo.detail.CardDetailVo;
import com.haite.medical.biz.mapper.CardMapper;
import com.haite.medical.biz.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardServiceImpl extends ServiceImpl<CardMapper,Card> implements CardService {

    @Override
    public PageUtils<CardVo> queryPage(CardQuery query) {
        Page<CardVo> page = new Page<>(query.getPageNumber(),query.getPageSize());
        IPage<CardVo> iPage=baseMapper.queryPage(page,query);
        return new PageUtils<>(iPage);
    }

    @Override
    public R saveCard(CardDto cardDto) {
        try {
            Card card = new Card();
            BeanUtils.copyProperties(cardDto, card);
            card.setDelFlag(0);
            baseMapper.saveCard(card);
            return R.ok("新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.failed("新增失败");
        }
    }

    @Override
    public R deleteById(Integer id) {
        try{
            this.removeById(id);
            return R.ok("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.ok("删除失败");
        }
    }

    @Override
    public void modifyCard(CardDto cardDto) {
        try{
            Card card=this.getById(cardDto.getId());
            BeanUtils.copyProperties(cardDto,card);
            this.updateById(card);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public R getdetailById(Integer id) {
        try {
            CardDetailVo cardDetailVo = baseMapper.getStimDetialId(id);
            return R.ok(cardDetailVo, "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.failed("查询失败");
        }
    }


}
