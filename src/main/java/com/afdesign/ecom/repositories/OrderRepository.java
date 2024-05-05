package com.afdesign.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afdesign.ecom.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
