package com.pombimsjb.java;

/**
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
 * preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário
 * @author Giancarlo - pombimsjb
 * */

import java.util.Scanner;
public class Exercicio11 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do preço de Custo do produto:");
        double precoCusto = leitor.nextDouble();

        System.out.println("Digite o acréscimo a ser feito no preço do produto: (Em porcentagem)");
        double acrescimo = leitor.nextDouble();

        double valorFinal = precoCusto + (precoCusto*(acrescimo / 100));
        System.out.println("O Valor final do produto é de R$: "+valorFinal);

    }

}
