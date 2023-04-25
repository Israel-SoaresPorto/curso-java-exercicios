package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer027 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int quantidadeDeMacas, quantidadeDeMorangos, quantidadeTotal;
        double precoDaMaca, precoDoMorango;
        double totalMaca, totalMorango;
        double desconto = 0, precoTotal, precoFinal;

        System.out.print("kg de maçãs a ser comprada: ");
        quantidadeDeMacas = input.nextInt();

        System.out.print("kg de morangos a ser comprada: ");
        quantidadeDeMorangos = input.nextInt();

        input.close();

        if(quantidadeDeMacas > 5) {
            precoDaMaca = 1.50;
        } else {
            precoDaMaca = 1.80;
        }

        if(quantidadeDeMorangos > 5) {
            precoDoMorango = 2.20;
        } else {
            precoDoMorango = 2.50;
        }

        quantidadeTotal = quantidadeDeMacas + quantidadeDeMorangos;
        totalMaca = precoDaMaca * quantidadeDeMacas;
        totalMorango = precoDoMorango * quantidadeDeMorangos;
        precoTotal = totalMaca + totalMorango;

        if(precoTotal > 25 || quantidadeTotal > 8) {
            desconto = precoTotal * 0.10;
            precoFinal = precoTotal - desconto;
        } else {
            precoFinal = precoTotal;
        }

        System.out.printf("preço da maçã: R$%.2f %n", precoDaMaca);
        System.out.printf("preço do morango: R$%.2f %n", precoDoMorango);
        System.out.printf("preço total de maçã: R$%.2f %n", totalMaca);
        System.out.printf("preço total de morango: R$%.2f %n", totalMorango);
        System.out.printf("desconto: R$%.2f %n", desconto);
        System.out.printf("preço final: R$%.2f %n", precoFinal);
        
    }
}
