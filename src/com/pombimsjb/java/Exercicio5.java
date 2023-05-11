package com.pombimsjb.java;
/**
 * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
 * No finalinformar o nome do aluno e a sua média (aritmética)
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = leitor.next();
        int nota1 = leitor.nextInt();
        int nota2 = leitor.nextInt();
        int nota3 = leitor.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("O aluno "+nome+" obteve a média final de "+media);
    }

}
