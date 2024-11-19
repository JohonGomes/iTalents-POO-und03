package Atividades;
/*
4 - Escreva um programa que solicite ao usuário que insira um número e o divida por zero. Utilize um bloco
try-catch para capturar a exceção ArithmeticException e exiba uma mensagem amigável ao usuário.
 */

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário que digite um número
            System.out.print("Digite um número:");
            // Lê o número digitado pelo usuário
            int numero = scanner.nextInt();

            // Tenta realizar uma divisão por zero (que causará uma exceção)
            int resultado = numero / 0;
            // Esta linha não será executada devido à exceção
            System.out.println("O Resultado da Divisão é: " + resultado);

        } catch (ArithmeticException e) {
            // Captura e trata especificamente a exceção de divisão por zero
            System.out.println("Erro : Não é possível dividir por ZERO!");
        } catch (Exception e) {
            // Captura qualquer outro tipo de exceção não prevista
            System.out.println("Ocorreu um erro inesperado" + e.getMessage());
        } finally {
            // Bloco finally garante que o Scanner será fechado, independente de ocorrer exceção ou não
            scanner.close();
        }
    }
}