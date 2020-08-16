package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.model.CardDto;
import com.example.demo.model.Card;
import com.example.demo.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService{
	
	@Autowired
	private CardRepository cardRp;
	
	public CardDto addCard(CardDto cardDto) {
		Card card = new Card();
		BeanUtils.copyProperties(cardDto, card);
		cardRp.save(card);
		cardDto.setId(card.getId());
		return cardDto;
	}
}
