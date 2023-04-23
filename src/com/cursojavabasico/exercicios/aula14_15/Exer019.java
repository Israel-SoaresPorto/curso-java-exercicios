package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer019 {
    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        int numero;
        int centena;
        int dezena;
        int unidade;
        String C = "centena";
        String D = "dezena"; 
        String U = "unidade";

        System.out.print("digite um número menor que 1000: ");
        numero = input.nextInt();

        input.close();

        if(numero < 1000) {

            centena = numero / 100;
            numero = numero % 100;
            dezena = numero / 10;
            unidade = numero % 10;
                
            if(dezena > 1) {
                D = "dezenas";
            }
            
            if (centena > 1) {
                C = "centenas";
            }

            if(unidade > 1) {
                U = "unidades";
            }

            if(centena > 0 && dezena == 0 && unidade == 0) {
                System.out.printf("%d %s %n", centena, C);
            } else if (centena > 0 && dezena > 0 && unidade == 0) {
                System.out.printf("%d %s e %d %s %n", centena, C, dezena, D);
            } else if (centena > 0 && dezena == 0 && numero > 0){
                System.out.printf("%d %s e %d %s %n", centena, C, unidade, U);
            } else if(centena == 0 && dezena > 0 && unidade > 0) {
                System.out.printf("%d %s e %d %s %n", dezena, D, unidade, U);
            } else if(centena == 0 && dezena > 0 & unidade == 0) {
                System.out.printf("%d %s %n", dezena, D);
            } else if(centena == 0 && dezena == 0 && unidade >0) {
                System.out.printf("%d %s %n", unidade, U);
            } else {
                System.out.printf("%d %s, %d %s e %d %s %n", centena, C, dezena, D, unidade, U);
            }
            
        } else {
            System.out.println("número invalido.");
        }

    }
}
