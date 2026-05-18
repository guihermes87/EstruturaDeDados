# 📚 Estrutura de Dados

Repositório de estudos de **Estrutura de Dados**, com exercícios e projetos desenvolvidos em **Java**, **Python** e **C**.

---

## 🗂️ Índice

- [01 - Introdução](#01---introdução)
- [02 - Listas](#02---listas)
- [03 - Filas](#03---filas)
- [04 - Matrizes Especiais](#04---matrizes-especiais)
- [05 - Recursão](#05---recursão)
- [Projetos](#projetos)

---

## 01 - Introdução

> **Linguagem:** C  
> **Pasta:** `01-Introducao/C/`

Exercícios iniciais de programação, incluindo leitura de dados, variáveis e operações básicas.

| Arquivo | Descrição |
|---------|-----------|
| `Aulainicial.c` | Aula inicial — conceitos básicos de entrada/saída em C |
| `diabetico1.c` | Cálculo de insulina para diabéticos: lê boulus e quantidade de carboidratos, calcula dose necessária e exibe resumo diário |

---

## 02 - Listas

> **Linguagens:** Java, Python  
> **Pastas:** `02-Listas/Java/` e `02-Listas/Python/`

Implementações e operações com estruturas de lista (ArrayList, List, Iterator).

### Java

| Arquivo | Descrição |
|---------|-----------|
| `Colecoes.java` | Demonstração prática de `ArrayList`, `Stack` (Pilha) e `Queue` (Fila) com anotações sobre LIFO e FIFO |
| `Estrutura.java` | Operações completas com `ArrayList<Processo>`: inserir, exibir (ordenado), localizar e remover com Iterator e Stream |
| `Processo.java` | Classe modelo `Processo` com `id` e `descricao`, com `equals()`, `hashCode()` e `toString()` sobrescritos |
| `Exemplolista.java` | Cadastro de alunos com validação de CPF, ordenação por nome e controle de duplicatas |
| `Util.java` | Classe utilitária com método `cpfValido()` — valida formato e dígitos do CPF |

### Python

| Arquivo | Descrição |
|---------|-----------|
| `lista.py` | Exemplo básico de criação e manipulação de lista em Python |

---

## 03 - Filas

> **Linguagem:** Java  
> **Pasta:** `03-Filas/Java/`

Implementação de fila normal e fila prioritária com regra de alternância de atendimento.

| Arquivo | Descrição |
|---------|-----------|
| `Chamando.java` | Sistema de chamada com dois tipos de fila: normal e prioritária. A cada 3 atendimentos, 1 prioritário é chamado. Usa `Queue<Integer>` com `LinkedList` |

---

## 04 - Matrizes Especiais

> **Linguagens:** Java, Python  
> **Pastas:** `04-Matrizes/Java/` e `04-Matrizes/Python/`

Manipulação de matrizes esparsas com conversão para lista de objetos não nulos.

### Java

| Arquivo | Descrição |
|---------|-----------|
| `Matrizes.java` | Métodos estáticos para inicializar, imprimir e converter matriz para lista de objetos `Dado` |
| `Dado.java` | Classe modelo para representar um elemento não nulo da matriz com valor, linha e coluna |
| `Principal.java` | Programa principal que instancia e testa as operações de matrizes |

### Python

| Arquivo | Descrição |
|---------|-----------|
| `Matrizes.py` | Versão Python das operações de matrizes |
| `Dado.py` | Classe `Dado` em Python |
| `teste_matriz.py` | Testes das funções de matrizes |

---

## 05 - Recursão

> **Linguagem:** Java  
> **Pasta:** `05-Recursao/Java/`

Exercícios de recursão com ArrayList de inteiros.

| Arquivo | Descrição |
|---------|-----------|
| `Recursao.java` | Implementa recursivamente: exibição, soma, contagem de pares, contagem de ocorrências, substituição de valor, verificação de ordenação (`isSortedR`) e exibição de múltiplos de 4 |

---

## Projetos

### 🩺 Glicemia

> **Pasta:** `Projetos/Glicemia/`  
> **Linguagens:** Java e Python

Sistema de registro e análise de índices glicêmicos lidos de arquivo CSV.

#### Java — `Projetos/Glicemia/Java/`

| Arquivo | Descrição |
|---------|-----------|
| `Glicemia.java` | Classe modelo com `valor`, `data` e `hora` |
| `Splitar.java` | Lê e parseia uma linha CSV, cria objeto `Glicemia` e adiciona à lista com verificação de duplicatas |
| `Principal.java` | Demonstra 3 formas de instanciar e adicionar objetos `Glicemia` à lista |

#### Python — `Projetos/Glicemia/Python/`

| Arquivo | Descrição |
|---------|-----------|
| `Principal.py` | Programa principal: lê `dados.csv`, popula lista e exibe resultados |
| `minhas_funcoes.py` | Funções auxiliares: `popular_lista_arquivo`, `exibir_lista`, `calcular_media` e `calcular_mediana` |
| `dados.csv` | Base de dados com registros de glicemia |

---

### 🌤️ Análise Climática

> **Pasta:** `Projetos/AnaliseClimatica/Python/`  
> **Linguagem:** Python

Sistema de consulta e análise de dados climáticos lidos de arquivo CSV.

| Arquivo | Descrição |
|---------|-----------|
| `Clima.py` | Classe modelo `Clima` com atributos de temperatura e precipitação |
| `funcoes.py` | Funções de análise: `media_graus`, `exibir_resumo`, `mes_mais_frequente` |
| `Principal.py` | Menu interativo com 5 opções: meses quentes, chuvosos, secos, frios e comparativo quente vs frio |
| `base.csv` | Base de dados climáticos |

---

### 🎓 Trabalho — CRUD de Alunos

> **Pasta:** `Projetos/TrabalhoAluno/`  
> **Linguagem:** Java

Sistema de gerenciamento de alunos com operações de ordenação, busca e agrupamento por ano.

| Arquivo | Descrição |
|---------|-----------|
| `Aluno.java` | Classe modelo `Aluno` com `nome`, `ano` e outros atributos |
| `Funcoes.java` | Funções: `OrdenarPorAno`, `buscarAlunoPorNome`, `calcularAlunosPorAno` usando `HashMap` |
| `Principal.java` | Programa principal que lê o arquivo CSV e orquestra as operações |
| `alunos.csv` | Base de dados com registros de alunos |

---

## 🛠️ Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=flat&logo=python&logoColor=white)
![C](https://img.shields.io/badge/C-00599C?style=flat&logo=c&logoColor=white)

---

*Repositório mantido por Guilherme — estudos de Estrutura de Dados*
