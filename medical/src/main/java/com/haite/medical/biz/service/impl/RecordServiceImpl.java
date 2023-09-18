package com.haite.medical.biz.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.CardDto;
import com.haite.medical.api.dto.RecordDto;
import com.haite.medical.api.entity.Card;
import com.haite.medical.api.entity.Record;
import com.haite.medical.api.query.CardQuery;
import com.haite.medical.api.query.PageUtils;
import com.haite.medical.api.vo.CardVo;
import com.haite.medical.api.vo.detail.CardDetailVo;
import com.haite.medical.biz.mapper.CardMapper;
import com.haite.medical.biz.mapper.RecordMapper;
import com.haite.medical.biz.service.CardService;
import com.haite.medical.biz.service.RecordService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecordServiceImpl extends ServiceImpl<RecordMapper,Record> implements RecordService{

    @Override
    public void modifyRecord(RecordDto recordDto) {
        try{
            Record record=this.getById(recordDto.getId());
            BeanUtils.copyProperties(recordDto,record);
            this.updateById(record);
        }catch(Exception e){
            e.printStackTrace();
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
    public R saveRecord(RecordDto recordDto) {
        try {
            Record record = new Record();
            BeanUtils.copyProperties(recordDto, record);
            record.setDelFlag(0);
            baseMapper.saveRecord(record);
            return R.ok("新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.failed("新增失败");
        }
    }

    @Override
    public List<Record> queryList(Integer id) {
        List<Record> recordList=baseMapper.selectAll(id);
        return recordList;
    }
}
