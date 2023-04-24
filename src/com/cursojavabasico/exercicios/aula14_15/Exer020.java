package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer020 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double nota1, nota2,  nota3, media;

        System.out.println("digite a primeira nota");
        nota1 =input.nextDouble();

        System.out.println("digite a segunda nota");
        nota2 =input.nextDouble();

        System.out.println("digite a terceira nota");
        nota3 = input.nextDouble(); 

        input.close();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("sua média: %.1f %n", media);

        if(media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO!");
        } else if(media >= 7) {
            System.out.println("ESTA APROVADO!");
        } else {
            System.out.println("ESTÁ REPROVADO!");
        }
    }
    
}
