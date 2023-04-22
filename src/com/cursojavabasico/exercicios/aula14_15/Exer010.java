package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer010 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String turno;

        System.out.println("qual é o turno que voçê estuda?");
        System.out.println("digite M para matutino, V para vespertino e N para noturno");
        turno = input.nextLine();

        input.close();

        switch(turno) {
            case "M", "m":
                System.out.println("Bom dia.");
                break;
            case "V", "v":
                System.out.println("Boa tarde.");
                break;
            case "N", "n":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("comando invalido."); 
                break;           
        }

    }
}
