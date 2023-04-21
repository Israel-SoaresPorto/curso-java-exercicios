package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer003 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("digite M ou F: ");
        String sexo = input.nextLine();

        input.close();

        switch(sexo) {
            case "M", "m":
                System.out.println("voçê é do sexo masculino.");
                break;
            case "F", "f":
                System.out.println("voçê é do sexo masculino.");
                break;
            default:
                System.out.println("sexo indefinido.");
                break;    
        }
    }
    
}
