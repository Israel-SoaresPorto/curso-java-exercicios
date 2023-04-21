package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer004 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String letra;

        System.out.print("digite uma letra do alfabeto: ");
        letra = input.nextLine();

        input.close();

        switch(letra) {
            case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                System.out.println("é uma vogal.");
                break;
            default:
                System.out.println("é uma consoante ou outro caractere.");
                break;
        }
    }
}
