package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer013 {
 
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        int diaDaSemana;

        System.out.print("digite o valor do dia da semana: ");
        diaDaSemana = input.nextInt();

        input.close();

        switch(diaDaSemana) {
            case 1:
                System.out.println("hoje é domingo");
                break;
            case 2:
                System.out.println("hoje é segunda");
                break;
            case 3:
                System.out.println("hoje é terça");
                break;
            case 4:
                System.out.println("hoje é quarta");
                break;
            case 5:
                System.out.println("hoje é quinta");
                break;
            case 6:
                System.out.println("hoje é sexta");
                break;
            case 7:
                System.out.println("hoje é sabado");
                break;
            default:
                System.out.println("valor invalido");
                break;                        
        }
    }
}
