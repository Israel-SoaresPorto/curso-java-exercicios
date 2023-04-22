package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer009 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, numero3, maior, menor, meio;

        System.out.println("digite três números: ");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();

        input.close();

        if(numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        if(numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }

        if(numero1 < maior && numero1 > menor) {
            meio = numero1;
        } else if (numero2 < maior && numero2 > menor) {
            meio = numero2;
        } else {
            meio = numero3;
        }

        System.out.printf("%d %d %d%n", menor, meio, maior);

    }
}
