package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer021 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int saque;
        int notasDeCem = 0;
        int notasDeCinquenta = 0;
        int notasDeVinte = 0; 
        int notasDeDez = 0;
        int notasDeCinco = 0;
        int notasDeDois = 0; 
        int notasDeUm = 0;

        System.out.println("digite o valor do saque");
        saque = input.nextInt();

        input.close();

        if(saque >= 10 && saque <= 600) {

            while(saque > 0) {
                    if(saque >= 100) {
                    saque -= 100;
                    notasDeCem++;
                } else if(saque >= 50) {
                    saque -= 50;
                    notasDeCinquenta++;
                } else if(saque >= 20) {
                    saque -= 20;
                    notasDeVinte++;
                } else if(saque >= 10) {
                    saque -= 10;
                    notasDeDez++;
                } else if(saque >= 5) {
                    saque -= 5;
                    notasDeCinco++;
                } else if(saque >= 2) {
                    saque -= 2;
                    notasDeDois++;
                } else {
                    saque -= 1;
                    notasDeUm++;
                }
            }

            System.out.println("serão fornecidas: ");
            System.out.println(notasDeCem + " notas de cem");
            System.out.println(notasDeCinquenta + " notas de cinquenta");
            System.out.println(notasDeVinte + " notas de vinte");
            System.out.println(notasDeDez + " notas de dez");
            System.out.println(notasDeCinco + " notas de cinco");
            System.out.println(notasDeDois + " notas de dois");
            System.out.println(notasDeUm + " notas de um");

        } else {
            System.out.println("valor de saque indisponivel.");
        }

    }
}
