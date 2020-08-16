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
@RequestMapping("api/v1")
public class Analytics1 {
	
	@Autowired
	private CardServiceImpl cardService;
	
	@PostMapping("/analytics1")
	public ResponseEntity<CardDto> analytic1(@RequestBody ImageBase64 data){
		CardDto result = new CardDto();
		result.setImage_str(data.getBase64Str());
		result.setAddress("512, Kim Mã, Ba Đình, Hà Nội");
		result.setDateExpiry(new Date());
		result.setDateOb(new Date());
		result.setDateRange("20/10/2018-10/10/2022");
		result.setFullname("Nguyễn Đình Hùng");
		result.setMatching("Not Matching");
		result.setStatus("NO");
		cardService.addCard(result);
		System.out.println();
		return ResponseEntity.ok().body(result);
	}


	
}
