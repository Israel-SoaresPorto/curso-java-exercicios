package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer005 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("digite a primeira nota");
        nota1 =input.nextDouble();

        System.out.println("digite a segunda nota");
        nota2 =input.nextDouble();

        input.close();

        media = (nota1 + nota2) / 2;

        if(media >= 7) {
            System.out.println("ESTA APROVADO!");
        } else if(media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO!");
        } else {
            System.out.println("ESTÁ REPROVADO!");
        }
    }
    
}
