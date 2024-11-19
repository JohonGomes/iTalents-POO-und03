package Atividades.exe03;

/*
3 - Implemente uma classe Idade que tenha um metodo verificarIdade(int idade) que lança uma exceção se
a idade for menor que 0 ou maior que 150.
*/

public class idade {
    public static void verificarIdade(int idade) throws IllegalArgumentException {
        // Verifica se a idade está fora do intervalo válido (0-150 anos)
        if (idade < 0 || idade > 150) {
            // Lança exceção com mensagem personalizada para idade inválida
            throw new IllegalArgumentException("A idade não é válida! A idade inserida dever ser entre 0 e 150 anos.");
        }
        // Imprime mensagem confirmando que a idade é válida
        System.out.println("Idade válida: " + idade);
    }

    public static void main(String[] args) {
        // Define uma idade inválida para teste
        int idade = 200;

        // Bloco try-catch para capturar e tratar a exceção
        try {
            // Chama o metodo de verificação de idade
            verificarIdade(idade);
        } catch (IllegalArgumentException e) {
            // Imprime a mensagem de erro capturada
            System.out.println("Ocorreu um erro: " +  e.getMessage());
        }
    }
}