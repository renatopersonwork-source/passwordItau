# Password Validator

## 📌 Objetivo

Este projeto implementa uma **biblioteca Java reutilizável** para validação de senhas, desenvolvida como parte de um desafio técnico.

A solução foi pensada para demonstrar:
- código limpo
- boas práticas de design
- baixo acoplamento
- alta coesão
- extensibilidade
- uso consciente de princípios SOLID

---

## Regras de validação

Uma senha é considerada válida quando atende **a todos** os critérios abaixo:

- Possui **no mínimo 9 caracteres**
- Contém **ao menos 1 dígito**
- Contém **ao menos 1 letra minúscula**
- Contém **ao menos 1 letra maiúscula**
- Contém **ao menos 1 caractere especial**, limitado ao conjunto:  
  `!@#$%^&*()-+`
- **Não possui caracteres repetidos**
- **Não contém espaços em branco**
- Senhas `null` são consideradas inválidas

---

## Arquitetura da solução

A solução foi estruturada em três camadas bem definidas, 
seguindo princípios de **Clean Architecture**:

com.company.password 
- api → ponto de entrada público da biblioteca 
- application → orquestração das regras 
- domain → regras de negócio puras 
- rule


### 🔹 Domain
- Contém apenas regras de negócio
- Não depende de frameworks ou detalhes técnicos
- Cada regra possui **uma única responsabilidade**

### 🔹 Application
- Responsável por **orquestrar** as regras do domínio
- Centraliza validações transversais (ex.: `null`)
- Depende apenas de abstrações

### 🔹 API
- Camada de exposição pública da biblioteca
- Implementa o padrão **Facade**
- Esconde toda a complexidade interna da solução

---

##  Principais decisões técnicas

### ✔ Interface para regras (`PasswordRule`)
- Permite adicionar novas regras sem modificar código existente
- Atende ao princípio **Open/Closed (SOLID)**

### ✔ Uma classe por regra
- Evita métodos monolíticos
- Facilita leitura, testes e manutenção
- Mantém alta coesão

### ✔ Evitar uso de regex
- Foram utilizadas APIs nativas da linguagem (`Character`, `String`)
- Maior legibilidade e menor complexidade
- Código mais fácil de manter e depurar

### ✔ Validação de `null` centralizada
- Tratada na camada de aplicação
- Mantém as regras focadas exclusivamente em seus critérios

---

##  Testes

Os testes unitários foram implementados com **JUnit 5** e validam:

- Senha válida
- Todos os cenários inválidos fornecidos no enunciado
- Caso de senha `null`

Os testes validam **o comportamento da API pública**, permitindo refatorações internas sem impacto.

---

## ▶ Como executar o projeto

### Pré-requisitos
- Java **17**
- Maven **3.9+**

### Executar os testes
```bash
mvn clean test
