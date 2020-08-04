package com.spring.car.service;

import com.spring.car.domain.entity.Card;
import com.spring.car.domain.vo.CardDto;

public interface CardService {
    String insert(CardDto cardDto);
    Card select(int personId);
    String update(Card card);
    String delete(int personId);
}
