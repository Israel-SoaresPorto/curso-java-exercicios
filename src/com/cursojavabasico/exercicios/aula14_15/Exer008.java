package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer008 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double produto1, produto2, produto3;

        System.out.println("digite o valor de três produtos");
        System.out.print("valor do primeiro produto: ");
        produto1 = input.nextDouble();
        System.out.print("valor do segundo produto: ");
        produto2 = input.nextDouble();
        System.out.print("valor do terceiro produto: ");
        produto3 = input.nextDouble();

        input.close();

        if(produto1 < produto2 && produto1 < produto3) {
            System.out.println("voçê deve comprar o primeiro produto");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("voçê deve comprar o segundo produto");
        } else {
            System.out.println("voçê deve comprar o terceiro produto");
        }
    }
}
