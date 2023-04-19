package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer013 {

	public static void main(String[] args) {
		
		double pesoIdeal = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite a sua altura: ");
		float altura = input.nextFloat();
		
		System.out.print("seu sexo: m - masculino, f - feminino: ");
		String sexo =  input.next();

		input.close();
		
		switch (sexo) {
			case "f":
				pesoIdeal = 72.7 * altura - 58;
				break;
			case "m":
				pesoIdeal = 62.1 * altura - 44.7;
				break;
			default:
				break;
		}
		
		System.out.printf("O seu peso ideal é de: %.2fkg.%n", pesoIdeal);
		
		System.out.print("digite o seu peso atual: ");
		double pesoAtual = input.nextDouble();
		
		if(pesoAtual > pesoIdeal) {
			System.out.println("voçê está acima do peso ideal.");
		} else if (pesoAtual == pesoIdeal) {
			System.out.println("voçê está dentro do peso ideal.");
		} else {
			System.out.println("voçê está abaixo do peso ideal.");
		}
		
	}

}
