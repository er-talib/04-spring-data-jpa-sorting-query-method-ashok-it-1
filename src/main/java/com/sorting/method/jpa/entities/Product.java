package com.sorting.method.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_details")
public class Product {

	@Id
	private int proNo;
	private String proName;
	private String proCompany;
	private String proPrice;
	private String proCompanyAddress;

}
