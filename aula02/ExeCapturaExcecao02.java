package aula02;

import java.util.Scanner;

public class ExeCapturaExcecao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);

        try{
            System.out.println("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.println("Digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado da Divisão é igual : "+  resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro : " + e.getMessage());
        }catch ( Exception e){
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }

    public static int dividir(int numerador, int denominador){
        if(denominador == 0 ){
            throw new ArithmeticException("Divisão por Zero não é permitida");
        }
        return numerador / denominador;
    }
}
