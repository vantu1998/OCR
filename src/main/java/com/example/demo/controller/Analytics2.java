package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.model.CardDto;
import com.example.demo.dto.model.ImageBase64;
import com.example.demo.service.CardServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class Analytics2 {
	
	@Autowired
	private CardServiceImpl cardService;
	
	@PostMapping("/analytics2")
	public ResponseEntity<CardDto> analytics2(@RequestBody ImageBase64 data){
		CardDto result = new CardDto();
		result.setImage_str(data.getBase64Str());
		result.setAddress("Số 80, Thanh Bình, Hà Đông, Hà Nội");
		result.setDateExpiry(new Date());
		result.setDateOb(new Date());
		result.setDateRange("10/10/2019-10/10/2020");
		result.setFullname("Dinh Cong Huy");
		result.setMatching("Not Matching");
		result.setStatus("OK");
		cardService.addCard(result);
		System.out.println();
		return ResponseEntity.ok().body(result);
	}
}
