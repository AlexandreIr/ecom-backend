package com.afdesign.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afdesign.ecom.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
