<!-- l10n-sync: source-file="README.md" -->

<div align="center">

# 🎯 Soc Ops

**Social Bingo para encontros presenciais — construído ao vivo com GitHub Copilot Agents.**

Encontre pessoas que combinam com os prompts. Faça 5 em linha. Quebre o gelo.

[![Demo ao Vivo](https://img.shields.io/badge/🎮_Demo_ao_Vivo-4A90E2?style=for-the-badge)](https://copilot-dev-days.github.io/agent-lab-java/)
[![Guia do Lab](https://img.shields.io/badge/📚_Guia_do_Lab-2ECC71?style=for-the-badge)](workshop/pt_BR/GUIDE.md)
[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)

</div>

---

## ✨ O que é isso?

**Soc Ops** é um lab prático onde você experimenta como é o desenvolvimento assistido por IA de verdade. Você começa com uma aplicação Spring Boot + Thymeleaf funcionando e usa **GitHub Copilot Agents** para expandi-la — desenhando frontends, gerando perguntas e orquestrando fluxos multi-agente — tudo em um ambiente de equipe real.

> 🃏 O aplicativo em si? Um jogo de Social Bingo. Os jogadores recebem um tabuleiro 5×5 com prompts divertidos ("Já visitou outro continente", "Tem mais de 3 plantas em casa") e circulam para encontrar pessoas que se encaixam. Quem fizer 5 em linha primeiro vence.

---

## 🚀 O que você vai construir

| Parte do Lab | O que você faz |
|--------------|---------------|
| [**00 — Visão Geral**](workshop/pt_BR/00-overview.md) | Orientação e checklist inicial |
| [**01 — Configuração & Contexto**](workshop/pt_BR/01-setup.md) | Configure o Copilot, escreva instruções de agente |
| [**02 — Design-First**](workshop/pt_BR/02-design.md) | Publique uma UI refinada com um agente de design de IA |
| [**03 — Quiz Master**](workshop/pt_BR/03-quiz-master.md) | Crie um agente personalizado que gera prompts de bingo |
| [**04 — Multi-Agente**](workshop/pt_BR/04-multi-agent.md) | Orquestre agentes trabalhando em paralelo |

---

## 🛠️ Stack

- **Backend:** Java 21 · Spring Boot 3.4.2 · Maven
- **Frontend:** Thymeleaf · Utilitários CSS personalizados
- **IA:** GitHub Copilot Agents (VS Code 1.107+)
- **Deploy:** GitHub Pages (automático no push para `main`)

---

## ⚡ Início Rápido

**Pré-requisitos:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) · GitHub Copilot

```bash
# Executar o app
cd socops
./mvnw spring-boot:run
# → abra http://localhost:8080
```

```bash
# Build e testes
./mvnw clean package
./mvnw test
```

---

## 📖 Leitura offline

Todos os guias do lab estão na pasta [`workshop/pt_BR/`](workshop/pt_BR/) — clone o repositório e leia sem precisar de internet.

---

<div align="center">

*Parte da série de workshops [GitHub Copilot Dev Days](https://copilot-dev-days.github.io/agent-lab-java/).*

</div>
