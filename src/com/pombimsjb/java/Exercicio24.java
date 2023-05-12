package com.pombimsjb.java;
/**
 * Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 *
 * */

import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de número que quer testar.");
        int numero = leitor.nextInt();


        while(numero>0){
            System.out.println("Digite o número:");
            int numeroComparacao = leitor.nextInt();
            if(numeroComparacao > 0){
                System.out.println("Número positivo");
            }else if(numeroComparacao<0){
                System.out.println("Número negativo");
            }else{
                System.out.println("É zero");
            }
            numero--;
        }






    }

}
