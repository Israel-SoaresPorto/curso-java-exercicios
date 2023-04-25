package com.cursojavabasico.exercicios.aula14_15;

import java.util.Scanner;

public class Exer025 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String resposta;
        int respostaPositiva = 0;

        System.out.println("responda as questões com sim ou não.\n");
        System.out.print("telefonou para a vitima? ");
        resposta = input.nextLine();

        switch(resposta) {
            case "sim":
                respostaPositiva++;
                break;
            default:
                break;
        }

        System.out.print("esteve no local do crime? ");
        resposta = input.nextLine();

        switch(resposta) {
            case "sim":
                respostaPositiva++;
                break;
            default:
                break;
        }

        System.out.print("mora perto da vitima? ");
        resposta = input.nextLine();

        switch(resposta) {
            case "sim":
                respostaPositiva++;
                break;
            default:
                break;
        }

        System.out.print("devia para a vitima? ");
        resposta = input.nextLine();

        switch(resposta) {
            case "sim":
                respostaPositiva++;
                break;
            default:
                break;
        }

        System.out.print("já trabalhou para a vitima? ");
        resposta = input.nextLine();

        switch(resposta) {
            case "sim":
                respostaPositiva++;
                break;
            default:
                break;
        }

        input.close();

        System.out.println("\nanalizando suas respostas;");

        if(respostaPositiva == 2) {
            System.out.println("voçê é suspeito do crime.");
        } else if (respostaPositiva > 2 && respostaPositiva <= 4) {
            System.out.println("voçê é cumplice do crime.");
        } else if(respostaPositiva == 5) {
            System.out.println("voçê é o assassino.");
        } else {
            System.out.println("voçê é inocente.");
        }
    }
    
}
