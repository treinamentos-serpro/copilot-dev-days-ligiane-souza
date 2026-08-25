🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

<div align="center">

# 🎯 Soc Ops

**Social Bingo for in-person mixers — built live with GitHub Copilot Agents.**

Find people who match the prompts. Get 5 in a row. Break the ice.

[![Live Demo](https://img.shields.io/badge/🎮_Live_Demo-4A90E2?style=for-the-badge)](https://copilot-dev-days.github.io/agent-lab-java/)
[![Lab Guide](https://img.shields.io/badge/📚_Lab_Guide-2ECC71?style=for-the-badge)](workshop/GUIDE.md)
[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)

</div>

---

## ✨ What is this?

**Soc Ops** is a hands-on lab where you experience what modern AI-assisted development actually feels like. You start with a working Spring Boot + Thymeleaf app and use **GitHub Copilot Agents** to extend it — designing frontends, generating questions, and orchestrating multi-agent workflows — all in a real team environment.

> 🃏 The app itself? A Social Bingo game. Players get a 5×5 board of fun prompts ("Has visited another continent", "Owns more than 3 houseplants") and mingle to find matching people. First to 5 in a row wins.

---

## 🚀 What you'll build

| Lab Part | What you do |
|----------|-------------|
| [**00 — Overview**](workshop/00-overview.md) | Orient yourself & run the checklist |
| [**01 — Setup & Context**](workshop/01-setup.md) | Configure Copilot, write agent instructions |
| [**02 — Design-First**](workshop/02-design.md) | Ship a polished UI with an AI design agent |
| [**03 — Quiz Master**](workshop/03-quiz-master.md) | Create a custom agent that generates bingo prompts |
| [**04 — Multi-Agent**](workshop/04-multi-agent.md) | Orchestrate agents working in parallel |

---

## 🛠️ Stack

- **Backend:** Java 21 · Spring Boot 3.4.2 · Maven
- **Frontend:** Thymeleaf · Custom CSS utilities
- **AI:** GitHub Copilot Agents (VS Code 1.107+)
- **Deploy:** GitHub Pages (auto on push to `main`)

---

## ⚡ Quick Start

**Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) · GitHub Copilot

```bash
# Run the app
cd socops
./mvnw spring-boot:run
# → open http://localhost:8080
```

```bash
# Build & test
./mvnw clean package
./mvnw test
```

---

## 📖 Offline reading

All lab guides live in the [`workshop/`](workshop/) folder — clone the repo and read them without an internet connection.

---

<div align="center">

*Part of the [GitHub Copilot Dev Days](https://copilot-dev-days.github.io/agent-lab-java/) workshop series.*

</div>
