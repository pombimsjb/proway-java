package com.pombimsjb.java;
/**
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
 * dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
 * do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
 * 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
 * mesmo;
 * @author Giancarlo - pombimsjb
 *
 * */
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o preço de custo de fábrica do veículo:");
        double custoFabrica = leitor.nextDouble();

        double precoFabricaComImposto = custoFabrica +(custoFabrica * 0.45);
        double precoFinalDistribuidor = precoFabricaComImposto + (precoFabricaComImposto * 0.28);

        System.out.printf("O valo final do veículo no distribuidor será de R$ %.2f",precoFinalDistribuidor);


        leitor.close();

    }
}
