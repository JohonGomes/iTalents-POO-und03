package aula03.excecao03;

public class TransacaoInvalidaException extends Exception {
    public TransacaoInvalidaException(String mensagem){
        super(mensagem);
    }

    public TransacaoInvalidaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }

}
