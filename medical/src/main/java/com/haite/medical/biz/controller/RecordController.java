package com.haite.medical.biz.controller;

import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.CardDto;
import com.haite.medical.api.dto.RecordDto;
import com.haite.medical.api.query.CardQuery;
import com.haite.medical.biz.service.CardService;
import com.haite.medical.biz.service.RecordService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/record")
public class RecordController {

    private final RecordService recordService;


    /**
     * 分页查询
     *
     * @return
     */
    @GetMapping("/{id}")
    public R getPage(@PathVariable Integer id) {
        return R.ok(recordService.queryList(id));
    }

    /**
     * 新增活动
     *
     * @param recordDto
     * @return
     */
    @PostMapping
    public R save(@RequestBody RecordDto recordDto) {
        return recordService.saveRecord(recordDto);
    }

    /**
     * 通过id删除活动
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable Integer id) {
        return R.ok(recordService.deleteById(id));
    }

    /**
     * 修改活动信息
     *
     * @param recordDto
     * @return
     */
    @PutMapping()
    public R updateById(@RequestBody RecordDto recordDto) {
        recordService.modifyRecord(recordDto);
        return R.ok("编辑成功");
    }

}
