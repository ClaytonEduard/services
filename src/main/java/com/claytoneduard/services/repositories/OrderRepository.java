package com.claytoneduard.services.repositories;

import com.claytoneduard.services.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
