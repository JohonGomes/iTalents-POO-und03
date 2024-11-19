package Atividades;
/*
6 - Implemente um programa que converta uma string em um número inteiro. Utilize um bloco try-catch para
capturar a exceção NumberFormatException caso a string não seja um número válido.
*/

public class exe06 {
    public static void main(String[] args) {
        // Define uma string que não representa um número
        String numeroString = "Johon";

        try {
            // Tenta converter a string para um número inteiro
            int numero = Integer.parseInt(numeroString);
            // Imprime o número convertido (esta linha não será executada)
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            // Captura a exceção quando a conversão não é possível
            System.out.println("Erro: A string não é um número válido.");
        }
    }
}