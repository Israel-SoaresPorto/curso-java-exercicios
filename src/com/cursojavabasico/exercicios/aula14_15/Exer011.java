package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer011 {
    
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);
        double salario, aumento, percentual, salarioReajustado;
        
        System.out.println("digite o sue salário: ");
        salario = input.nextInt();

        input.close();

        if(salario < 280) {
            percentual = 0.20;
        } else if (salario >= 280 && salario < 700) {
            percentual = 0.15;
        } else if (salario >= 700 && salario < 1500) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }
        
        aumento = salario * percentual;

        salarioReajustado = salario + aumento;

        System.out.printf("salário antigo: R$%.2f%n", salario);
        System.out.println("percentual do aumento: " + percentual * 100 + "%");
        System.out.printf("valor do aumento: R$%.2f%n", aumento);
        System.out.printf("novo salário: R$%.2f%n", salarioReajustado);

    }
}
