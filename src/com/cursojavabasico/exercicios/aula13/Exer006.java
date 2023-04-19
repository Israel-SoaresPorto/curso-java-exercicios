package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer006 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite o raio do círculo(em cm): ");
		double raioDoCirculo = input.nextDouble();
		
		double areaDoCirculo = Math.PI * Math.pow(raioDoCirculo, 2);

		input.close();
		
		//mostra o resultado do calculo e converte para metros(divide a area por 100)
		System.out.printf("a área do círculo é de: %.2fm", areaDoCirculo / 100);

	}

}
