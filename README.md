# TeckGamer API

API REST desenvolvida em Java com Spring Boot para o gerenciamento de uma loja online de games (fictícia), permitindo cadastro e manutenção de **games**, **categorias** e **produtos**, com operações CRUD completas.

O projeto foi construído com foco em **boas práticas de backend**, separação de responsabilidades e tratamento padronizado de erros, servindo como base de estudo e portfólio.


---

## Funcionalidades

- CRUD completo de **Games**
- CRUD completo de **Categorias**
- CRUD completo de **Produtos**
- Relacionamento entre entidades (Produtos → Categorias)
- Tratamento global de exceções com mensagens padronizadas
- Respostas HTTP consistentes (200, 201, 404, 204)s

---

##  Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA  / Hibernate
- MySQL
- Maven
- API REST
- Postman (testes manuais)

---

## Arquitetura do Projeto

O projeto segue uma arquitetura em camadas:

- **Controller** → Responsável pelas requisições HTTP e retorna respostas
- **Service** → Regras de negócio e validações
- **Repository** → Acesso ao banco de dados
- **Model (Entity)** → Representação das tabelas
- **Exception** → Tratamento global de erros e respostas padronizadas

Esse padrão facilita manutenção, testes e evolução do sistema.

---

## 🔗 Endpoints Principais

### 🎮 Games
- `GET /api/games`
- `GET /api/games/{id}`
- `POST /api/games`
- `PUT /api/games/{id}`
- `DELETE /api/games/{id}`

### 🗂️ Categorias
- `GET /api/categorias`
- `GET /api/categorias/{id}`
- `POST /api/categorias`
- `PUT /api/categorias/{id}`
- `DELETE /api/categorias/{id}`

### 🛒 Produtos
- `GET /api/produtos`
- `GET /api/produtos/{id}`
- `POST /api/produtos`
- `PUT /api/produtos/{id}`
- `DELETE /api/produtos/{id}`

---

## 📦 Exemplo de JSON (Game)

```json
{
  "nome": "The Last of Us",
  "genero": "Ação/Aventura",
  "descricao": "Jogo de ação com narrativa envolvente",
  "preco": 299.90
}


```

---

## Como executar o projeto

# Clonar repositório
- git clone https://github.com/Lu-nas/TeckGamer_api.git

# Entrar na pasta do projeto
- cd TeckGamer_api

## Baixar dependências Maven
- mvn clean install

## Executar o projeto pela IDE ou com:
- mvn spring-boot:run


Acesse a API em: http://localhost:8080

⚠️ Projeto  desenvolvido para consolidar aprendizado Não é indicado para produção.
