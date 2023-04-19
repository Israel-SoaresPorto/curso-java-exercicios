package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer004 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite a nota do 1° bimestre: ");
		float nota1 = input.nextFloat();
		
		System.out.print("digite a nota do 2° bimestre: ");
		float nota2 = input.nextFloat();
		
		System.out.print("digite a nota do 3° bimestre: ");
		float nota3 = input.nextFloat();
		
		System.out.print("digite a nota do 4° bimestre: ");
		float nota4 = input.nextFloat();

		input.close();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("a média do aluno é de: " + media);

	}

}
