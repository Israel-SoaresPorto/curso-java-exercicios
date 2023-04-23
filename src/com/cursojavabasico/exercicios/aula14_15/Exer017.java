package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer017 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int ano;

        System.out.print("digite um ano qualquer: ");
        ano = input.nextInt();

        input.close();

        if((ano % 400 == 0) || (ano % 100 != 0 && ano % 4 == 0)) {
            System.out.println("o ano é bissexto.");
        } else {
            System.out.println("o ano não é bissexto.");
        }
        
    }
}