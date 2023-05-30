# Crud básico Spring Udemy Nelio Alves

## Objetivos
 * Criar projeto Spring Boot Java;
 * Implementar modelo de domínio;
 * Estruturar camadas lógicas: resource, service, repository;
 * Configurar banco de dados de teste (H2);
 * Povoar o banco de dados;
 * CRUD - Create, Retrieve, Update, Delete;
 * Tratamento de exceções ;


## O projeto foi desenvolvido utilizando a IDE VSCode, abaixo arvore do projeto;
![image](https://github.com/ClaytonEduard/services/assets/11823640/dfb8a21e-126b-4d44-8bf6-705c9fe98973)

## Os teste foram realizados utilizando Postman

### Create
![image](https://github.com/ClaytonEduard/services/assets/11823640/70568a52-351a-47c8-b87d-11490b8f00c7)

### Retrieve / Listar todos/ Lista um
![image](https://github.com/ClaytonEduard/services/assets/11823640/4ebce835-bb26-42e7-857b-3e4cef5e416d)

![image](https://github.com/ClaytonEduard/services/assets/11823640/d6e51cfc-a471-480c-8d66-7cdddcf701ad)

### Update (Alterando os dados do User 4)
![image](https://github.com/ClaytonEduard/services/assets/11823640/f78ad7c7-f2af-4bfa-9206-a4ef008d3639)

### Delete (Deletando o user 4)
![image](https://github.com/ClaytonEduard/services/assets/11823640/548da1f5-9a85-4241-a72b-3a4333b1e45f)


## Tratameto de Exceções

* Usuário 5 não encontrado
![image](https://github.com/ClaytonEduard/services/assets/11823640/7fadf8fa-4aab-4f5d-9e3a-6001a52d008a)

* Não é possível deletar o User 1, porque o mesmo possui vinculos com outras classes no banco de dados
![image](https://github.com/ClaytonEduard/services/assets/11823640/32ebb3f8-638c-494e-8dd0-39088d1d54e7)

* Não é possível deletar um User não existente
![image](https://github.com/ClaytonEduard/services/assets/11823640/00256cb0-70b0-4688-9802-754a13eaacba)

* Não é possível gravar User faltando dados
![image](https://github.com/ClaytonEduard/services/assets/11823640/f077bfa1-f109-4944-ad66-d89a54206551)

