# 🏢 RH Departamento API

API REST desenvolvida com **Java + Spring Boot** para gerenciamento de recursos humanos, aplicando **Design Patterns,
Clean Architecture e autenticação com JWT**.

Projeto criado durante o **Bootcamp Java Bradesco (DIO)** e evoluído com práticas modernas de desenvolvimento backend.

---

## 🚀 Tecnologias

* **Java 17**
* **Spring Boot**
* **Spring Security**
* **JWT Authentication**
* **Spring Data JPA / Hibernate**
* **PostgreSQL**
* **Lombok**
* **Maven**
* **Swagger / OpenAPI**
* **Postman**

---

## 🧠 Principais Funcionalidades

✔ CRUD de **Departamentos, Cargos e Funcionários**
✔ Persistência com **PostgreSQL**
✔ **Arquitetura em camadas (Controller, Service, Repository)**
✔ Autenticação segura com **Spring Security + JWT**
✔ Senhas criptografadas com **BCrypt**
✔ Documentação da API com **Swagger**

---

## 🔐 Autenticação

A API utiliza **JWT (JSON Web Token)**.

Login:

```http
POST /api/auth/login
```

Request:

```json
{
  "email": "usuario@email.com",
  "password": "123456"
}
```

Resposta:

```json
{
  "token": "jwt_token"
}
```

Uso nas requisições protegidas:

```
Authorization: Bearer {token}
```

---

## 🏗 Arquitetura

O projeto segue princípios de **Clean Architecture**, separando responsabilidades:

```
controller → service → repository → database
```

Estrutura principal:

```
src/main/java
 ├── controller
 ├── core
 ├── infrastructure
 │   └── security (JWT, filters, adapters)
 └── config
```

---

## ▶ Como Executar

1️⃣ Clonar repositório

```
git clone https://github.com/Val-Faria/rh-departamento-api
```

2️⃣ Configurar banco PostgreSQL no `application.properties`

3️⃣ Executar aplicação

```
./mvnw spring-boot:run
```

---

## 📚 Documentação da API

Swagger disponível em:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🎯 Próximos Passos

* Implementar **registro de usuários**
* Controle de **roles (ADMIN / USER)**
* **Testes automatizados**
* Deploy da API

---

👨‍💻 **Projeto focado em prática de arquitetura backend com Spring Boot e segurança com JWT.**
