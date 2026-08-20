# 🍰 API Bolos

API REST desenvolvida em **Java com Spring Boot** para realizar o cadastro e consulta de bolos.

O projeto foi desenvolvido com o objetivo de praticar a organização de uma aplicação utilizando as camadas:

**Controller → Service → Repository**

---

## 📋 Sobre o projeto

A **API Bolos** permite cadastrar bolos e consultar os bolos cadastrados.

Neste primeiro momento, os dados são armazenados em memória utilizando uma lista, não sendo necessário utilizar banco de dados.

---

## 🛠️ Tecnologias utilizadas

* Java 21
* Spring Boot
* Maven
* Spring Web
* VS Code
* Git e GitHub

---

## 📁 Estrutura do projeto

```text
src
└── main
    └── java
        └── com.example.api_bolos
            ├── controller
            ├── model
            ├── repository
            ├── service
            └── ApiBolosApplication.java
```

### Camadas

**Model**

Representa os dados do bolo.

**Controller**

Responsável por receber as requisições HTTP da API.

**Service**

Contém a lógica da aplicação e faz a comunicação entre Controller e Repository.

**Repository**

Responsável pelo armazenamento dos bolos em memória.

---

## 🚀 Como executar o projeto

### 1. Pré-requisitos

É necessário ter instalado:

* Java 21
* Maven

### 2. Executar a aplicação

Abra o projeto no VS Code e execute a classe:

```text
ApiBolosApplication.java
```

Também é possível executar pelo terminal:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação será executada na porta:

```text
8080
```

---

## 🌐 Endpoints

### Listar todos os bolos

**GET**

```text
http://localhost:8080/bolos
```

Exemplo de resposta:

```json
[
  {
    "id": 1,
    "nome": "Bolo de Chocolate",
    "preco": 35.90
  }
]
```

---

### Cadastrar um bolo

**POST**

```text
http://localhost:8080/bolos
```

Body da requisição:

```json
{
  "id": 1,
  "nome": "Bolo de Chocolate",
  "preco": 35.90
}
```

Exemplo de resposta:

```json
{
  "id": 1,
  "nome": "Bolo de Chocolate",
  "preco": 35.90
}
```

---

## 🔄 Funcionamento

O fluxo principal da aplicação funciona da seguinte maneira:

```text
Cliente
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Lista de bolos
```

Por exemplo, ao realizar um cadastro:

```text
POST /bolos
      ↓
BoloController
      ↓
BoloService
      ↓
BoloRepository
      ↓
Bolo cadastrado
```

---

## 🧪 Testes

As requisições da API podem ser testadas utilizando ferramentas como:

* Thunder Client
* Postman
* Insomnia

---

## 📌 Observações

Atualmente, os dados são armazenados apenas em memória. Isso significa que os bolos cadastrados serão perdidos quando a aplicação for encerrada.

O projeto pode futuramente ser integrado a um banco de dados para realizar o armazenamento permanente das informações.

---

## 👨‍💻 Autor
Andre Soares

Projeto desenvolvido para fins acadêmicos, com o objetivo de praticar o desenvolvimento de APIs REST utilizando Java e Spring Boot.
