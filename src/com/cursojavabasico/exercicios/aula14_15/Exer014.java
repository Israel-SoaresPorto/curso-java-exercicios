package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer014 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        char notaConceito;

        System.out.println("digite a primeira nota");
        nota1 =input.nextDouble();

        System.out.println("digite a segunda nota");
        nota2 =input.nextDouble();

        input.close();

        media = (nota1 + nota2) / 2;

        if(media >= 9 && media <= 10) {
            notaConceito = 'A';
        } else if(media >= 7.5 && media < 9) {
            notaConceito = 'B';
        } else if(media >= 6 && media < 7.5) {
            notaConceito = 'C';
        } else if(media >= 4 && media <6) {
            notaConceito = 'D';
        } else {
            notaConceito = 'E';
        }

        switch(notaConceito) {
            case 'A', 'B', 'C':
                System.out.printf("sua nota: %.1f%n", media);
                System.out.println("conceito " + notaConceito);
                System.out.println("VOÇÊ ESTÁ APROVADO");
                break;
            case 'D', 'E':
                System.out.printf("sua nota: %.1f%n", media);
                System.out.println("conceito " + notaConceito);
                System.out.println("VOÇÊ ESTÁ REPROVADO");
                break;    
        }

    }
    
}
