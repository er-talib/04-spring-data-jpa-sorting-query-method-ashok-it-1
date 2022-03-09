package com.sorting.method.jpa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sorting.method.jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Serializable> {

}
