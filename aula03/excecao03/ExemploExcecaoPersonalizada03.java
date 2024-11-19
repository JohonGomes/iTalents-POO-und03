package aula03.excecao03;

public class ExemploExcecaoPersonalizada03 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1000);

        try{
            contaBancaria.realizarTransacao(100);
        } catch (TransacaoInvalidaException e) {
            System.out.println("Erro ao realizar a transação "+ e.getMessage());
            if ((e.getCause() instanceof SaldoInsuficienteException)){
                System.out.println("Causa: Saldo insuficiente");
            }
        }
    }
}
