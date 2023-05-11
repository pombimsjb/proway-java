package com.pombimsjb.java;

/**
 * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
 * total percorrida pelo automóvel e o total de combustível gasto;
 */
public class Exercicio3 {
    public static void main(String[] args) {
        double distanciaPercorrida = 847.2;
        double gastoCombustivel = 77.5;

        double consumoMedio = distanciaPercorrida / gastoCombustivel;

        System.out.printf("No trajeto de %.2f km o veículo gastou %.2f litros, tendo um consumo médio de %.2f litros por km.",distanciaPercorrida,gastoCombustivel,consumoMedio);



    }
}
