package com.example.demo.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.model.CardDto;
import com.example.demo.dto.model.ImageBase64;
import com.example.demo.dto.model.Result3;
import com.example.demo.service.CardServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class Analytics3 {

	@Autowired
	private CardServiceImpl cardService;
	
	@PostMapping("/analytics3")
	public ResponseEntity<Result3> analytic3(@RequestBody ImageBase64 data){
		CardDto result = new CardDto();
		result.setImage_str(data.getBase64Str());
		result.setAddress("10, Trần Phú, Hà Đông, Hà Nội");
		result.setDateExpiry(new Date());
		result.setDateOb(new Date());
		result.setDateRange("10/10/2018-10/10/2023");
		result.setFullname("Hoàng Thị Nguyệt");
		result.setMatching("Matching");
		result.setStatus("OK");
		cardService.addCard(result);
		Random rd = new Random();
		float number = rd.nextFloat() * 100;
		String percent = String.format("%.2f", number);
		Result3 res = new Result3(percent);
		return ResponseEntity.ok().body(res);
	}
}
