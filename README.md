[![CI](https://github.com/rvwell/devcalc-api/actions/workflows/CI.yml/badge.svg?event=workflow_dispatch)](https://github.com/rvwell/devcalc-api/actions/workflows/CI.yml)

# DevCalc API

## TP1 - Pipelines de CI/CD e DevOps
## TP2 - Pipelines de CI/CD e DevOps

Faça o clone e execute os testes

TP2 - Provocando e Corrigindo um Erro no Pipeline

![image](https://github.com/user-attachments/assets/d4c108ad-e8df-4c9f-8881-e66883488275)

O log na saida do comando mostrou o erro visto na imagem, onde mostra o comando que foi executado e a tentativa de execução, o que permite identificar a localização do erro.

## TP3 - Pipelines de CI/CD e DevOps

### Configuração de Runner Auto-Hospedado

Foi configurado um runner auto-hospedado e um workflow chamado self-hosted.yml para testá-lo.

![img.png](img.png)

### Uso de Variáveis e Secrets no Workflow

Foi criado um workflow de exemplo chamado variables-secrets.yml que exemplifica a utilização de variáveis e secrets em um workflow

### Contextos e Escopos de Variáveis de Ambiente

Com o uso de variáveis no workflow env-context-demo.yml pode se exemplificar o scope de uma variável e como suas modificações afetam o seu valor.

### 4.	Controle de Permissões e Uso do GITHUB_TOKEN

O permission-control.yml exemplifica o uso do GITHUB_TOKEN como meio de autenticação para criar Issues de forma automatizada.

### Ambientes de Deploy para Dev e Prod

Com a criação de environments é possível criar variáveis especificas para cada situação e o workflow ambientes-de-deploy.yml mostra como fazer e acessar essas variáveis.

### Implementação e Integração de Nova Funcionalidade na API

Foi criado um método na classe service e um endpoint sqrt, bem como dois testes unitários para o cálculo da raiz quadrada.