package com.pombimsjb.java;

import java.util.Scanner;

/**
 * Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
 * com os seguintes critérios:
 * a. 50% para aqueles que ganham menos do que três salários mínimos;
 * b. 20% para aqueles que ganham entre três até dez salários mínimos;
 * c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
 * d. 10% para os demais funcionários
 * <p>
 * Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
 * reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
 * vai aumentar sua folha de pagamento
 */
public class Exercicio28 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float folhaPagamento = 0;
        System.out.println("Digite o valor do salário mínimo!");
        float salarioMinimo = leitor.nextFloat();
        float reajusteMenosTresSalarios = 0.50f;
        float reajuste3a10Salarios = 0.20f;
        float reajuste11a20Salarios = 0.15f;
        float reajusteAcima20Salarios = 0.10f;


        for (int i = 0; i <= 584; i++) {
            System.out.println("Sistema de reajuste de salários");
            System.out.println("Informe o nome do funcionário:");
            String nomeFuncionario = leitor.next();
            System.out.println("Digite o salário do funcionário");
            float salarioFuncionaro = leitor.nextFloat();
            //Verificar se valor menor ou igual a 0;
            if (salarioFuncionaro <= 0) {
                System.out.println("Salário incorreto, comece novamente!");
            } else {
                //verificar e calcular reajustes
                if (salarioFuncionaro <= (salarioMinimo * 3)) {

                    float valorReajuste = salarioFuncionaro * reajusteMenosTresSalarios;
                    salarioFuncionaro = salarioFuncionaro + valorReajuste;
                    folhaPagamento = folhaPagamento + salarioFuncionaro;
                    System.out.println("Olá " + nomeFuncionario + " seu salário teve reajuste de R$ " + valorReajuste + " e agora você irá receber R$ " + salarioFuncionaro + " de pagamento.");

                } else if (salarioFuncionaro <= (salarioMinimo * 10)) {

                    float valorReajuste = salarioFuncionaro * reajuste3a10Salarios;
                    salarioFuncionaro = salarioFuncionaro + valorReajuste;
                    folhaPagamento = folhaPagamento + salarioFuncionaro;
                    System.out.println("Olá " + nomeFuncionario + " seu salário teve reajuste de R$ " + valorReajuste + " e agora você irá receber R$ " + salarioFuncionaro + " de pagamento.");

                } else if (salarioFuncionaro <= (salarioMinimo * 20)) {

                    float valorReajuste = salarioFuncionaro * reajuste11a20Salarios;
                    salarioFuncionaro = salarioFuncionaro + valorReajuste;
                    folhaPagamento = folhaPagamento + salarioFuncionaro;
                    System.out.println("Olá " + nomeFuncionario + " seu salário teve reajuste de R$ " + valorReajuste + " e agora você irá receber R$ " + salarioFuncionaro + " de pagamento.");

                } else {

                    float valorReajuste = salarioFuncionaro * reajusteAcima20Salarios;
                    salarioFuncionaro = salarioFuncionaro + valorReajuste;
                    folhaPagamento = folhaPagamento + salarioFuncionaro;
                    System.out.println("Olá " + nomeFuncionario + " seu salário teve reajuste de R$ " + valorReajuste + " e agora você irá receber R$ " + salarioFuncionaro + " de pagamento.");

                }
            }


        }
        System.out.println("A folha de pagamento da empresa ficará em R$ " + folhaPagamento + " após o reajuste dos salários.");
    }
}
