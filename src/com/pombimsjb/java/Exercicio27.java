package com.pombimsjb.java;

import java.util.Scanner;

/**
 * A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
 * algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
 * calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
 * –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
 * clientes;
 */
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá seja bem vindo a concessionária CARANGO");
        System.out.println("Aqui você vai encontrar o seu veículo e sair andando pagando barato!");
        System.out.println("");
        System.out.println("");
        System.out.println("Selecione o tipo de combustível do veículo que procura:");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("0 - Sair");

        float descontoAlcool = 0.25f;
        float descontoGasolina = 0.21f;
        float descontoDiesel = 0.14f;
        int modelo = leitor.nextInt();
        switch (modelo) {
            case 1: {
                System.out.println("Você selecionou um modelo à Álcool que está com 25% de desconto.");
                System.out.println("Digite o valor do veículo:");
                float valorVeiculo = leitor.nextFloat();
                float valorDesconto = valorVeiculo * descontoAlcool;
                float valorFinalVeiculo = valorVeiculo - valorDesconto;
                System.out.println("Você comprou o veículo de R$ " + valorVeiculo + " por R$ " + valorFinalVeiculo + " economizando um total de R$ " + valorDesconto);
                break;
            }
            case 2: {
                System.out.println("Você selecionou um modelo à Gasolina que está com 21% de desconto.");
                System.out.println("Digite o valor do veículo:");
                float valorVeiculo = leitor.nextFloat();
                float valorDesconto = valorVeiculo * descontoGasolina;
                float valorFinalVeiculo = valorVeiculo - valorDesconto;
                System.out.println("Você comprou o veículo de R$ " + valorVeiculo + " por R$ " + valorFinalVeiculo + " economizando um total de R$ " + valorDesconto);
                break;
            }
            case 3: {
                System.out.println("Você selecionou um modelo à Gasolina que está com 21% de desconto.");
                System.out.println("Digite o valor do veículo:");
                float valorVeiculo = leitor.nextFloat();
                float valorDesconto = valorVeiculo * descontoDiesel;
                float valorFinalVeiculo = valorVeiculo - valorDesconto;
                System.out.println("Você comprou o veículo de R$ " + valorVeiculo + " por R$ " + valorFinalVeiculo + " economizando um total de R$ " + valorDesconto);
                break;
            }
            default:
                break;
        }


    }
}
