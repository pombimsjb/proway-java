package com.pombimsjb.java;
/**
 * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
 * possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
 * trocados;
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        int aTroca = A;
        A = B;
        B = aTroca;

        System.out.println("Os Valores ficaram: Primeiro Número = " + A + " e Segundo Número = " + B);


    }

}
