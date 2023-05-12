package com.pombimsjb.java;
/**
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
 * mulher. No final informe total de homens e de mulheres
 */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        char sexo;

        for (int i = 0; i <= 5; i++) {
            nome = leitor.next();
            sexo = leitor.next().charAt(0);
            if (sexo != 'M' && sexo != 'm' && sexo != 'H' && sexo != 'h') {
                System.out.println("Caractere errado");
                i--;
            } else if (sexo == 'M' || sexo == 'm') {
                System.out.println("A " + nome + " é uma mulher.");
            } else if (sexo == 'H' || sexo == 'h') {
                System.out.println("O " + nome + " é um homem.");
            }
        }
    }
}
