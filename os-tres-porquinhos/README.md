# 🐷 Os Três Porquinhos

> Uma implementação criativa e educacional da história clássica dos Três Porquinhos usando Java e Programação Orientada a Objetos.

## 📖 Descrição

Este projeto traz para o mundo da programação a famosa história dos três porquinhos e o lobo mau! Através de conceitos de **Orientação a Objetos**, **interfaces** e **polimorfismo**, demonstramos como diferentes materiais de construção oferecem diferentes níveis de resistência aos sopros do lobo.

## ✨ A História em Código

Era uma vez três porquinhos que construíram suas casas com diferentes materiais:
- 🌾 **Primeiro Porquinho**: Construiu uma casa de palha (rápida mas frágil)
- 🪵 **Segundo Porquinho**: Construiu uma casa de madeira (melhor mas não suficiente)
- 🧱 **Terceiro Porquinho**: Construiu uma casa de tijolo (forte e resistente)

Quando o lobo mau aparece e sopra as casas, cada material reage de forma diferente, demonstrando o conceito de polimorfismo em ação!

## 🏗️ Arquitetura do Projeto

```
os-tres-porquinhos/
├── src/
│   ├── Main.java                    # História principal
│   ├── animais/
│   │   ├── LoboMau.java            # 🐺 O vilão da história
│   │   └── Porquinho.java          # 🐷 Os três heróis
│   └── casa/
│       ├── Casa.java               # 🏠 Interface base
│       ├── CasaDePalha.java        # 🌾 Casa frágil
│       ├── CasaDeMadeira.java      # 🪵 Casa média
│       └── CasaDeTijolo.java       # 🧱 Casa resistente
└── javadoc/
    └── [documentação gerada]
```

## 🎮 Como Executar

1. **Compile o projeto:**
   ```bash
   javac src/Main.java src/animais/*.java src/casa/*.java
   ```

2. **Execute a história:**
   ```bash
   java -cp src Main
   ```

3. **Assista à história se desenrolar:**
   - Os porquinhos constroem suas casas
   - O lobo mau tenta derrubar cada casa
   - Veja quais casas resistem aos sopros!

## 🎯 Componentes e Conceitos

### 🐺 Pacote `animais`

#### **LoboMau.java**
Representa o antagonista com seu temível sopro:
- 💨 **`soprar(Casa casa)`** - Tenta derrubar uma casa
- Demonstra interação entre objetos
- Usa polimorfismo via interface `Casa`

#### **Porquinho.java**
Representa os três porquinhos protagonistas:
- 🏗️ **`construirCasa(Casa casa)`** - Constrói uma casa
- Demonstra associação entre classes
- Cada porquinho escolhe seu material

### 🏠 Pacote `casa`

#### **Casa.java** (Interface)
Define o contrato para todas as casas:
- 📋 `getMaterial()` - Retorna o material da casa
- 🔨 `construir()` - Constrói a casa
- 💥 `receberSopro()` - Recebe ataque do lobo
- 📊 `getStatusAtual()` - Verifica estado da casa
- 🛡️ `getResistencia()` - Nível de resistência

#### **CasaDePalha.java** 🌾
- **Resistência:** ⭐ Baixa (1 sopro)
- **Material:** Palha
- **Status:** Facilmente destruída

#### **CasaDeMadeira.java** 🪵
- **Resistência:** ⭐⭐ Média (2 sopros)
- **Material:** Madeira
- **Status:** Parcialmente resistente

#### **CasaDeTijolo.java** 🧱
- **Resistência:** ⭐⭐⭐ Alta (3+ sopros)
- **Material:** Tijolo
- **Status:** Altamente resistente

## 🎓 Conceitos de POO Demonstrados

| Conceito | Implementação |
|----------|---------------|
| **Abstração** | Interface `Casa` define estrutura comum |
| **Encapsulamento** | Atributos privados com getters/setters |
| **Herança** | Classes de casa implementam interface `Casa` |
| **Polimorfismo** | Diferentes casas reagem diferente ao sopro |
| **Composição** | Porquinho possui uma Casa |
| **Interface** | `Casa` define contrato para todas casas |

## 📚 Documentação JavaDoc

Para gerar a documentação completa:

```bash
javadoc -d javadoc \
  -sourcepath src \
  -subpackages animais:casa \
  -encoding UTF-8 \
  -charset UTF-8 \
  -windowtitle "Os Três Porquinhos - Documentação" \
  -doctitle "Projeto: Os Três Porquinhos" \
  src/Main.java
```

A documentação estará disponível em `javadoc/index.html`.

## 🎨 Exemplo de Saída

```
Bem-vindo à história dos Três Porquinhos!

Porquinho construiu uma casa de Palha
Porquinho construiu uma casa de Madeira
Porquinho construiu uma casa de Tijolo

Lobo Mau sopra a casa de Palha...
💨 WHOOOOSH! A casa foi destruída!
Status da casa de Palha: Destruída

Lobo Mau sopra a casa de Madeira...
💨 WHOOOOSH! A casa foi destruída!
Status da casa de Madeira: Destruída

Lobo Mau sopra a casa de Tijolo...
💪 A casa resistiu ao sopro!
Status da casa de Tijolo: De pé
```

## 💡 Aprendizados

- ✅ Implementação de interfaces em Java
- ✅ Polimorfismo através de diferentes comportamentos
- ✅ Composição de objetos (Porquinho tem Casa)
- ✅ Encapsulamento de atributos e comportamentos
- ✅ Uso de enums ou constantes para estados
- ✅ Documentação JavaDoc completa e detalhada
- ✅ Modelagem de histórias/cenários do mundo real em código

## 🎯 Moral da História (em Código)

Assim como na história original, este projeto demonstra que:
- 📋 **Planejamento importa:** Interface bem definida = código organizado
- 🏗️ **Qualidade supera velocidade:** Casa de tijolo (código robusto) resiste melhor
- 🔄 **Reutilização:** Interface permite diferentes implementações
- 📚 **Documentação:** JavaDoc ajuda outros desenvolvedores entenderem o código

## 👨‍💻 Autor

**Kauã Felix da Silva Costa**

## 📝 Licença

Este é um projeto educacional para demonstração de conceitos de POO e documentação JavaDoc.

---

<div align="center">

**[⬆ Voltar ao topo](#-os-três-porquinhos)**

Made with ❤️ and Java ☕

</div>
