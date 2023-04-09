package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer003 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite o primeiro número: ");
		int numero1 = input.nextInt();
		
		System.out.print("digite o segundo número: ");
		int numero2 = input.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("a soma é: " + soma);

	}

}
