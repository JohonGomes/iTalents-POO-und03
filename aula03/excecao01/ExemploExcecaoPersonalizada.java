package aula03.excecao01;

public class ExemploExcecaoPersonalizada {
    public static void main(String[] args) {
        try{
            cadastrarUsuario("Johon", -5);
        } catch (IdadeInvalidaException01 e) {
            System.out.println("Erro ao cadastrar Usuário - " + e.getMessage());
        }

    }

    public static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException01{
        if(idade < 0 ){
            throw new IdadeInvalidaException01("A idade precisa ser inteira e positiva");
        }
        System.out.println("Usuário cadastrado: " + nome + " ,  idade:" + idade+ " anos");
    }
}
