package com.spring.car.controller;

import com.spring.car.common.RespEntity;
import com.spring.car.domain.entity.Card;
import com.spring.car.domain.vo.CardDto;
import com.spring.car.service.CardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/card")
@Api("银行卡模块的接口")
public class CardController {
    @Resource
    CardService cardService;
    @ApiOperation("添加银行卡功能")
    @PostMapping("/add")
    public RespEntity<String> add(@RequestBody CardDto cardDto) {
        String insert = cardService.insert(cardDto);
        return RespEntity.success(insert);
    }
    @ApiOperation("根据id查询功能")
    @GetMapping("/select")
    public RespEntity<Card> select(@ApiParam("银行卡Id") int cardId) {
        Card select = cardService.select(cardId);
        return RespEntity.success(select);
    }
    @PutMapping("/update")
    @ApiOperation("更新银行卡信息")
    @ApiImplicitParam(name = "银行卡", value = "以Id更新的", readOnly = true, dataType = "Card")
    public RespEntity<String> update(Card card) {
        String update = cardService.update(card);
        return RespEntity.success(update);
    }
    @DeleteMapping("/delete")
    @ApiOperation(value = "银行卡Id", notes = "根据id删除银行卡")
    public RespEntity<String> delete(int careId) {
        String delete = cardService.delete(careId);
        return RespEntity.success(delete);
    }
}
