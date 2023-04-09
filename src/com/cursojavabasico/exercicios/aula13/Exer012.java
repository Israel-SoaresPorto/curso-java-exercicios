package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer012 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite a sua altura: ");
		float altura = input.nextFloat();
		
		double pesoIdeal = 72.7 * altura - 58;
		
		System.out.printf("o seu peso ideal é de: %.2fkg.", pesoIdeal);

	}

}
