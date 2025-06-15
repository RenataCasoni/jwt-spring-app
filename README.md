
# JWT Spring Boot Application

![Java](https://img.shields.io/badge/Java-17+-green?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.x-brightgreen?logo=spring)
![License](https://img.shields.io/badge/license-MIT-blue)

Este projeto é uma aplicação **Spring Boot** com autenticação e autorização usando **JWT (JSON Web Token)**. A aplicação permite controle de acesso baseado em **roles** (ADMIN, USER), e está integrada com um banco de dados **MySQL**.

---

## Tecnologias

✅ Java 17+  
✅ Spring Boot 3.5.x  
✅ Spring Security  
✅ JWT (jjwt)  
✅ Spring Data JPA  
✅ MySQL  

---

## Configuração

### Banco de dados

No arquivo `src/main/resources/application.properties`:
```properties
spring.application.name=jwt-spring-app
spring.datasource.url=jdbc:mysql://localhost:3306/jwt_spring_app
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```
> Crie o banco antes de rodar:
```sql
CREATE DATABASE jwt_spring_app;
```

---

## 📂 Estrutura do Projeto
```
src/main/java/com/example/jwtspringapp
 ├── controller         # Endpoints (AuthController, AdminController, UserController)
 ├── model              # Entidades JPA (User, Role)
 ├── repository         # Repositórios (UserRepository)
 ├── security           # JWT, filtros, configs de segurança
 ├── service            # Lógica de negócio (UserService)
 └── JwtSpringAppApplication.java  # Classe principal
```

---

## ▶ Como rodar

```bash
mvn spring-boot:run
```
ou
```bash
./mvnw spring-boot:run
```

---

## Testando

### Login
```
POST /auth/login
Headers:
Content-Type: application/json
Body:
{
  "email": "seu@email.com",
  "password": "suaSenha"
}
```
✔ Resposta: 
```json
{
  "token": "SEU_JWT_AQUI"
}
```

###  Cadastro
```
POST /auth/register
Headers:
Content-Type: application/json
Body:
{
  "email": "novo@email.com",
  "password": "novaSenha",
  "role": "USER"
}
```

###  Acessando endpoints protegidos
```
GET /user/algum-endpoint
Authorization: Bearer SEU_JWT_AQUI
```
```
GET /admin/algum-endpoint
Authorization: Bearer SEU_JWT_AQUI
```

---

##  Dicas MySQL

```sql
-- Conectar no MySQL
mysql -u root -p

-- Selecionar banco
USE jwt_spring_app;

-- Ver tabelas
SHOW TABLES;

-- Ver campos de uma tabela
DESCRIBE user;
```

---

##  Licença

Distribuído sob licença MIT. Consulte `LICENSE` para mais informações.
