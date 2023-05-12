package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
 * imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
 * maior, e uma mensagem que são diferentes
 * */
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = leitor.nextInt();

        if(numero1 == numero2){
            System.out.println("Os números são iguais");
        }else if (numero1 != numero2){
            if(numero1 > numero2){
                System.out.println("Os números são diferentes e o número 1 é maior que o número 2.");
            }else{
                System.out.println("Os números são diferentes e o número 2 é maior que o número 1.");
            }
        }

    }
}
