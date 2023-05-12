package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
 * resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
 * impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
 */

public class Exercicio31 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int numeroA = leitor.nextInt();
        System.out.println("Digite o valor de B");
        int numeroB = leitor.nextInt();
        System.out.println("Digite o operador a ser utilizado:");
        char operador = leitor.next().charAt(0);

        switch (operador) {
            case '+': {
                System.out.println("O Resultado da soma é: " + (numeroA + numeroB));
            }
            case '-': {
                System.out.println("O resultado da subtração é: " + (numeroA - numeroB));
            }
            case '*': {
                System.out.println("O resultado da multiplicação é: " + (numeroA * numeroB));
            }
            case '/': {
                if (numeroB > 0) {
                    System.out.println("O Resultado da divisão é: " + (numeroA / numeroB) +" restando "+ (numeroA % numeroB));
                } else {
                    System.out.println("Operador inválido");
                }
            }
        }


    }
}
