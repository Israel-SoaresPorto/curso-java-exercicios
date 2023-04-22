package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer015 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int lado1, lado2, lado3;
        String tipoDoTriangulo;

        System.out.println("insira os lados do triângulo");
        System.out.print("primeiro lado: ");
        lado1 = input.nextInt();
        System.out.print("segundo lado: ");
        lado2 = input.nextInt();
        System.out.print("terceiro lado: ");
        lado3 = input.nextInt();

        input.close();

        if(lado1 + lado2 > lado3) {
            if(lado1 + lado3 > lado2) {
                if(lado2 + lado3 > lado1) {

                    if((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado1)) {
                        tipoDoTriangulo = "equilátero";
                    } else if((lado1 == lado2) || (lado2 == lado3) || (lado3 == lado1)) {
                        tipoDoTriangulo = "isóleces";
                    } else {
                        tipoDoTriangulo = "escaleno";
                    }

                    System.out.println("é um triângulo " + tipoDoTriangulo);
                    
                } else {
                    System.out.println("não é um triângulo");
                }
            }
        }
    }
}
