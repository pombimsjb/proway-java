package com.pombimsjb.java;
/**
 * Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
 * (inclusive);
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contadorInclusive = 0;

        for (int i = 0; i <= 80; i++) {
            System.out.println("Informe um número");
            int numero = leitor.nextInt();

            if (numero >= 10) {
                if (numero <= 150){
                    contadorInclusive++;
                }
            }
        }
        System.out.println("Foram digitados "+contadorInclusive+" números no intervalo entre 10 e 150.");


        leitor.close();
    }
}
