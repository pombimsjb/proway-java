package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
 * ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de pessoas:");
        int numeroPessoas = leitor.nextInt();
        int totalHomens = 0;
        int totalMulheres = 0;
        int totalHomensAptos = 0;

        while (numeroPessoas > 0) {
            System.out.println("Digite o nome: ");
            String nome = leitor.next();

            System.out.println("Digite o sexo: (M - Masculino / F - Feminino)");
            char sexo = leitor.next().charAt(0);

            System.out.println("Digite a idade");
            int idade = leitor.nextInt();

            System.out.println("Qual o estado de saúde? B - Boa / R - Ruim");
            char saude = leitor.next().charAt(0);

           if (sexo == 'm' || sexo == 'M') {
                    totalHomens++;
                    if ((saude == 'B' || saude == 'b') && idade >= 18) {
                        totalHomensAptos++;
                    }
                } else if (sexo == 'f' || sexo == 'F') {
                    totalMulheres++;
                }
            numeroPessoas--;
        }
        System.out.println("Número de Mulheres: " + totalMulheres);
        System.out.println("Número de Homens: " + totalHomens);
        System.out.println("Número de Homens Aptos " + totalHomensAptos);
    }

}
