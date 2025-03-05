# Santander Dev Week 2023

Java RESTful API created for Santander Dev Week.

## Main Technologies
 - Java 17: We will use the latest LTS version of Java to take advantage of the latest innovations that this robust and widely used language offers;
 - **Spring Boot 3**: We'll be working with the newest version of Spring Boot, which maximizes developer productivity through its powerful auto-configuration premise;
 - Spring Data JPA**: We'll explore how this tool can simplify our data access layer, facilitating integration with SQL databases;
 - OpenAPI (Swagger)**: We will create effective and easy-to-understand API documentation using OpenAPI (Swagger), perfectly aligned with the high productivity that Spring Boot offers;
 - Railway: facilitates the deployment and monitoring of our solutions in the cloud, as well as offering various databases as a service and CI/CD pipelines.

## [Figma link](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

Figma was used to abstract the domain of this API, making it useful for analyzing and designing the solution.

## Class Diagram (API Domain)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User “1” *-- “1” Account
  User “1” *-- “N” Feature
  User “1” *-- “1” Card
  User “1” *-- “N” News
```

## IMPORTANT

This project was built with a totally educational bias for DIO. That's why we've made a more robust version of it available in the official DIO repository:

### [digitalinnovationone/santander-dev-week-2023-api](https://github.com/digitalinnovationone/santander-dev-week-2023-api)

There we have included all the CRUD endpoints, as well as applying good practices (use of DTOs and refinement of the OpenAPI documentation). So, if you want a more complete challenge/reference, just go to 👊🤩