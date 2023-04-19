package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer014 {

	public static void main(String[] args) {
		
		double peso;
		double excesso = 0;
		double multa = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite o kg de peixes que pescou: ");
		peso = input.nextDouble();

		input.close();
		
		if(peso > 50) {
			System.out.println("voçê execedeu o peso limite.");
			excesso = peso - 50;
			multa = excesso * 4;
		}
		
		System.out.printf("excesso de kg de peixes: %.2f%n", excesso);
		System.out.printf("valor da multa á pagar: %.2f%n", multa);

	}

}
