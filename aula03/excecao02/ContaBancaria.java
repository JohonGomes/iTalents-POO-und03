package aula03.excecao02;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria( double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente, Saldo Atual R$: " + saldo + " . valor pretendido para saque: " + valor);
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        System.out.println("Saldo atual R$:" + saldo);
    }
}
