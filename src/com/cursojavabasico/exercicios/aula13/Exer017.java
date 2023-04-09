package com.cursojavabasico.exercicios.aula13;

import java.util.Scanner;

public class Exer017 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int areaASerPintada;
		int litrosDeTintaNecessarios;
		int latasDeTintaNecessarias;
		double galoesDeTintaNecessarios = 0;
		double preco;

		System.out.print("digite o tamanho da área a ser pintada(em m²): ");
		areaASerPintada = input.nextInt();

		litrosDeTintaNecessarios = areaASerPintada / 6;
		
		if(areaASerPintada % 6 != 0) {
			litrosDeTintaNecessarios++;
		}
		
		System.out.println("escolha uma opção:");
		System.out.println("1 - comprar latas apenas, preço das latas: R$80,00,");
		System.out.println("2 - comprar galões apenas, preço dos galões: R$25,00,");
		System.out.println("3 - comprar latas e galões.");
		int opcao = input.nextInt();
		
		switch (opcao){
		case 1: 
			latasDeTintaNecessarias = litrosDeTintaNecessarios / 18;

			if(litrosDeTintaNecessarios % 18 != 0) {
				latasDeTintaNecessarias++;
			}

			preco = latasDeTintaNecessarias * 80;
			
			System.out.println("quantidades de latas de tinta necessarias: " + latasDeTintaNecessarias);
			System.out.printf("preço a ser pagar: R$%.2f", preco);
			
			break;
		case 2:
			galoesDeTintaNecessarios = Math.ceil(litrosDeTintaNecessarios / 3.6);

			preco = galoesDeTintaNecessarios * 25;
			
			System.out.printf("quantidades de galões de tinta necessarios: %.0f%n", galoesDeTintaNecessarios);
			System.out.printf("preço a ser pagar: R$%.2f", preco);
			
			break;
		default:
			latasDeTintaNecessarias = litrosDeTintaNecessarios / 18;
			
			if(latasDeTintaNecessarias == 0 && litrosDeTintaNecessarios % 18 != 0) {
				latasDeTintaNecessarias++;
				preco = latasDeTintaNecessarias * 80;
			} else { 
				int restante = litrosDeTintaNecessarios % 18;
				
				galoesDeTintaNecessarios = Math.ceil(restante / 3.6);
	
				preco = (latasDeTintaNecessarias * 80) + (galoesDeTintaNecessarios * 25);
			}
			
			System.out.println("quantidades de tinta necessarias: " + latasDeTintaNecessarias);
			System.out.printf("quantidades de galões de tinta necessarios: %.0f%n", galoesDeTintaNecessarios);
			System.out.printf("preço a ser pagar: R$%.2f", preco);
			
			break;
		}

	}

}
