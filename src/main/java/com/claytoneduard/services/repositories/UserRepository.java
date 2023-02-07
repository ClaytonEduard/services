package com.claytoneduard.services.repositories;

import com.claytoneduard.services.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
