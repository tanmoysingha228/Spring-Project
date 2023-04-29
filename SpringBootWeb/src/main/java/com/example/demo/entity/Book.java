package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="Dialabookstore")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	@Id
	int bid;
	String bname;
	int bprice;
	@ManyToOne(cascade = CascadeType.ALL ,fetch = FetchType.EAGER )
	
	Customer customer;
	

}

