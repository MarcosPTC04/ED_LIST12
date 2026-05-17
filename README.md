## 📌 Descrição

Este repositório apresenta a implementação completa de uma Lista Dinâmica Encadeada Genérica em Java. O projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais de Estruturas de Dados, incluindo manipulação de nós encadeados, gerenciamento de referências na memória, uso de interfaces genéricas e organização modular do código.

A aplicação implementa operações essenciais de uma Linked List, como inserção, remoção, busca, ordenação e controle do tamanho da estrutura, além da criação de testes para validação do funcionamento da lista em diferentes cenários.

---

## 🛠 Recursos Utilizados

Linguagem: Java  
IDE: IntelliJ IDEA  
Controle de versão: Git  
Plataforma de hospedagem: GitHub  

---

## 📋 Estrutura do Código

🔹 Interface MyList<T>

Define as operações obrigatórias da lista dinâmica encadeada, incluindo:

Inserção de elementos  
Remoção de elementos  
Busca e consulta  
Ordenação da lista  
Controle de tamanho  
Verificação de lista vazia  

---

🔹 Classe MyLinkedList<T>

Responsável pela implementação concreta da lista dinâmica encadeada, contendo:

Referência para o primeiro nó (`head`)  
Controle do tamanho da lista (`size`)  
Implementação de todos os métodos definidos na interface  
Manipulação dinâmica dos nós através de referências  

---

🔹 Classe Node<T>

Representa os nós da estrutura encadeada, contendo:

Valor armazenado  
Referência para o próximo nó da lista  

---

🔹 Classe Exercise01

Responsável pela execução prática da estrutura, demonstrando o funcionamento das operações da lista através de exemplos de inserção, remoção, busca e ordenação.

---

🔹 Classe MyLinkedListTests

Responsável pelos testes da aplicação, validando:

Inserção em lista vazia  
Remoção de elementos existentes e inexistentes  
Busca de elementos  
Ordenação da lista  
Controle correto do tamanho da estrutura  

---

## ⚙️ Observações sobre a implementação

Estrutura baseada em nós encadeados  
Uso de referências dinâmicas entre elementos  
Implementação genérica utilizando `<T>`  
Separação entre interface, estrutura, exercícios e testes  
Organização em packages padronizados em inglês  
Manipulação eficiente de ponteiros de referência  

---

## ▶️ Exemplos de Execução

```text
Lista vazia? true

Elemento índice 0: 10
Elemento índice 1: 20
Elemento índice 2: 30

Contém 20? true

Lista após ordenação:
10
20
30
```
---

## 👨‍💻 Autor

Marcos Antonio  
Curso: Análise e Desenvolvimento de Sistemas  
Disciplina: Estrutura de Dados I  
