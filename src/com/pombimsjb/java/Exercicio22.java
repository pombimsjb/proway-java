package com.pombimsjb.java;
/**
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
 * se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
 * de venda de cada produto, amédia de preço de custo e do preço de venda; *
 */

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double totalCusto = 0;
        double totalVenda = 0;

        for (int i = 0; i < 40; i++) {
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = leitor.next();
            System.out.println("Digite o preço de custo: ");
            double precoCusto = leitor.nextDouble();
            System.out.println("Digite o preço de venda: ");
            double precoVenda = leitor.nextDouble();

            double diferenca = precoVenda - precoCusto;

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (diferenca == 0) {
                System.out.printf("Preço de Custo: %.2f\n", precoCusto);
                System.out.printf("Preço de Venda: %.2f\n", precoVenda);
                System.out.printf("Houve empate no produto: %s", nomeProduto);
                System.out.printf("Preço total de venda é: %.2f\n", totalVenda);
                System.out.printf("Preço total de custo é: %.2f\n", totalCusto);
            } else {
                if (diferenca > 0) {
                    System.out.printf("Preço de Custo: %.2f\n", precoCusto);
                    System.out.printf("Preço de Venda: %.2f\n", precoVenda);
                    System.out.printf("Houve Lucro de R$ %.2f no produto %s\n", diferenca, nomeProduto);
                    System.out.printf("Preço total de venda é: %.2f\n", totalVenda);
                    System.out.printf("Preço total de custo é: %.2f\n", totalCusto);
                } else {
                    System.out.printf("Preço de Custo: %.2f\nS", precoCusto);
                    System.out.printf("Preço de Venda: %.2f\n", precoVenda);
                    System.out.printf("Houve prejuízo de R$ %.2f no produto %s\n", diferenca, nomeProduto);
                    System.out.printf("Preço total de venda é: %.2f\n", totalVenda);
                    System.out.printf("Preço total de custo é: %.2f\n", totalCusto);
                }
            }

        }
        double mediaPrecoCusto = totalCusto / 40;
        double mediaPrecoVenda = totalVenda / 40;
        System.out.printf("Média do preço de custo é: R$ %.2f", mediaPrecoCusto);
        System.out.printf("Média do preço de venda é: R$ %.2f", mediaPrecoVenda);


    }

}
