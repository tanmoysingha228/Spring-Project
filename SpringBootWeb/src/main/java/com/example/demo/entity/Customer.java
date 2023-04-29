package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DialabookCustomer")
public class Customer {
	@Id
	int cid;
	String cname;
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "customer" )
	List<Book> book;

}
