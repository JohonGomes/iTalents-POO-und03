package aula02;

import java.util.Scanner;

public class ExeCapturaExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número inteiro:");
        String input = scanner.nextLine();

        try{
            int numero = Integer.parseInt(input);
            System.out.println("Número digital: " +  numero);
        }catch (Exception e){
            System.out.println("Erro: não foi possível converter a entrada em número inteiro");
            System.out.println("Mensagem de exceção : " + e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
