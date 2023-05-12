package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
 * que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
 * */
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 5");
        int numero = leitor.nextInt();

        switch(numero){
            case 1:
                System.out.println("Hum");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Número Inválido");
                break;

        }


    }
}
