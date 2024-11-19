package aula03.excecao02;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){
        super("Saldo Insuficiente para a operação!");
    }

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }

    public SaldoInsuficienteException(String mensagem, Throwable causa){
        super(mensagem,causa);
    }

}
