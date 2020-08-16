package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "license")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "matching", nullable = false)
	private String matching;

	@Column(name = "fullname", nullable = false)
	private String fullname;

	@Column(name = "address", nullable = false)
	private String address;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_ob", nullable = false)
	private Date dateOb;

	@Column(name = "date_range", nullable = false)
	private String dateRange;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_expiry", nullable = false)
	private Date dateExpiry;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "image_str", nullable = false)
	private String image_str;

}
