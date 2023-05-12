package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
 * luz segue a tabela abaixo:
 * Tipo de Cliente Valor do KW/h
 * a. (Residência) 0,60;
 * b. (Comércio) 0,48;
 * c. (Indústria) 1,29
 */
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Selecione o tipo de local:");
        System.out.println("1- Residência");
        System.out.println("2- Comércio");
        System.out.println("3- Indústria");
        System.out.println("4- Sair");
        int selecao = leitor.nextInt();

        switch (selecao) {
            case 1: {
                System.out.println("Insira a quantidade gasta em Kw/h");
                int consumo = leitor.nextInt();
                float valorPagar = consumo * 0.60f;
                System.out.println("O valor a ser pago pelo consumidor é de R$ "+valorPagar);
                break;
            }
            case 2: {
                System.out.println("Insira a quantidade gasta em Kw/h");
                int consumo = leitor.nextInt();
                float valorPagar = consumo * 0.48f;
                System.out.println("O valor a ser pago pelo consumidor é de R$ "+valorPagar);
                break;
            }
            case 3: {
                System.out.println("Insira a quantidade gasta em Kw/h");
                int consumo = leitor.nextInt();
                float valorPagar = consumo * 1.29f;
                System.out.println("O valor a ser pago pelo consumidor é de R$ "+valorPagar);
                break;
            }
            default:
                break;
        }

    }
}
