package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
 * menor que 25 ou igual a 40;
 * */
public class Exercicio23 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        char desejaContinuar = 'S';

        while(desejaContinuar=='S'|| desejaContinuar=='s'){
            System.out.println("Digite um número");
            int numero = leitor.nextInt();
            if(numero>80){
                System.out.println("O número é maior que 80!");
            }else if(numero< 25){
                System.out.println("O número é menor que 25!");
            }else if(numero == 40){
                System.out.println("O número é igual a 40");
            }
            System.out.println("Deseja continuar? S- Sim / N- Não");
            desejaContinuar = leitor.next().charAt(0);
        }
        leitor.close();

    }
}
