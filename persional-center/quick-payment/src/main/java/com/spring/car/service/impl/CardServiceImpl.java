package com.spring.car.service.impl;

import com.spring.car.common.RespCode;
import com.spring.car.domain.entity.Card;
import com.spring.car.domain.vo.CardDto;
import com.spring.car.exception.ServiceException;
import com.spring.car.mapper.CardMapper;
import com.spring.car.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class CardServiceImpl implements CardService {
    @Resource
    CardMapper cardMapper;
    @Override
    public String insert(CardDto cardDto) {
        Card card = new Card();
        BeanUtils.copyProperties(cardDto, card);
        int insert = cardMapper.insert(card);
        String str = "插入失败";
        if (insert > 0) {
            str = "插入成功";
        }
        log.info("影响行数" + insert);
        return str;
    }

    @Override
    public Card select(int personId) {
        Card card = cardMapper.selectById(personId);
        if (card == null) {
            throw new ServiceException(RespCode.DATA_IS_WRONG);
        }
        return card;
    }

    @Override
    public String update(Card card) {
        int i = cardMapper.updateById(card);
        String str = "更新失败";
        if (i > 0) {
            str = "更新成功";
        }
        return str;
    }

    @Override
    public String delete(int personId) {
        int i = cardMapper.deleteById(personId);
        String str = "删除失败";
        if (i > 0) {
            str = "删除成功";
        }
        return str;
    }
}
