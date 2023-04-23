package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer018 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;

        System.out.print("dia: ");
        dia = input.nextInt();

        System.out.print("mês: ");
        mes = input.nextInt();

        System.out.print("ano: ");
        ano = input.nextInt();

        input.close();

        if((dia <= 31 && dia > 0) && (mes < 12 && mes > 0) && ano > 0) {
            if((dia <= 29 && mes == 2) && ((ano % 400 == 0) || (ano % 100 != 0 && ano % 4 == 0))) {
                System.out.println("data válida.");
            } else if (dia <= 28 && mes == 2) {
                System.out.println("data válida.");
            } else if (dia <= 31 && mes % 2 == 1 ) {
                System.out.println("data válida.");
            } else if (dia <= 30 && (mes % 2 == 0 && mes != 2))  {
                System.out.println("data válida.");
            } else {
                System.out.println("data inválida.");
            }
        } else {
            System.out.println("data inválida.");
        }

    }
}