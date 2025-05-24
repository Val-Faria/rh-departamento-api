# springboot-design-patterns

# 🏢 rh-departamento-api

Projeto desenvolvido durante o Bootcamp Java Bradesco - DIO, com foco na aplicação prática de Padrões de Projeto e construção de uma API RESTful de Recursos Humanos (RH).

---

## 🚀 Sobre o Projeto

Este sistema simula um módulo de Gestão de Recursos Humanos, permitindo o cadastro e gerenciamento de cargos, departamentos e salários, utilizando tecnologias modernas com o ecossistema Spring e Java.

A aplicação explora os principais padrões de projeto, como `Repository`, `Service`, `Controller`, além de boas práticas como a separação de camadas, injeção de dependência e persistência com JPA.

> 💡 **Nota**: Este projeto está em constante evolução. Pretendo aprofundar meus estudos em Java e Spring, e futuramente adicionar novas funcionalidades e camadas de complexidade, como:
> - Autenticação e autorização com Spring Security
> - Versionamento de API
> - Testes automatizados com JUnit e Mockito
> - Integração com serviços externos
> - Padrões avançados como Builder, Observer e Domain Events

---

## 🛠️ Tecnologias Utilizadas

- ✅ **Java 17+**
- ✅ **Spring Boot**
- ✅ **Spring Data JPA**
- ✅ **Jakarta Persistence**
- ✅ **PostgreSQL**
- ✅ **Lombok**
- ✅ **Maven**
- ✅ **Postman** (para testes da API)

---

## 📁 Estrutura do Projeto

rh-departamento-api/
├── .idea/                         # Configurações do IntelliJ
├── .mvn/                          # Configurações do Maven Wrapper
├── src/
│   └── main/
│       ├── java/
│       │   └── com.desafio.padrao.de.projeto.rh_departamento_api/
│       │       ├── controller/
│       │       │   ├── cargo/
│       │       │   │   ├── CargoController.java
│       │       │   │   ├── CargoDTORequest.java
│       │       │   │   └── CargoDTOResponse.java
│       │       │   └── departamento/
│       │       │       ├── DepartamentoController.java
│       │       │       ├── DepartamentoDTORequest.java
│       │       │       └── DepartamentoDTOResponse.java
│       │       ├── core/
│       │       │   ├── cargo/
│       │       │   └── departamento/
│       │       └── RhDepartamentoApiApplication.java
│       └── resources/
│           └── application.properties  # Configurações da aplicação
├── src/test/                          # Testes automatizados (em desenvolvimento)
├── target/                            # Diretório de build (gerado pelo Maven)
├── .gitignore
├── .gitattributes
├── HELP.md
├── mvnw
└── pom.xml                            # Arquivo de dependências Maven



---

## 🧠 Funcionalidades

- ✅ Cadastro de **Departamentos**
- ✅ Cadastro de **Cargos**
- ✅ Cadastro de **Funcionários** com salário
- ✅ Relacionamentos entre entidades
- ✅ Operações CRUD com persistência em **PostgreSQL**
- ✅ Testes de endpoints com **Postman**

---

## 🔧 Como Executar

### Pré-requisitos:
- Java 17+
- PostgreSQL
- Maven
- Spring Boot
- Spring Data JPA
- Jakarta Persistence
- Lombok
- Mapper
- Postman (para tstes de API)

### Passos:

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio

# Configure o banco no application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nomedobanco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Execute a aplicação
./mvnw spring-boot:run

📌 Padrões de Projeto Aplicados
Repository Pattern

Service Layer Pattern

Mapper

DTOs 

Injeção de Dependência

🎯 Próximos Passos
 Implementar autenticação com Spring Security

 Adicionar validações personalizadas

 Criar testes automatizados com JUnit e Mockito

 Aplicar padrões mais avançados, como Builder e Observer

 Criar um ambiente de produção com Docker ou Heroku


