package aula03.excecao02;

public class ExemploExcecaoPersonalizada {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1000);

        try{
            contaBancaria.sacar(1200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar " + e.getMessage());
        }
    }
}
