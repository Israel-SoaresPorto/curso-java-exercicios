package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer005 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite um valor em metros: ");
		double metros = input.nextDouble();

		input.close();
		
		double centimetros = metros * 100;
		
		System.out.printf("a medida em centimetros é de: %.2fcm", centimetros);
		
	}

}
