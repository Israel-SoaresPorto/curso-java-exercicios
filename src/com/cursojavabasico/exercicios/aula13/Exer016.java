package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer016 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int areaASerPintada;
		int litrosDeTintaNecessarios;
		int latasDeTintaNecessarias;
		double preco;

		System.out.print("digite o tamanho da área a ser pintada(em m²): ");
		areaASerPintada = input.nextInt();

		litrosDeTintaNecessarios = areaASerPintada / 3;

		if(areaASerPintada % 6 != 0) {
			litrosDeTintaNecessarios++;
		}

		latasDeTintaNecessarias = litrosDeTintaNecessarios / 18;

		if(litrosDeTintaNecessarios % 18 != 0) {
			latasDeTintaNecessarias++;
		}

		preco = latasDeTintaNecessarias * 80;

		System.out.println("quantidades de tinta Necessarias: " + latasDeTintaNecessarias);
		System.out.printf("preço a ser pagar: R$%.2f", preco);

	}

}
