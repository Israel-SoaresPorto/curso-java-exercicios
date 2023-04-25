package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer026 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String conbustivel;
        double litros, preco, desconto, precoTotal, precoFinal;

        System.out.print("Digite A para álcool ou G para gasolina: ");
        conbustivel = input.nextLine();

        System.out.print("digite a quantidade de litros que quer comprar: ");
        litros = input.nextDouble();

        input.close();

        switch(conbustivel) {
            case "A", "a":
                preco = 1.90;

                if(litros > 20) {
                    desconto = 0.05;
                } else {
                    desconto = 0.03; 
                }

                break;
            case "G", "g":
                preco = 2.50;

                if(litros > 20) {
                    desconto = 0.06;
                } else {
                    desconto = 0.04; 
                }

                break;
            default:
                System.out.println("produto não indentificado");
                return;    
        }

        precoTotal = preco * litros;
        precoFinal = precoTotal - (precoTotal * desconto);

        System.out.printf("preço do conbustivel: %.2f %n", preco);
        System.out.printf("desconto: %.0f%c %n", desconto * 100, '%');
        System.out.printf("preço final: R$%.2f %n", precoFinal);

    }
}
