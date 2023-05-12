package com.pombimsjb.java;
/**
 * Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
 * “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i <= 75; i++) {
            System.out.println("Digite sua idade:");

            int idade = leitor.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }

    }
}
