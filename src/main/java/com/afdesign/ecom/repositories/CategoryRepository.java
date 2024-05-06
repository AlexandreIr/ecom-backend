package com.afdesign.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afdesign.ecom.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
