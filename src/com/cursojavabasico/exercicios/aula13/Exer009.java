package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

/**
 * 
 * @author IsraelSoares
 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e 
 * mostre a temperatura em graus Celsius.
 * 
 */

public class Exer009 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite a temperatura em farenheit: ");
		int temperaturaEmFarenheit = input.nextInt();

		input.close();
		
		int temperaturaEmCelsius = 5 * (temperaturaEmFarenheit - 32) / 9;
		
		System.out.printf("temperatura convertida em celsius: %d°C", temperaturaEmCelsius);
		
	}

}
