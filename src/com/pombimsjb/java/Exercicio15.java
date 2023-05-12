package com.pombimsjb.java;
/**
 * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200
 * @author Giancarlo - pombimsjb
 * */
import java.util.Scanner;
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número para a comparação:");
        int numero = leitor.nextInt();

        if(numero > 100 && numero < 200){
            System.out.println("O número está no intervalo.");
        } else{
            System.out.println("O número não está no intervalo.");
        }

    }

}
