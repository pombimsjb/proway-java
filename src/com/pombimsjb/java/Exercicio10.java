package com.pombimsjb.java;

/**
 * A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
 * algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 * @author Giancarlo - pombimsjb
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Valor do Produto:");

        double valorProduto = leitor.nextDouble();
        double valorParcela = valorProduto / 5;


        for (int parcela = 1; parcela <= 5; parcela++){
            System.out.println("O valor da parcela " + parcela + " é de R$ " + valorParcela);
        }
    }
}
