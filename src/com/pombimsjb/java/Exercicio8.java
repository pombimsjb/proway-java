package com.pombimsjb.java;
/**
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
 * dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
 * disponíveis com ousuário;
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em Dólares");
        double valorEmDolares = leitor.nextDouble();
        System.out.println("Digite a cotação do Dólar");
        double cotacaoDolar = leitor.nextDouble();

        double valorReais = cotacaoDolar*valorEmDolares;

        System.out.printf("O valor em Reais é de R$ %.2f",valorReais);
    }
}
