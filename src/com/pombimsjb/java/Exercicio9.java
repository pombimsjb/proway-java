package com.pombimsjb.java;
/**
 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
 * mês.Considere fixo o juro da poupança em 0,07% a. m;
 *
 */
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor depositado");
        double valorDepositado = leitor.nextDouble();

        double valorComRendimento =valorDepositado+ (valorDepositado * 0.07);

        System.out.println("Considerando o juro da poupança de 0,07% o valor depositado após 1 mês será de: "+valorComRendimento);

    }
}
