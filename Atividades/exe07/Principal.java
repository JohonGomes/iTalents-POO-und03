package Atividades.exe07;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        try {
            conta.sacar(2000); // Tentando sacar mais do que o saldo disponível
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
