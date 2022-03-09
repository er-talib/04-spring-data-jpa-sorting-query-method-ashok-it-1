package com.standalone.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.standalone.jpa.entities.Product;
import com.standalone.jpa.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository bean = context.getBean(ProductRepository.class);

		/*
		 * Insert Data in database Product product1 = new
		 * Product(121,"Mobile","MI","8500","China"); Product product2 = new
		 * Product(122,"Android Mobile","VIVO","12040","China"); Product product3 = new
		 * Product(123,"Bike","Bajaj","85000","India"); Product product4 = new
		 * Product(124,"Watch","Apple","45500","USA"); Product product5 = new
		 * Product(125,"Laptop","Microsoft","125000","USA"); Product product6 = new
		 * Product(126,"Tata","Car","1250000","India");
		 * 
		 * List<Product> productList = new ArrayList<>(); productList.add(product1);
		 * productList.add(product2); productList.add(product3);
		 * productList.add(product4); productList.add(product5);
		 * productList.add(product6);
		 * 
		 * bean.saveAllAndFlush(productList);
		 */

		// Retrive and sort data by using JpaRepository

		/*
		 * 1 List<Product> findAll = bean.findAll(Sort.by("proPrice").descending()); //
		 * List<Product> findAll = bean.findAll(); findAll.forEach(sortedRecord -> {
		 * System.out.println(sortedRecord); });
		 */

		// Retrive and sort data by using multiple ways in one logic

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				" If you sort by high to low price enter:  1 \n If you sort by compay name enter:  2 \n If you sort by low to high price enter: 3");
		int number = scanner.nextInt();

		switch (number) {
		
		case 1:
			List<Product> findAll = bean.findAll(Sort.by("proPrice").descending());
			findAll.forEach(sortedRecord -> {
				System.out.println(sortedRecord);
			});

			break;

		case 2:

			List<Product> findAllCom = bean.findAll(Sort.by("proName").ascending());
			findAllCom.forEach(sortedRecordCom -> {
				System.out.println(sortedRecordCom);
			});
			break;

		case 3:

			List<Product> findAllPrice = bean.findAll(Sort.by("proPrice").ascending());
			findAllPrice.forEach(sortedRecordPrice -> {
				System.out.println(sortedRecordPrice);
			});
			break;

		default:

			List<Product> all = bean.findAll(Sort.by("proNo").ascending());
			all.forEach(sortedRecord -> {
				System.out.println(sortedRecord);
			});
			break;
		}
		

	}

}
