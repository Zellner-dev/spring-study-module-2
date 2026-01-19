# 🛒 Produtos API (Spring Boot + JPA + Hibernate)

API REST simples para **cadastro e gerenciamento de produtos**, criada durante meus estudos de **Java Spring Boot**, com foco em **JPA**, **Hibernate** e **Spring Data JPA**.

O projeto implementa um CRUD completo (Create, Read, Update, Delete) e uma busca por nome utilizando métodos derivados do Spring Data.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Jakarta Persistence (JPA)
- Maven
- UUID (para geração de ID)

---

## 📌 Funcionalidades

- ✅ Criar produto
- ✅ Buscar produto por ID
- ✅ Buscar produtos por nome
- ✅ Atualizar produto
- ✅ Deletar produto

---

## 📁 Estrutura do projeto

```bash
src/main/java/br/com/zellner/produtosApi
│
├── ProdutosApiApplication.java
│
├── controller
│   └── ProductController.java
│
├── model
│   └── Product.java
│
└── repository
    └── ProductRepository.java
