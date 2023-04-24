package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer022 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("digite um número: ");
        numero = input.nextInt();

        input.close();

        if(numero % 2 == 0) {
            System.out.println("número é par");
        } else {
            System.out.println("número é impar");
        }

     }
}
