package com.afdesign.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afdesign.ecom.entities.OrderItem;
import com.afdesign.ecom.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
