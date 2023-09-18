package com.haite.medical.biz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.RecordDto;
import com.haite.medical.api.entity.Card;
import com.haite.medical.api.entity.Record;

import java.util.List;

public interface RecordService extends IService<Record> {
    void modifyRecord(RecordDto recordDto);

    R deleteById(Integer id);

    R saveRecord(RecordDto recordDto);

    List<Record> queryList(Integer id);
}
