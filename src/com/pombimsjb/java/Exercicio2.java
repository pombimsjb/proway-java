package com.pombimsjb.java;

/**
 * Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
 * dos dois números lidos
 */
public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão \n" +
                "dos dois números lidos");

        float x = 12;
        float y = 10;

        float soma = x + y;
        float subtracao = x - y;
        float multiplicacao = x * y;
        float divisao = x / y;
        System.out.printf("O Resultado da soma é %.2f \n", soma);
        System.out.printf("O Resultado da subtração é %.2f \n", subtracao);
        System.out.printf("O Resultado da multiplicação é %.2f \n", multiplicacao);
        System.out.printf("O Resultado da divisão é %.2f \n", divisao);
    }
}
