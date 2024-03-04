# Kidlang para crianças

Kidlang é uma linguagem de programação feita especialmente para o fácil aprendizado de linguagens de programação por crianças de 8 a 10 anos. O intuito é ter elementos em português fáceis o bastante para o entendimento e compreensão mas diferente do VisualG, é possível realizar atividades mais avançadas e executar algoritmos.

<center><img style="align-self:center" src='https://github.com/LeonardoFariaOliveira/TrabalhoFinalCompiladores/assets/89713903/2728fc9d-c99e-404c-8483-0a4bb728392e' /></center>

## Compilando o Kidlang

Para executar o processo de compilação deve-se ter:
  -VS Code
  -Dotnet a partir da versão 6
  -Extensão C#(opcional porém facilita a execução)

Com tudo instalado, você deve baixar os arquivos da linguagem e executar

## Explorando a sintaxe



### Tipos que a linguagem aceita

Numero: tipo que representa numeros inteiros, geralmente referenciado com int;
Texto: tipo que representa textos, geralmente referenciado com string;
Decimal: tipo que representa numeros decimais, geralmente referenciado com double;
Bit: tipo que representa numeros booleanos (verdadeiro ou falso), geralmente referenciado como boolean;
Potinho: tipo que guarda outros tipos, um vetor, geralmente referenciado como array;

```

numero read x;

texto teste = "Kidlang";

write teste;

```


### Funções
```
function function_name(arguments){
//code block
}
```

### Entrada e saída
```
write "message";
read variable;

```

### Laço de repetição: FOR
```
for(variable; condition; increment){
//code block
}
```
### Laço de repetição: WHILE
```
while(condition){
//code block
}
```
### Condições: IF-ELSE
```
if(condition){
//code block
} else {
//code block
}
```
## Exemplo para testar em casa


# Lição 1 -  Declarar variável
```
numero licao1 = 1;
```

# Lição 2 -  Ler e exibir valores
```
write "Quantas letras tem um alfabeto?";
read num1;
write num1;
write "Quantas letras possui a palavra 'KidLang'";
read num2;
write num2;
write "Qual a nota que você daria para a KidLang:";
read num3;
write num3;
```

# Lição 3 -  Testar as condições
```
numero testavel = 1;
if(testavel = 1){
  write "Kidlang eh 10!!!";
}
else{
  write "Kidlang eh mil milhões";
}
```

# Lição 4 -  Faça tarefas(funções)
```
function somar(num1, num2){
    write num1 + num2;
}

somar(1, 1);
```

# Lição 5 -  Faça repetições com FOR
```
for(numero i; i < 10; numero i = i + 1){
    write i;
};
```


# Lição 6 -  Faça repetições com WHILE
```
while(i < 10){
    write i;
    i = i + 1;
};
```


# E muito mais!!!
