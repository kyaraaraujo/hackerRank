## Desafio 
## Java Output Formatting
link: https://www.hackerrank.com/challenges/java-output-formatting/problem

### Objetivo do desafio:

Compreender sobre a formatação do printf em Java

### Objetivo desse arquivo:
Para fins de estudos

### Pesquisas:
 - https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 - https://www.jquery-az.com/10-examples-learn-java-string-formatting-printf-method/

### Explicação da solução

O printf pode ser usado para realizar formatações de diversos tipos (string, float, datas, etc), utilizando `%` + formatações.

Ao inserir quantidade de caracteres String, ex `%10s`, será completado com espaços em branco se o valor passado for inferior, nesse caso, a 10 characteres.
```java
String exemplo = "teste";
System.out.printf("%10s", exemplo); 
// a impressão é  "     teste", pois "teste" ocupa apenas 5 espaços e por default está justificada à direita
```

Ao inserir o sinal `-`, ficará justificado à esquerda e os espaços vazios ficarão à direita:
```java
String exemplo = "teste";
System.out.printf("%-10s", exemplo); 
// a impressão é "teste     ", pois "teste" ocupa apenas 5 espaços e o sinal - formata para ser justificada à esquerda
```
No desafio também pede formatação de decimal inteiro, e caso o valor seja inferior que 3 dígitos, deverá ser completado com um `0` à esquerda.
```java
int exemplo = 7;
System.out.printf("%03d", exemplo); 
// a impressão é 007
```

Para o desafio, as duas formatações deveriam ser impressas na mesma linha a cada par de entradas, por isso no final da formatação se acrescenta `\n` (também poderia ser `%n`) para quebrar a linha. O 16º caractere deveria ser o inteiro, para que na impressão não seja o 17º precisa ficar com as duas formatações juntas, sem espaço entre elas.

### Agradecimento
- Ao meu colega de turma do Reset [Rodrigo Ramos](https://github.com/RodrigoGreff3D) por ter compartilhado esse desafio.

---
⬆ [Voltar ao início](#desafio)