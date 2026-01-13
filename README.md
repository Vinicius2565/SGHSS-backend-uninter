# SGHSS – Sistema de Gestão Hospitalar e de Serviços de Saúde (Back-end)

Projeto desenvolvido para a disciplina **Projeto: Desenvolvimento Back-end**  
Curso: **Análise e Desenvolvimento de Sistemas**  
Instituição: **Centro Universitário Internacional – Uninter**

---

## 1. Apresentação do Projeto

Este projeto consiste no desenvolvimento do **back-end** de um Sistema de Gestão Hospitalar e de Serviços de Saúde (SGHSS), com o objetivo de centralizar o gerenciamento de pacientes, usuários e autenticação, atendendo aos requisitos de segurança, controle de acesso e persistência de dados.

O sistema foi desenvolvido com foco em **API REST**, utilizando boas práticas de arquitetura, segurança e organização de código.

---

## 2. Escopo Implementado

De acordo com o estudo de caso proposto, foram priorizados os seguintes itens:

- Cadastro e gerenciamento de pacientes (CRUD)
- Autenticação de usuários
- Controle de acesso por perfil (ADMIN e MÉDICO)
- Segurança com JWT (JSON Web Token)
- Persistência de dados em banco relacional

Funcionalidades como telemedicina por videochamada, relatórios financeiros avançados e gestão de leitos foram descritas no documento teórico, mas **não fazem parte da implementação prática**, conforme permitido pelas orientações da disciplina.

---

## 3. Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Security  
- JWT (JSON Web Token)  
- Spring Data JPA / Hibernate  
- MySQL  
- Maven  

---

## 4. Segurança da Aplicação

A aplicação implementa os seguintes mecanismos de segurança:

- Autenticação baseada em JWT
- Controle de acesso por perfil de usuário
- Senhas criptografadas com BCrypt
- Endpoints protegidos por autorização
- Conformidade conceitual com a LGPD (controle de acesso e proteção de dados)

---

## 5. Endpoints Principais

### Autenticação
- **POST /auth/login**  
  Realiza a autenticação do usuário e retorna um token JWT.

### Pacientes
- **GET /pacientes** – Lista pacientes (requer autenticação)
- **POST /pacientes** – Cadastra paciente (perfil autorizado)
- **PUT /pacientes/{id}** – Atualiza paciente
- **DELETE /pacientes/{id}** – Remove paciente

Os testes desses endpoints foram realizados utilizando a ferramenta **Postman**.

---

## 6. Banco de Dados

O sistema utiliza o banco de dados **MySQL**, com mapeamento objeto-relacional realizado via JPA/Hibernate.

As principais entidades são:
- Usuário
- Paciente

---

## 7. Execução do Projeto

Para executar o projeto localmente:

1. Clonar o repositório
2. Criar o banco de dados no MySQL
3. Configurar o arquivo `application.properties`
4. Executar a aplicação via IDE ou comando Maven

---

## 8. Documentação

A documentação completa do projeto, incluindo:
- Requisitos funcionais e não funcionais
- Diagramas UML e DER
- Plano de testes
- Descrição da arquitetura

está disponível no **arquivo PDF entregue no AVA**.

---

## 9. Autor

**Vinicius Rodrigues Domingos**  
Curso: Análise e Desenvolvimento de Sistemas  
Uninter – Polo Tubarão/SC
