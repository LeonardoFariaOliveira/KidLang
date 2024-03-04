# Kidlang para crianças

Kidlang é uma linguagem de programação feita especialmente para o fácil aprendizado de linguagens de programação por crianças de 6 a 10 anos. O intuito é ter elementos em português fáceis o bastante para o entendimento e compreensão mas diferente do VisualG, é possível realizar atividades mais avançadas e executar algoritmos.
A proposta do projeto é ter uma documentação que indique lições para os tutores passarem para as crianças e conforme persiste a evolução do aprendizado, novos conceitos são apresentados. No momento começamos da lição 1 que fala como declarar uma variável e vamos até a 6 que fala de laços de repetição com while.

<center><img style="align-self:center" src='https://github.com/LeonardoFariaOliveira/TrabalhoFinalCompiladores/assets/89713903/2728fc9d-c99e-404c-8483-0a4bb728392e' /></center>

## Compilando o Kidlang

Para executar o processo de compilação deve-se ter:
<br>
<ul>
  <li>VS Code</li> 
  <li>Dotnet a partir da versão 6</li>
  <li>Extensão C#(opcional porém facilita a execução)</li>
</ul>
<br>
Com tudo instalado, você deve baixar os arquivos da linguagem e executar

## Explorando a sintaxe



### Tipos que a linguagem aceita

<ul>
  <li>Numero: tipo que representa numeros inteiros, geralmente referenciado com int;</li>
  <li>Palavra: tipo que representa textos, geralmente referenciado com string;</li>
  <li>NumeroVirgula: tipo que representa numeros decimais, geralmente referenciado com double;</li>
  <li>VerdadeiroFalso: tipo que representa numeros booleanos (verdadeiro ou falso), geralmente referenciado como boolean;</li>
  <li>Potinho: tipo que guarda outros tipos, um vetor, geralmente referenciado como array;</li>  
</ul>


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
<tipo> read variable;

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


### Lição 1 -  Declarar variável
```
numero licao1 = 1;
```

### Lição 2 -  Ler e exibir valores
```
write "Quantas letras tem um alfabeto?";
numero read num1;
write num1;
write "Quantas letras possui a palavra 'KidLang'";
numero read num2;
write num2;
write "Qual a nota que você daria para a KidLang:";
numero read num3;
write num3;
```

### Lição 3 -  Testar as condições
```
numero testavel = 1;
if(testavel = 1){
  write "Kidlang eh 10!!!";
}
else{
  write "Kidlang eh mil milhões";
}
```

### Lição 4 -  Faça tarefas(funções)
```
function somar(num1, num2){
    write num1 + num2;
};

```

### Lição 5 -  Faça repetições com FOR
```
for(numero i; i < 10; numero i = i + 1){
    write i;
};
```


### Lição 6 -  Faça repetições com WHILE
```
while(i < 10){
    write i;
    i = i + 1;
};
```


## E muito mais!!!

##OBS
Nossa proposta inicial era trabalhar com uma linguagem mais moderna e verbosa, com uma sintaxe que fosse de fácil entendimento, alta produtividade e ainda manter-se semanticamente viável, porém tivemos dificuldades durante o projeto e tivemos que adaptar a gramatica inicial para conseguirmos sair do zero
