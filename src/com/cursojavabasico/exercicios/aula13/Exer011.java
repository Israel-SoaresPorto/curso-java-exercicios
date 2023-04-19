package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer011 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite o primeiro número (inteiro): ");
		int numero1 = input.nextInt();
		
		System.out.print("digite o segundo número (inteiro): ");
		int numero2 = input.nextInt();
		
		System.out.print("digite o terceiro número (real): ");
		double numero3 = input.nextDouble();

		input.close();
		
		int calculo1 = (numero1 * 2) * (numero2 / 2);
		double calculo2 = (numero1 * 3) + numero3;
		double calculo3 = Math.pow(numero3, 3);
		
		System.out.println("o produto do dobro do primeiro com metade do segundo: " + calculo1);
		System.out.printf("a soma do triplo do primeiro com o terceiro: %.2f%n", calculo2);
		System.out.printf("o terceiro elevado ao cubo: %.2f%n", calculo3);
		
	}

}
