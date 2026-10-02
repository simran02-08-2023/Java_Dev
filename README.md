# Java Full Stack Learning Journey

Public log of my path from Core Java to a deployed full-stack application — built in the open, alongside DSA prep and backend-focused project work, as I target SDE/backend engineering internships.

## About

I'm a backend-focused Java developer currently working through a complete Java Full Stack syllabus, targeting the current generation of tools: **Java 25 (LTS)** and **Spring Framework 7 / Spring Boot 4**. This repo tracks that progress — notes, practice code, and mini-projects for each phase — rather than being a single polished application.

My existing backend stack (Spring Boot, Redis, Docker, MySQL) comes from building [`distributed-rate-limiter`](https://github.com/simran02-08-2023/distributed-rate-limiter), a token-bucket/sliding-window rate limiter with Lua-scripted atomic operations. This repo documents the structured learning filling in and extending that foundation.

## Roadmap

| Phase | Topic | Status |
|---|---|---|
| 0 | Programming Fundamentals | ✅ |
| 1 | Core Java / OOP | ✅ |
| 2 | Advanced Java (Streams, Concurrency, Virtual Threads) | 🔄 |
| 3 | Database & SQL | 🔄 |
| 4 | JDBC & Servlets/JSP | ⬜ |
| 5 | Build Tools & Version Control | ✅ |
| 6 | Frontend Fundamentals (React/Next.js) | ✅ |
| 7 | Spring Framework Core | ⬜ |
| 8 | Spring Boot | ⬜ |
| 9 | Spring MVC & REST APIs | ⬜ |
| 10 | Data Access (JPA/Hibernate) | ⬜ |
| 11 | Spring Security (JWT, OAuth2) | ⬜ |
| 12 | Testing (JUnit 5, Mockito, Testcontainers) | ⬜ |
| 13 | Caching & Async (Redis, @Async) | ⬜ |
| 14 | Microservices (Eureka, Gateway, Feign) | ⬜ |
| 15 | Messaging (Kafka/RabbitMQ) | ⬜ |
| 16 | DevOps & Deployment (Docker, CI/CD, Cloud) | ⬜ |
| 17 | Capstone Project | ⬜ |
| 18 | AI Integration for Backend Devs (Spring AI, MCP) | ⬜ |

*(Status updated as phases are completed — check commit history for details.)*

## Repo Structure

```
java-full-stack-journey/
├── phase-02-advanced-java/
├── phase-03-sql/
├── phase-04-jdbc-servlets/
├── phase-07-spring-core/
├── phase-08-spring-boot/
├── phase-09-rest-apis/
├── phase-10-jpa-hibernate/
├── phase-11-spring-security/
├── phase-12-testing/
├── phase-13-caching-async/
├── phase-14-microservices/
├── phase-15-messaging/
├── phase-16-devops/
├── phase-17-capstone/
├── phase-18-ai-integration/
└── README.md
```

Each phase folder contains working code, short notes on key concepts, and references used.

## Tech Stack (Target)

`Java 25` · `Spring Boot 4` · `Spring Framework 7` · `Hibernate` · `MySQL` · `Redis` · `Docker` · `JUnit 5` · `Mockito` · `GitHub Actions`

## Related Work

- [`distributed-rate-limiter`](https://github.com/simran02-08-2023/distributed-rate-limiter) — foundational backend project this journey builds on
- [Portfolio](https://simran02-08-2023.github.io/Simran-Portfolio/) · [LinkedIn](https://linkedin.com/in/simran-singh1128/)

## Why Public

Keeping this in the open for accountability and as a working log — commit history doubles as a record of consistency, and it's a reference point for anyone else on a similar path through the Java backend ecosystem.
