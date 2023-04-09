package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer010 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite a temperatura em celsius: ");
		int temperaturaEmCelsius = input.nextInt();
		
		double temperaturaEmFarenheit = 1.8 * temperaturaEmCelsius + 32;
		
		System.out.printf("temperatura convertida em farenheit: %.0f°F", temperaturaEmFarenheit);

	}

}
