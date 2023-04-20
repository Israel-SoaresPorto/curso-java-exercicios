package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer002 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero1;

        System.out.print("digite um número: ");
        numero1 = input.nextInt();

        input.close();

        if(numero1 > 0) {
            System.out.println("número é positivo");
        } else {
            System.out.println("número é negativo");
        }

     }
}
