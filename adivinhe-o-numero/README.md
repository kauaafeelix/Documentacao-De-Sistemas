# 🎯 Adivinhe o Número

> Um jogo interativo de adivinhação de números desenvolvido em Java com documentação completa JavaDoc.

## 📖 Descrição

Este projeto implementa um jogo divertido onde o jogador deve adivinhar um número aleatório entre 1 e 100. O sistema fornece dicas se o número digitado é maior ou menor que o número secreto, utilizando arquitetura MVC (Model-View-Controller) e boas práticas de programação orientada a objetos.

## ✨ Funcionalidades

- 🎲 Geração de número aleatório entre 1 e 100
- 💬 Sistema de dicas interativo (maior/menor)
- 📊 Contador de tentativas
- 🎨 Interface via console amigável
- 📚 Documentação completa com JavaDoc

## 🏗️ Arquitetura

O projeto segue o padrão **MVC (Model-View-Controller)** para melhor organização e manutenibilidade:

```
adivinhe-o-numero/
├── src/
│   ├── Aplicacao.java           # Classe principal
│   ├── model/
│   │   └── Numero.java          # Modelo - representa o número e tentativas
│   ├── service/
│   │   └── NumeroService.java   # Lógica de negócio
│   └── view/
│       └── NumeroView.java      # Interface com o usuário
└── javadoc/
    └── [documentação gerada]
```

## 🎮 Como Jogar

1. **Compile o projeto:**
   ```bash
   javac src/Aplicacao.java src/model/*.java src/service/*.java src/view/*.java
   ```

2. **Execute o jogo:**
   ```bash
   java -cp src Aplicacao
   ```

3. **Adivinhe o número:**
   - Digite um número entre 1 e 100
   - Receba dicas se seu palpite é maior ou menor
   - Continue tentando até acertar!

## 📦 Componentes

### 🎯 Model
- **`Numero.java`**: Armazena o número aleatório e o contador de tentativas

### ⚙️ Service
- **`NumeroService.java`**: Implementa a lógica de verificação e comparação de números

### 🖥️ View
- **`NumeroView.java`**: Gerencia a entrada e saída de dados com o usuário

### 🚀 Application
- **`Aplicacao.java`**: Ponto de entrada do programa, coordena o fluxo do jogo

## 📚 Documentação JavaDoc

Para gerar a documentação completa do projeto:

```bash
javadoc -d javadoc -sourcepath src -subpackages model:service:view -encoding UTF-8 -charset UTF-8
```

Ou para incluir explicitamente a classe principal:

```bash
javadoc -d javadoc -encoding UTF-8 -charset UTF-8 src/Aplicacao.java src/model/*.java src/service/*.java src/view/*.java
```

A documentação gerada estará disponível em `javadoc/index.html`.

## 🎓 Conceitos Demonstrados

- ✅ Programação Orientada a Objetos (POO)
- ✅ Padrão de arquitetura MVC
- ✅ Separação de responsabilidades
- ✅ Documentação JavaDoc completa
- ✅ Interação com usuário via console
- ✅ Geração de números aleatórios
- ✅ Estrutura de repetição e controle de fluxo

## 👨‍💻 Autor

**Kauã Felix da Silva Costa**

## 📝 Licença

Este é um projeto educacional para demonstração de documentação JavaDoc.

---

<div align="center">

**[⬆ Voltar ao topo](#-adivinhe-o-número)**

</div>
