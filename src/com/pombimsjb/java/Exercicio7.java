package com.pombimsjb.java;
/**
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
 * conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em ºC:");
        double temperaturaCelsius = leitor.nextInt();

        double temperaturaFahrenheit = (9*temperaturaCelsius + 160) / 5;
        System.out.println("A temperatura em ºF é de " + temperaturaFahrenheit);

    }
}
