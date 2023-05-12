package com.pombimsjb.java;

/**
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
 * sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
 * Recuperação (media entre 5.1 a 6.9)
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota da segunda prova");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a nota da terceira prova");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado com média "+media);
        } else if (media <= 5) {
            System.out.println("Reprovado com média "+media);
        } else {
            System.out.println("Recuperação com média "+media);
        }

        leitor.close();
    }
}
