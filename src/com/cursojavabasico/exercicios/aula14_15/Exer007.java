package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer007 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("digite três números: ");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();

        input.close();

        if(numero1 > numero2 && numero1 > numero3) {
            System.out.println("maior número: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("maior número: " + numero2);
        } else {
            System.out.println("maior número: " + numero3);
        }

        if(numero1 < numero2 && numero1 < numero3) {
            System.out.println("menor número: " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("menor número: " + numero2);
        } else {
            System.out.println("menor número: " + numero3);
        }
    }
}
