package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer023 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double numero;
        double numeroArrendondado;

        System.out.print("digite um número: ");
        numero = input.nextDouble();

        input.close();

        numeroArrendondado = Math.floor(numero);

        if (numero == numeroArrendondado) {
            System.out.println("número é inteiro.");
        } else {
            System.out.println("número é decimal.");
        }

     }
}
