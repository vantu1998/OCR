package com.example.demo.dto.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardDto {
	
	private Long id;
	private String matching;
	private String fullname;
	private String address;
	private Date dateOb;
	private String dateRange;
	private Date dateExpiry;
	private String status;
	private String image_str;
	
	public CardDto() {
		
	}
	
	public CardDto(String matching, String fullname, String address, Date dateOb, String dateRange, Date dateExpiry,
			String status, String image_str) {
		this.matching = matching;
		this.fullname = fullname;
		this.address = address;
		this.dateOb = dateOb;
		this.dateRange = dateRange;
		this.dateExpiry = dateExpiry;
		this.status = status;
		this.image_str = image_str;
	}
	
	
}
