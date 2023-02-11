package com.claytoneduard.services.repositories;

import com.claytoneduard.services.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
