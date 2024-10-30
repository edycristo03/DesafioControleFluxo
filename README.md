# Contador

Este projeto é uma aplicação Java que realiza uma contagem entre dois números informados pelo usuário. Caso o segundo número seja menor que o primeiro, o programa lança uma exceção personalizada.

## Estrutura do Código

O código possui:

- A classe `Contador`, que contém o método principal (`main`) e o método `contar` responsável pela lógica de contagem.
- Uma classe de exceção personalizada `ParametrosInvalidosException` para tratar o caso onde o segundo número é menor que o primeiro.

## Funcionalidades

- Solicita dois números inteiros ao usuário.
- Realiza uma contagem de `parametroUm` até `parametroDois`.
- Caso `parametroDois` seja menor que `parametroUm`, lança uma exceção com a mensagem: `"O segundo parâmetro deve ser maior que o primeiro."`

## Exemplo de Uso

Ao executar o programa, ele pedirá dois parâmetros:

```shell
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
10
A saida será...
Imprimindo o número 5
Imprimindo o número 6
Imprimindo o número 7
Imprimindo o número 8
Imprimindo o número 9
Imprimindo o número 10

Se o segundo número for menor que o primeiro, o programa exibirá a mensagem de erro da exceção:
Digite o primeiro parâmetro:
10
Digite o segundo parâmetro:
5
O segundo parâmetro deve ser maior que o primeiro.

##Como Executar

   - Certifique-se de ter o Java JDK instalado.

    -Compile o código com o seguinte comando:

    bash

-javac Contador.java


##Tecnologias Utilizadas

    -Java SE (Standard Edition)
