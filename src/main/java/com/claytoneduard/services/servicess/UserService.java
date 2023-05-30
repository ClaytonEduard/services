package com.claytoneduard.services.servicess;

import com.claytoneduard.services.entities.User;
import com.claytoneduard.services.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
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

  // retornar o user salvo
  public User insert(User obj) {
    return repository.save(obj);
  }

  //deleção do user
  public void delete(Long id) {
    repository.deleteById(id);
  }

  // atualizar usuario
  public User update(Long id, User obj) {
    User entity = repository.getReferenceById(id); // busca o objeto no banco;
    updateData(entity, obj);
    return repository.save(entity);
  }

  private void updateData(User entity, User obj) {
    entity.setEmail(obj.getEmail());
    entity.setName(obj.getName());
    entity.setPhone(obj.getPhone());
  }
}
