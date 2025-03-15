# Sistema de Gestão de Projetos Sustentáveis

Este é um projeto em Java que simula o gerenciamento de projetos sustentáveis em uma organização. O sistema permite criar e gerenciar diferentes tipos de organizações (como ONGs ou Empresas), registrar projetos sustentáveis e associar voluntários a esses projetos. O sistema também gera relatórios de impacto e calcula o impacto ambiental dos projetos, como árvores plantadas, redução de CO2 ou energia gerada.

## Funcionalidades

### Gerenciamento de Organizações

- O sistema permite criar diferentes tipos de organizações (ONGs e Empresas) e associar projetos sustentáveis a essas organizações.

### Gerenciamento de Projetos Sustentáveis

Você pode criar diferentes tipos de projetos sustentáveis:

- **Projeto de Reflorestamento**: contabiliza árvores plantadas e redução de CO2.
- **Projeto de Reciclagem**: contabiliza toneladas recicladas e redução de CO2.
- **Projeto de Energia Renovável**: contabiliza energia gerada e redução de CO2.

### Associação de Voluntários aos Projetos

- Os voluntários podem se inscrever em projetos e participar das atividades relacionadas.

### Relatórios de Impacto

- O sistema gera relatórios que incluem informações detalhadas sobre o impacto ambiental de cada projeto (ex: árvores plantadas, toneladas recicladas, energia gerada) e o impacto ambiental direto (ex: redução de CO2).

### Cálculo de Impacto Ambiental

- Cada tipo de projeto implementa o método `calcularImpacto()`, o qual é responsável por calcular e exibir o impacto ambiental do projeto (ex: quantidade de CO2 reduzido).
