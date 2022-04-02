# Retail Store Discounts

## Table of Contents

- [Description](#Description)
- [Getting Started](#getting_started)
- [Usage](#usage)
- [Built Using](#built_using)

## Description

This project build by using JAVA programming language and Spring Boot Framework to make a Restful APIs that will handle
discounts percentage based on the user type customer or employee and the project contain a full CRUD operations using
MySQL Database.

### Business Requirements

On a retail website, the following discounts apply:

1. If the user is an employee of the store, he gets a 30% discount on orders.
2. If the user is a regular customer of the store, he gets a 10% discount.
3. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount).

## Getting Started <a name = "getting_started"></a>

### Dependencies used on the project

```
- MYSQL Dirver (MySQL Database)
- Lombok (Developer Tools)
- Spring Web (Build web, including RESTful, applications using Spring MVC)
- Spring Data JPA (Persist data in SQL stores with Java Persistence API using Spring Data)
```

## Using

### API Endpoints

* Http Method - **POST**
* Endpoint - **http://localhost:8080/api/orders/employee/discount**

Example request

```json
{
 "subTotal": 990
}

```

The response is net payable amount.

```json
663
```
<br>

* Http Method - **POST**
* Endpoint - **http://localhost:8080/api/orders/customer/discount**

Example request

```json
{
 "subTotal": 990
}

```

The response is net payable amount.

```json
851
```
<br>

## Built Using <a name = "built_using"></a>

- [JAVA](https://www.java.com/) - Programming Language based on OOP
- [Spring Boot](https://spring.io/) - Open-source Framework used to build web applications
- [MySQL](https://www.mysql.com/) - RDBMS (Relational Database Management System) based on SQL used to store data in orginized tables

***
