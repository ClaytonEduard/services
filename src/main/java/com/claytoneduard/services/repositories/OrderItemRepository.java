package com.claytoneduard.services.repositories;

import com.claytoneduard.services.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
