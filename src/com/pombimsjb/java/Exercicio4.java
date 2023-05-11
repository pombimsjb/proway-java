package com.pombimsjb.java;
/**
 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
 * por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
 * efetuadas, informar o seu nome, o salário fixo e salário no final do mês
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = leitor.next();
        double salarioFixo = leitor.nextDouble();
        double totalVendasEmDinheiro = leitor.nextDouble();
        double comissao = 0.15;

        double salarioFinal = salarioFixo + (totalVendasEmDinheiro * comissao);
        System.out.printf("O salário fixo do vendedor %s é de %.2f e o seu salário final é de R$ %.2f", nome, salarioFixo, salarioFinal);

    }
}
