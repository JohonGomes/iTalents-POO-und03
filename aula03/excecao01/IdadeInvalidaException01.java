package aula03.excecao01;

public class IdadeInvalidaException01 extends Exception {
    public IdadeInvalidaException01(){
        super("Idade não pode ser negativa.");
    }

    public IdadeInvalidaException01(String mensagem){
        super(mensagem);
    }

    public IdadeInvalidaException01(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
