# 📚 Projeto Estudos Bíblicos - Programação Orientada a Objetos em Java

Este repositório foi criado com o objetivo de consolidar e praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)** utilizando a linguagem Java, aplicando modelagens estruturais baseadas em escritos bíblicos e literários.

## 🛠️ O que foi feito e conceitos aplicados

No desenvolvimento deste projeto, estruturamos um sistema de classes dividido em pacotes (`modelos`) e uma classe executável principal (`Main`). Foram aplicados os 3 pilares essenciais da POO:

1. **Herança (`extends`)**: Criamos a classe mãe `EscritoBiblico` contendo características genéricas comuns (`nome`, `testamento`, `capitulos`). As classes filhas `Carta` e `Livro` herdaram essa base automaticamente, evitando repetição de código.
2. **Encapsulamento (`private` / Getters e Setters)**: Protegemos os atributos de acessos externos diretos mudando-os para `private`. O acesso e modificação dos dados passou a ser controlado exclusivamente pelos métodos públicos `get` e `set`.
3. **Polimorfismo (`@Override`)**: O método `exibirDados()` foi sobrescrito nas classes filhas. Dessa forma, cada objeto sabe exibir suas particularidades de maneira customizada em tempo de execução.

---

## 📊 Diagrama de Classes UML

O diagrama abaixo ilustra a hierarquia das classes desenvolvidas e como os atributos e métodos estão distribuídos:

```mermaid
classDiagram
    class EscritoBiblico {
        - String nome
        - String testamento
        - int capitulos
        + EscritoBiblico(nome, testamento, capitulos)
        + getNome() String
        + setNome(nome) void
        + getTestamento() String
        + setTestamento(testamento) void
        + getCapitulos() int
        + setCapitulos(capitulos) void
        + exibirDados() void
    }

    class Carta {
        - String destinatario
        + Carta(nome, testamento, capitulos, destinatario)
        + getDestinatario() String
        + setDestinatario(destinatario) void
        + exibirDados() void
    }

    class Livro {
        - String genero
        + Livro(nome, testamento, capitulos, genero)
        + getGenero() String
        + setGenero(genero) void
        + exibirDados() void
    }

    EscritoBiblico <|-- Carta : Herda de (extends)
    EscritoBiblico <|-- Livro : Herda de (extends)
