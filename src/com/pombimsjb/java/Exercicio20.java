package com.pombimsjb.java;
/**
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
 * um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
 * desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
 * sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
 * Informar total de carros com ano até 2000 e total geral;
 */

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float descontoCarroMais2000 = 0.07f;
        float descontoCarroMenos2000 = 0.12f;
        char executar = 'S';
        int totalCarrosCompradosAte2000 = 0;
        int totalCarrosComprados = 0;
        float valorVeiculoComDesconto = 0f;

        while (executar == 's' || executar == 'S') {
            System.out.println("Digite o ano do veículo: ");
            int anoVeiculo = leitor.nextInt();
            System.out.println("Digite o valor do veículo: ");
            float valorInicialVeiculo = leitor.nextFloat();

            if (anoVeiculo <= 2000) {
                //Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros
                float valorDesconto = valorInicialVeiculo * descontoCarroMenos2000;
                valorVeiculoComDesconto = valorInicialVeiculo - valorDesconto;
                totalCarrosCompradosAte2000++;
                totalCarrosComprados++;
                System.out.println("Você comprou economizou R$ " + valorDesconto + " e vai pagar R$ " + valorVeiculoComDesconto + " pelo seu veículo");

            } else {
                float valorDesconto = valorInicialVeiculo * descontoCarroMais2000;
                valorVeiculoComDesconto = valorInicialVeiculo - valorDesconto;
                totalCarrosComprados++;
                System.out.println("Você comprou economizou R$ " + valorDesconto + " e vai pagar R$ " + valorVeiculoComDesconto + " pelo seu veículo");
            }


            System.out.println("Deseja continuar? (S - Sim / N = Não)");
            executar = leitor.next().charAt(0);
        }

        System.out.println("Você comprou " + totalCarrosCompradosAte2000 + " até o ano 2000 de um total de " + totalCarrosComprados + " carros.");


    }


}
