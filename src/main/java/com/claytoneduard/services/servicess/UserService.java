package com.claytoneduard.services.servicess;

import com.claytoneduard.services.entities.User;
import com.claytoneduard.services.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.isPresent() ? obj.get() : null;
  }
}
