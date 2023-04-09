package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer007 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite o valor do lado do quadrado(em cm): ");
		double ladoDoQuadrado = input.nextDouble();
		
		double areaDoQuadrado = Math.pow(ladoDoQuadrado, 2);
		
		System.out.printf("área do quadrado: %.2fm²", (areaDoQuadrado / 100) * 2);
		
	}
}
