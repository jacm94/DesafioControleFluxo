# Desafio Controle de Fluxo

Este projeto em Java tem como objetivo praticar os conceitos de controle de fluxo. O sistema recebe dois parâmetros inteiros via terminal, determina a quantidade de interações entre eles e imprime mensagens no console.

## Funcionalidades

- Recebe dois números inteiros como parâmetros via terminal.
- Realiza um loop `for` imprimindo mensagens conforme o intervalo entre os números.
- Lança a exceção customizada `ParametrosInvalidosException` se o primeiro número for maior que o segundo.

## Exemplo

Entrada:  

Número 1: 12  
Número 2: 30


Saída:

Imprimindo o número 1

Imprimindo o número 2  
...  
...  
...  
Imprimindo o número 18

## Estrutura do Projeto

- `Contador.java`: classe principal com a lógica de contagem.
- `ParametrosInvalidosException.java`: exceção customizada para validação de parâmetros.
