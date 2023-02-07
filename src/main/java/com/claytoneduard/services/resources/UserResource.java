package com.claytoneduard.services.resources;

import com.claytoneduard.services.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User user = new User(
      1L,
      "Clayton",
      "clayton@hotmail.com",
      "99999999",
      "123456"
    );
    return ResponseEntity.ok().body(user);
  }
}