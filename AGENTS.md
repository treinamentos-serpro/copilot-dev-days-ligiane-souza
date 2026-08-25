# Instruções do projeto

## Checklist obrigatório

Antes de concluir qualquer alteração, execute:

```bash
cd socops && ./mvnw validate   # lint/validação Maven disponível
cd socops && ./mvnw clean package
cd socops && ./mvnw test
```

## Contexto

- Social Bingo: Spring Boot 3.4.2, Java 21, Maven Wrapper em `socops/`.
- UI: `socops/src/main/resources/templates/game.html` (Thymeleaf).
- Web: `BingoRestController` serve `/` e `/api/bingo/fresh-board`.
- Lógica pura: `BoardAssembler`; testes: `socops/src/test/`.

## Execução

```bash
cd socops && ./mvnw spring-boot:run
```

A aplicação fica em `http://localhost:8080/`, salvo configuração em `application.properties`.

## Convenções de implementação

- Separe web, modelos, prompts e lógica de serviço.
- Mantenha `BoardAssembler` determinístico, testável e sem Spring desnecessário.
- Altere regras somente com testes atualizados em `socops/src/test/`.
- Use o template Thymeleaf e as classes de `socops/src/main/resources/static/css/app.css`.
- Não edite `socops/target/`.

## Documentação

- [README.pt_BR.md](README.pt_BR.md) e [workshop/pt_BR/GUIDE.md](workshop/pt_BR/GUIDE.md)
- [Instruções de frontend](.github/instructions/frontend-design.instructions.md) e [CSS](.github/instructions/css-utilities.instructions.md)
