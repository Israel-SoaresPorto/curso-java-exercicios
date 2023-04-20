package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer001 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("digite o segundo número: ");
        numero2 = input.nextInt();

        input.close();

        if(numero1 > numero2) {
            System.out.printf("%d é maior que %d%n", numero1, numero2);
        } else {
            System.out.printf("%d é maior que %d%n", numero2, numero1);
        }

    }

}
