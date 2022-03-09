package com.standalone.jpa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.standalone.jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Serializable> {

}
