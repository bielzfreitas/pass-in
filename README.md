# pass.in
Aplicação de gestão de participantes em eventos presenciais

Trilha NLW Unite | Rocketseat

- Spring:
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.2.4&packaging=jar&jvmVersion=17&groupId=rocketseat.com&artifactId=pass-in&name=pass-in&description=Demo%20project%20for%20Spring%20Boot&packageName=rocketseat.com.pass-in&dependencies=web,data-jpa,flyway,devtools,lombok

----------------------------------------------------------------------------------------------------------------------------

# AULA 1

# Sobre o projeto

> O pass.in é uma aplicação de **gestão de participantes em eventos presenciais**.
> 
- A ferramenta permite que o organizador cadastre um evento e abra uma página pública de inscrição.
- Os participantes inscritos podem emitir uma credencial para check-in no dia do evento.
- O sistema fará um scan da credencial do participante para permitir a entrada no evento.

## Requisitos

### Requisitos funcionais

- O organizador deve poder cadastrar um novo evento;
- O organizador deve poder visualizar dados de um evento;
- O organizador deve poder visualizar a lista de participantes;
1. O participante deve poder se inscrever em um evento;
- O participante deve poder visualizar seu crachá de inscrição;
- O participante deve poder realizar check-in no evento;

### Regras de negócio

- O participante só pode se inscrever em um evento uma única vez;
- O participante só pode se inscrever em eventos com vagas disponíveis;
- O participante só pode realizar check-in em um evento uma única vez;

### Requisitos não-funcionais

- O check-in no evento será realizado através de um QRCode;

# Criando o projeto

- [x]  Criar projeto usando Spring Initializr
    - ~~Spring Web~~
    - ~~Flyway~~
    - ~~Dev Tools~~
    - ~~Lombok~~
    - ~~JPA~~
- [x]  Criar e configurar banco de dados na aplicação
    
    ```xml
    		<dependency>
    			<groupId>org.hsqldb</groupId>
    			<artifactId>hsqldb</artifactId>
    			<version>2.7.1</version>
    		</dependency>
    ```
    
- [x]  Criar migrations para criação das tabelas
- [x]  Criar entidades que irão representar os dados
    - [x]  Event
    - [x]  Attendee
    - [x]  Check-in
- [x]  Criar repositories
    - [x]  Event
    - [x]  Attendee
    - [x]  Check-in
- [x]  Criar controllers
    - [x]  **/events**
    - [x]  **/attendees**

![erd.svg](https://prod-files-secure.s3.us-west-2.amazonaws.com/08f749ff-d06d-49a8-a488-9846e081b224/2ba0ffe6-d8d9-465b-a6c0-c92286d84ec3/erd.svg)

# Pós-aula!!

- [x]  Acessar comunidade do Discord
    - [x]  Para tirar dúvidas e ajudar outros devs
- [x]  Completar a aula na plataforma para concorrer a prêmios

----------------------------------------------------------------------------------------------------------------------------

# AULA 2

Nessa aula iremos implementar as funcionalidades que dizem respeito ao organizador do evento.

# Requisitos

### Requisitos funcionais

- [x]  O organizador deve poder cadastrar um novo evento;
- [x]  O organizador deve poder visualizar dados de um evento;
- [x]  O organizador deve poder visualizar a lista de participantes;

# Criando funcionalidade de organizador

- [x]  Criar `EventService`
    - [x]  Listagem de eventos
    - [x]  Criação de eventos
- [x]  Criar Endpoints
    - [x]  GET /events/{eventId}
    - [x]  POST /events
- [x]  Adicionar tratamento para Exceções
- [x]  Criar `AttendeeService`
    - [x]  Listagem de Attendees de um evento
- [x]  Criar Endpoint
    - [x]  GET /events/{eventId}/attendees

# Pós-aula!!

- [x]  Acessar comunidade do Discord
    - [x]  Para tirar dúvidas e ajudar outros devs
- [x]  Completar a aula na plataforma para concorrer a prêmios

----------------------------------------------------------------------------------------------------------------------------

# AULA 3

Nessa aula iremos implementar todas as funcionalidades que dizem respeito ao participante do evento.

# Requisitos

### Requisitos funcionais

- [x]  O participante deve poder se inscrever em um evento;
- [x]  O participante deve poder visualizar seu crachá de inscrição;
- [x]  O participante deve poder realizar check-in no evento;

### Regras de negócio

- [x]  O participante só pode se inscrever em um evento uma única vez;
- [x]  O participante só pode se inscrever em eventos com vagas disponíveis;
- [x]  O participante só pode realizar check-in em um evento uma única vez;

# Criando funcionalidade de organizador

- [x]  Implementar novas funcionalidades no `AttendeeService`
    - [x]  Inscrição de participante num evento
        - O participante deve enviar `name` e `email`
    - [x]  Exibição do crachá
    - O retorno do crachá deverá ser o `name`, `email`, `checkInURL` e **`eventTitle`**
- [x]  Criar Endpoints
    - [x]  POST /events/{eventId}/attendees
    - [x]  GET /attendees/{attendeeId}/badge
- [x]  Criar **`CheckInService`**
    - [x]  Criar método para checkIn
- [x]  Criar Endpoint
    - [x]  POST /attendees/{attendeeId}/check-in
- [x]  Tratamento das exceções

----------------------------------------------------------------------------------------------------------------------------
