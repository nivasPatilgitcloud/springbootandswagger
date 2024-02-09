package com.spring.swaggerex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.swaggerex.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
