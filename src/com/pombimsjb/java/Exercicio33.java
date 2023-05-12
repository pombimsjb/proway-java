package com.pombimsjb.java;

import java.util.Scanner;

/**
 * A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
 * calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
 * a. Professor Nível 1 R$12,00 por hora/aula;
 * b. Professor Nível 2 R$17,00 por hora/aula;
 * c. Professor Nível 3 R$25,00 por hora/aula.
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas:");
        int horasAula = leitor.nextInt();
        System.out.println("Digite o nível do professor:");
        int nivel = leitor.nextInt();

        switch (nivel) {
            case 1: {
                int totalSalario = horasAula * 12;
                System.out.println("O professor irá receber R$ " + totalSalario + " por " + horasAula + " horas trabalhadas.");
                break;
            }
            case 2: {
                int totalSalario = horasAula * 17;
                System.out.println("O professor irá receber R$ " + totalSalario + " por " + horasAula + " horas trabalhadas.");
                break;
            }
            case 3: {
                int totalSalario = horasAula * 25;
                System.out.println("O professor irá receber R$ " + totalSalario + " por " + horasAula + " horas trabalhadas.");
                break;
            }
            default:
                break;
        }


    }

}
