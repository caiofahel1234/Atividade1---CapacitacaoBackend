# Atividade 1 - CapacitacaoBackend

Projeto de backend em **Spring Boot** para fins de capacitação. Esta aplicação possui uma API simples com endpoint de exemplo para demonstração de funcionamento do Spring Boot.

---

## Estrutura do Projeto
capacitacao-backend/
└─ backend/
└─ backend/
└─ src/
└─ main/
└─ java/
└─ com/
└─ example/
└─ backend/
├─ BackendApplication.java
└─ controller/
└─ MensagemController.java
└─ src/
└─ main/
└─ resources/
└─ application.properties
└─ pom.xml

---

## Requisitos

- Java JDK 17 ou superior  
- Maven 3.8 ou superior  
- IDE recomendada: VSCode ou IntelliJ IDEA  

---

## Como Rodar a Aplicação

### 1. Clone o repositório:

  git clone <URL_DO_REPOSITORIO>


### 2. Entre na pasta do projeto:

  cd capacitacao-backend/backend/backend


### 3. Execute a aplicação usando Maven:

  mvn spring-boot:run


### 4. Caso a porta 8080 esteja ocupada, altere a porta no arquivo application.properties:

  server.port=9090

## Endpoints

### 1. GET /mensagem

  {
  "mensagem": "Bem-vindo à trilha Backend!"
}
