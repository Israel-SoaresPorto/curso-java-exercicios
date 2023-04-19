package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer015 {

	public static void main(String[] args) {
		
		double salarioBruto;
		double descontoIR;
		double descontoINSS;
		double descontoSindicato;
		double descontoTotal;
		double salarioLiquido;
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite o seu salário bruto: ");
		salarioBruto = input.nextDouble();

		input.close();
		
		descontoIR = salarioBruto * 0.11;
		descontoINSS = salarioBruto * 0.08;
		descontoSindicato = salarioBruto * 0.05;
		descontoTotal = descontoINSS + descontoIR + descontoSindicato;
		salarioLiquido = salarioBruto - descontoTotal;
		
		System.out.printf("desconto do Imposto de Renda: R$%.2f%n", descontoIR);
		System.out.printf("desconto do INSS: R$%.2f%n", descontoINSS);
		System.out.printf("desconto do Sindicato: R$%.2f%n", descontoSindicato);
		System.out.printf("salário liquido: R$%.2f%n", salarioLiquido);

	}

}
