package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */


public class Exercicio30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ordenação de valores");
        System.out.println("Digite o primeiro valor");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        int numero2 = leitor.nextInt();
        System.out.println("Digite o terceiro valor");
        int numero3 = leitor.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {

            System.out.println("Os números são iguais!");

        } else {
            if (numero1 < numero2) {
                if (numero2 < numero3) {

                    System.out.println("A ordem crescente é: " + numero1 + " " + numero2 + " " + numero3);

                 } else if (numero1 < numero3) {
                    System.out.println("A ordem crescente é: " + numero1 + " " + numero3 + " " + numero2);
                } else {
                    System.out.println("A ordem crescente é: " + numero3 + " " + numero1 + " " + numero2);
                }
            } else if (numero2 < numero3) {
                if (numero1 < numero3) {
                    System.out.println("A ordem crescente é: " + numero2 + " " + numero1 + " " + numero3);
                } else {
                    System.out.println("A ordem crescente é: " + numero2 + " " + numero3 + " " + numero1);
                }
            } else {
                System.out.println("A ordem crescente é: " + numero3 + " " + numero2 + " " + numero1);
            }


        }


    }
}
