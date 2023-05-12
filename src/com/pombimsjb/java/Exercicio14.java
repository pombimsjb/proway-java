package com.pombimsjb.java;
/**
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 * @author Giancarlo - pombimsjb
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o primeiro número: ");
        int numero2 = leitor.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro Número " + numero1 + " é maior que o segundo número " + numero2);

        } else if (numero2 > numero1) {
            System.out.println("O segundo número " + numero2 + " é maior que o primeiro número " + numero1);
        } else {
            System.out.println("Números são iguais!");
        }


        leitor.close();

    }
}
