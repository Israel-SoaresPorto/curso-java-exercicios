package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer016 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, b, c, delta;
        double primeiraRaiz, segundaRaiz;

        System.out.println("digite os valores da equação de segundo grau");
        System.out.print("a: ");
        a = input.nextInt();

        if(a > 0) {
            System.out.print("b: ");
            b = input.nextInt();
            System.out.print("c: ");
            c = input.nextInt();

            delta = (a * a) - 4 * a * c;

            if(delta > 0) {
                System.out.println("há duas soluções para a equação");

                primeiraRaiz = (-b + Math.sqrt(delta)) / (2 * a);
                segundaRaiz = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("resultado da primeira solução: %.0f%n", primeiraRaiz);
                System.out.printf("resultado da segunda solução: %.0f%n", segundaRaiz);
            } else if (delta == 0) {
                System.out.println("há somente uma solução para a equação");

                primeiraRaiz = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.printf("resultado da equação: %.0f%n", primeiraRaiz);
            } else {
                System.out.println("não há solução para a equação.");
            }
        } else {
            System.out.println("esta equação não é de segundo grau.");
        }

        input.close();
    }
}
