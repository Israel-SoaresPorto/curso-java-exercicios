
package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer008 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("quantas voçê ganha por horas trabalhadas? ");
		float salarioPorHora = input.nextFloat();
		
		System.out.print("quantas horas voçê trabalha por mês? ");
		int horasTrabalhadasPorMes = input.nextInt();
		
		float salarioMensal = salarioPorHora * horasTrabalhadasPorMes;
		
		System.out.printf("o seu salário é de R$%.2f.", salarioMensal);
		
	}

}
