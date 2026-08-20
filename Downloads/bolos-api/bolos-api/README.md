# API de Cadastro de Bolos

## Descrição
API REST simples para cadastro e consulta de bolos. Projeto desenvolvido como
primeiro trabalho prático com Spring Boot, aplicando os conceitos de
Controller, Service e Repository.

## Tecnologias utilizadas
- Java 17
- Spring Boot 3.3.4
- Maven

## Endpoints

### Listar bolos

GET /bolos

Retorna a lista de bolos já cadastrados.

### Cadastrar bolo

POST /bolos

Corpo da requisição (JSON):
```json
{
    "nome": "Bolo de Chocolate",
    "sabor": "Chocolate",
    "preco": 45.00
}


## Estrutura do projeto

src/main/java/com/exemplo/bolos
├── BolosApplication.java
├── controller
│   └── BoloController.java
├── service
│   └── BoloService.java
├── repository
│   └── BoloRepository.java
└── model
    └── Bolo.java


## Fluxo da aplicação

Cliente -> Controller -> Service -> Repository -> Lista em memória

O Controller recebe a requisição HTTP, chama o Service para aplicar as
regras da aplicação, e o Service usa o Repository para salvar ou consultar
os bolos, que ficam armazenados em uma lista em memória (sem banco de dados).
