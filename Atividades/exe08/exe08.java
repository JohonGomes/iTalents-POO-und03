package Atividades.exe08;
/*
8 - Implemente uma classe ValidadorSenha que contenha um metodo validarSenha(String senha) que lança
uma exceção personalizada SenhaInvalidaException se a senha não atender aos critérios de segurança (por
exemplo, se for muito curta).
*/
public class exe08 {
    static class SenhaInvalidaException extends Exception{
        public SenhaInvalidaException(String mensagem){
            super(mensagem);
        }
    }

    static class ValidadorSenha{
        public void validarSenha(String senha) throws SenhaInvalidaException{
            if (senha.length() < 10 ){
                throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres.");
            }
            System.out.println("Senha válida.");
        }
    }
}
