# 🚀 Lista 04 - Estruturas de Controle

📚 Repositório criado para a atividade de Algoritmos e Programação
🎓 Centro Universitário UNA
👩‍💻 Aluna: Isabela da Silva Freitas

---

## 🧠 Sobre a Atividade

Nesta lista, o objetivo foi praticar **Estruturas de Controle**, com foco na tomada de decisão dentro dos programas.

Mais do que apenas realizar cálculos, o desafio foi entender **como o código decide qual caminho seguir**, de acordo com os dados fornecidos pelo usuário.

---

## 🔀 Operadores Lógicos

Os **operadores lógicos** são utilizados para combinar duas ou mais condições dentro de uma estrutura de decisão (`if`), permitindo criar regras mais completas e inteligentes.

---

### ✅ Operador E (AND - &&)

O operador **E** retorna verdadeiro **somente quando todas as condições são verdadeiras**.

📌 Exemplo:

```java
if (idade >= 18 && possuiCarteira) {
    System.out.println("Pode dirigir");
}
```

👉 Aqui, a pessoa só pode dirigir se **for maior de idade E tiver carteira**.

---

### 🔁 Operador OU (OR - ||)

O operador **OU** retorna verdadeiro quando **pelo menos uma das condições é verdadeira**.

📌 Exemplo:

```java
if (dia.equals("sábado") || dia.equals("domingo")) {
    System.out.println("Fim de semana!");
}
```

👉 Basta ser sábado **OU** domingo.

---

### ❌ Operador NÃO (NOT - !)

O operador **NÃO** inverte o valor lógico de uma condição.

📌 Exemplo:

```java
if (!logado) {
    System.out.println("Usuário não está logado");
}
```

👉 Se `logado` for falso, o `!` transforma em verdadeiro.

---

## 💡 Por que usar operadores lógicos?

Eles permitem criar condições mais completas dentro de um único `if`, evitando múltiplas verificações separadas e deixando o código:

✔ Mais organizado
✔ Mais legível
✔ Mais eficiente

---

## 🛠️ Estrutura do Projeto

📁 una-algprog-lista04
┣ 📄 arquivos `.java` com os exercícios
┗ 📄 README.md (este arquivo)

---

## 🎯 Conclusão

Essa atividade foi essencial para entender como os programas **tomam decisões**, utilizando lógica para resolver problemas do mundo real.
