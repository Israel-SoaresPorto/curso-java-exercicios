package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer012 {

	public static void main(String[] args) {
		
		double salarioBruto;
		double descontoIR;
		double descontoFGTS;
		double descontoSindicato;
		double descontoTotal;
		double salarioLiquido;
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite o seu salário bruto: ");
		salarioBruto = input.nextDouble();

		input.close();
		
		if(salarioBruto <= 900) {
			descontoIR = 0.0;
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			descontoIR = salarioBruto * 0.05;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			descontoIR = salarioBruto * 0.10;
		} else {
			descontoIR = salarioBruto * 0.20;
		}
		
		descontoFGTS = salarioBruto * 0.11;
		descontoSindicato = salarioBruto * 0.03;
		descontoTotal = descontoIR + descontoSindicato;
		salarioLiquido = salarioBruto - descontoTotal;
		
		System.out.printf("salário bruto: R$%.2f%n", salarioBruto);
		System.out.printf("desconto do Imposto de Renda: R$%.2f%n", descontoIR);
		System.out.printf("desconto do FGTS: R$%.2f%n", descontoFGTS);
		System.out.printf("desconto do Sindicato: R$%.2f%n", descontoSindicato);
		System.out.printf("salário liquido: R$%.2f%n", salarioLiquido);

	}

}
