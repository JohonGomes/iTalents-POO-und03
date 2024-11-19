package Atividades.exe08;

public class Principal {
    public static void main(String[] args) {
        exe08.ValidadorSenha validadorSenha = new exe08.ValidadorSenha();
        try{
            validadorSenha.validarSenha("123456789");
        } catch (exe08.SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
