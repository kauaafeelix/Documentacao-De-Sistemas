# 📚 Introduzindo JavaDoc

> Projeto educacional demonstrando o uso profissional de JavaDoc para documentação de código Java.

## 📖 Descrição

Este projeto é um guia prático e completo sobre como utilizar as anotações e tags do **JavaDoc** para criar documentação técnica de alta qualidade para código Java. Através de exemplos reais de um sistema de carrinho de compras, você aprenderá as melhores práticas de documentação.

## ✨ O que é JavaDoc?

JavaDoc é a ferramenta padrão para gerar documentação de APIs em formato HTML a partir de comentários especiais no código-fonte Java. É amplamente utilizado na indústria para:

- 📝 Documentar APIs públicas
- 🤝 Facilitar colaboração entre desenvolvedores
- 📖 Gerar documentação navegável e profissional
- ✅ Manter código e documentação sincronizados

## 🏗️ Estrutura do Projeto

```
IntroduzindoJavaDoc/
├── src/
│   ├── Main.java              # Classe principal
│   └── com/
│       └── aula/
│           ├── Produto.java   # Demonstra tags @param, @return, @throws
│           └── Carrinho.java  # Demonstra documentação de classe
└── [documentação HTML gerada pelo JavaDoc]
```

## 🎯 Classes e Conceitos

### 📦 Produto.java
Demonstra o uso de:
- ✅ **`@author`** - Identificação do autor
- ✅ **`@version`** - Versionamento da classe
- ✅ **`@param`** - Documentação de parâmetros
- ✅ **`@return`** - Documentação de retorno
- ✅ **`@throws`** - Documentação de exceções
- ✅ **`@deprecated`** - Marcação de métodos obsoletos
- ✅ **`@apiNote`** - Notas sobre o uso da API
- ✅ **`@implSpec`** - Especificação de implementação

**Métodos documentados:**
- `aplicarDesconto(double percentual)` - Aplica desconto com validação
- `calcularImposto()` - Calcula impostos federais
- `descontoAntigo()` - Exemplo de método deprecado

### 🛒 Carrinho.java
Representa o carrinho de compras do cliente com documentação completa.

## 🚀 Como Gerar a Documentação

### Opção 1: Comando básico
```bash
javadoc -d doc src/com/aula/*.java
```

### Opção 2: Com codificação UTF-8
```bash
javadoc -d doc -encoding UTF-8 -charset UTF-8 -sourcepath src -subpackages com.aula
```

### Opção 3: Com informações adicionais
```bash
javadoc -d doc \
  -author \
  -version \
  -use \
  -windowtitle "Documentação - Introdução JavaDoc" \
  -doctitle "Sistema de Produtos e Carrinho" \
  -header "Projeto Educacional" \
  -encoding UTF-8 \
  -charset UTF-8 \
  src/com/aula/*.java
```

## 📊 Tags JavaDoc Demonstradas

| Tag | Descrição | Exemplo |
|-----|-----------|---------|
| `@author` | Autor da classe | `@author Kauã Felix` |
| `@version` | Versão da classe | `@version 1.0` |
| `@param` | Parâmetro do método | `@param percentual desconto a ser aplicado` |
| `@return` | Valor retornado | `@return preço final após desconto` |
| `@throws` | Exceção lançada | `@throws IllegalArgumentException se percentual inválido` |
| `@deprecated` | Marca como obsoleto | `@deprecated Use aplicarDesconto()` |
| `@see` | Referência relacionada | `@see Carrinho` |
| `@since` | Versão de introdução | `@since 1.0` |
| `@apiNote` | Nota sobre API | `@apiNote Considera impostos federais fixos` |
| `@implSpec` | Especificação | `@implSpec Usado apenas para cálculo estimado` |

## 🎓 Conceitos Aprendidos

- ✅ Sintaxe e estrutura de comentários JavaDoc
- ✅ Tags essenciais e suas aplicações
- ✅ Documentação de parâmetros e retornos
- ✅ Tratamento e documentação de exceções
- ✅ Marcação de código legado com `@deprecated`
- ✅ Geração de documentação HTML navegável
- ✅ Boas práticas de documentação técnica

## 🔍 Visualizando a Documentação

Após gerar a documentação, abra o arquivo `doc/index.html` no seu navegador para navegar pela documentação gerada.

## 💡 Dicas de Boas Práticas

1. **Seja claro e objetivo** - Documentação deve ser fácil de entender
2. **Documente o "porquê"** - Não apenas o "o quê"
3. **Mantenha atualizado** - Sincronize código e documentação
4. **Use exemplos** - Quando apropriado, inclua exemplos de uso
5. **Documente exceções** - Sempre documente quando e por que exceções são lançadas

## 👨‍💻 Autor

**Kauã Felix da Silva Costa**

## 📝 Licença

Este é um projeto educacional para ensino de documentação JavaDoc.

---

<div align="center">

**[⬆ Voltar ao topo](#-introduzindo-javadoc)**

</div>
