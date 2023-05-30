package com.claytoneduard.services.resources;

import com.claytoneduard.services.entities.User;
import com.claytoneduard.services.servicess.UserService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService service;

  //recupar os dados do banco
  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> list = service.findAll();

    return ResponseEntity.ok().body(list);
  }

  //recupar os dados do banco
  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
    User obj = service.findById(id);
    return ResponseEntity.ok().body(obj); // retorna a resposta Ok com o corpo do objeto
  }

  @PostMapping
  public ResponseEntity<User> insert(@RequestBody User obj) {
    //TODO: process POST request
    obj = service.insert(obj);
    URI uri = ServletUriComponentsBuilder
      .fromCurrentRequest()
      .path("/{id}")
      .buildAndExpand(obj.getId())
      .toUri();
    return ResponseEntity.created(uri).body(obj); // created recebe uma URI para retornar o status 201
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build(); // resposta sem corpo e o codigo 204 de exclusao do http
  }

  //metodo para atualizar
  @PutMapping(value = "/{id}")
  public ResponseEntity<User> update(
    @PathVariable Long id,
    @RequestBody User obj
  ) {
    //TODO: process PUT request
    obj = service.update(id, obj);

    return ResponseEntity.ok().body(obj);
  }
}
