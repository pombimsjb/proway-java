package com.pombimsjb.java;
/**
 *  Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 *  @author Giancarlo - pombimsjb
 * */

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        if(numero > 10){
            System.out.println("Seu número é maior do que 10");
        }

        leitor.close();
    }
}
