# IntroduzindoJavaDoc

Projeto de introdução ao uso de JavaDoc para documentação de código Java.

## Descrição

Este projeto demonstra como utilizar as anotações e tags do JavaDoc para documentar classes e métodos em Java.

## Estrutura

```
IntroduzindoJavaDoc/
├── src/
│   ├── Main.java
│   └── com/
│       └── aula/
│           ├── Produto.java
│           └── Carrinho.java
└── [arquivos de documentação gerados pelo JavaDoc]
```

## Classes

- **Produto**: Representa um produto para compra, com métodos para aplicar desconto e calcular imposto.
- **Carrinho**: Representa o carrinho de compras do cliente.

## Como Gerar a Documentação

Execute o comando JavaDoc no diretório do projeto:

```bash
javadoc -d docs src/com/aula/*.java
```
