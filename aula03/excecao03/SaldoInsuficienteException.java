package aula03.excecao03;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(){
        super("Saldo insuficiente para realizar a operação");
    }

    private SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }

    private SaldoInsuficienteException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }

}
