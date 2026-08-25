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

## Guia de design

- Preserve a direção visual **Corporate Clean Blue**: azul-marinho para estrutura, azul vivo para ações, neutros claros para superfícies e verde ou dourado somente para estados do jogo.
- Priorize uma interface profissional, objetiva e escaneável; evite aparência genérica, excesso de cards, gradientes decorativos e elementos que não apoiem o fluxo do bingo.
- Mantenha a hierarquia visual entre lobby, tabuleiro ativo e vitória. O tabuleiro deve ser o foco da partida e continuar legível em telas estreitas sem overflow horizontal.
- Use variáveis CSS para cores e medidas compartilhadas. Prefira as classes e padrões existentes em `app.css`; crie novos utilitários de responsabilidade única quando necessário.
- Preserve estados claramente distinguíveis para casa disponível, marcada, livre e pertencente à linha vencedora. Estados de hover, active, foco e disabled devem ser visíveis.
- Garanta acessibilidade básica: HTML semântico, textos em português do Brasil, foco de teclado visível, contraste adequado e atributos ARIA quando o estado não for evidente visualmente.
- Prefira CSS vanilla e animações discretas compatíveis com Thymeleaf. Não adicione frameworks ou fontes externas sem necessidade explícita.
- Ao alterar a UI, valide lobby, início de partida, seleção, desseleção, persistência, vitória e comportamento responsivo em desktop e mobile.

## Documentação

- [README.pt_BR.md](README.pt_BR.md) e [workshop/pt_BR/GUIDE.md](workshop/pt_BR/GUIDE.md)
- [Instruções de frontend](.github/instructions/frontend-design.instructions.md) e [CSS](.github/instructions/css-utilities.instructions.md)
