package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer024 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int opcao;
        double numero1, numero2, resultado = 0; 

        System.out.print("digite o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("digite o segundo número: ");
        numero2 = input.nextInt();

        
        System.out.println("qual operação deseja fazer?");
        System.out.println("1 - somar os números");
        System.out.println("2 - subtrair os números");
        System.out.println("3 - multiplicar os números");
        System.out.println("4 - dividir os números");
        System.out.print("selecione su opção: ");
        opcao = input.nextInt();
        
        input.close();

        switch(opcao) {
            case 1:
                System.out.println("somando...");

                resultado = numero1 + numero2;

                System.out.printf("resultado: %.2f %n", resultado);
                break;
            case 2:
                System.out.println("subtraindo...");

                resultado = numero1 - numero2;

                System.out.printf("resultado: %.2f %n", resultado);
                break;
            case 3:
                System.out.println("multiplicando...");

                resultado = numero1 * numero2;

                System.out.printf("resultado: %.2f %n", resultado);
                break;
            case 4:
                System.out.println("dividindo...");

                resultado = numero1 / numero2;

                System.out.printf("resultado: %.2f %n", resultado);
                break;
            default:
                System.out.println("opção invalida.");
                break;            
        }

        if (resultado > 0) {

            if(resultado % 2 == 0) {
                System.out.println("resultado é par");
            } else {
                System.out.println("resultado é impar");
            }

            if(resultado > 0) {
            System.out.println("resultado é positivo");
            } else {
                System.out.println("resultado é negativo");
            }

            double numeroArrendondado = Math.floor(resultado);

            if (resultado == numeroArrendondado) {
                System.out.println("resultado é inteiro.");
            } else {
                System.out.println("resultado é decimal.");
            }

        } else {
            System.out.println("ERRO!");
        }

    }

}
