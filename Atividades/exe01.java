package Atividades;
/*
1 - Escreva um metodo em Java que receba dois números como parâmetros e lance uma exceção se o
segundo número for zero.
*/

// Definição da classe principal
public class exe01 {
    // Metodo para realizar divisão, recebendo dividendo e divisor
    // Declara que pode lançar uma exceção ArithmeticException
    public static void dividir(int dividendo, int divisor) throws ArithmeticException {
        // Verifica se o divisor é zero para evitar divisão por zero
        if (divisor == 0) {
            // Lanca uma exceçao personalizada com uma mensagem de erro
            throw new ArithmeticException("Não é possível divisão por ZERO!");
        }
        // Realiza a divisão e armazena o resultado em uma variável
        int resultado = dividendo / divisor;
        // Imprime o resultado da divisão no console
        System.out.println("Resultado da divisão: " + resultado);
    }

    // Metodo principal (ponto de entrada do programa)
    public static void main(String[] args) {
        // Define valores para dividendo e divisor
        int dividendo = 30;
        int divisor = 0;

        // Bloco try-catch para tratar a possível exceção de divisão por zero
        try {
            // Chama o metodo de divisão com os valores definidos
            dividir(dividendo, divisor);
        } catch (ArithmeticException e) {
            // Captura e trata a exceção, imprimindo a mensagem de erro
            System.out.println("Ocorreu um erro de operação: " + e.getMessage());
        }
    }
}

