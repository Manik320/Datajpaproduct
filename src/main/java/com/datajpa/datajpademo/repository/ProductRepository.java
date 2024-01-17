package com.datajpa.datajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datajpa.datajpademo.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
}
