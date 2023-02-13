package com.claytoneduard.services.repositories;

import com.claytoneduard.services.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
