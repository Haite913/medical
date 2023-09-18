package com.haite.medical.biz.controller;

import com.haite.medical.api.R.R;
import com.haite.medical.api.dto.CardDto;
import com.haite.medical.api.query.CardQuery;
import com.haite.medical.biz.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;


    /**
     * 分页查询
     *
     * @param query
     * @return
     */
    @GetMapping("/page")
    public R getPage(CardQuery query) {
        return R.ok(cardService.queryPage(query));
    }

    /**
     * 新增活动
     *
     * @param cardDto
     * @return
     */
    @PostMapping
    public R save(@RequestBody CardDto cardDto) {
        return cardService.saveCard(cardDto);
    }

    /**
     * 通过id删除活动
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable Integer id) {
        return R.ok(cardService.deleteById(id));
    }

    /**
     * 修改活动信息
     *
     * @param cardDto
     * @return
     */
    @PutMapping()
    public R updateById(@RequestBody CardDto cardDto) {
        cardService.modifyCard(cardDto);
        return R.ok("编辑成功");
    }

    /**
     * 通过id查询详情
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") Integer id) {
        return cardService.getdetailById(id);
    }
}
