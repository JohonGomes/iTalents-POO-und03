package aula01;

public class ExeLancamentoExcecao {
    public static void main(String[] args) {
        try {
            realizarDivisao(10,2);
            realizarDivisao(7,0);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao realizar a divisão:" + e.getMessage());
        }
    }

    public static void realizarDivisao(int numerador, int denominador){
        if ( denominador == 0){
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }
        int resultado = numerador / denominador;
        System.out.println("Resultado da divisão :" + resultado);
    }
}
