package Atividades;
/*
5 - Crie um metodo que leia um arquivo em Java e capture a exceção FileNotFoundException caso o arquivo
não seja encontrado.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exe05 {
    // Metodo para ler e imprimir o conteúdo de um arquivo
    public static void lerArquivo(String nomeArquivo) {
        try {
            // Cria um objeto File com o nome do arquivo
            File arquivo = new File(nomeArquivo);
            // Cria um Scanner para ler o conteúdo do arquivo
            Scanner scanner = new Scanner(arquivo);

            // Lê o arquivo linha por linha
            while (scanner.hasNextLine()) {
                // Obtém cada linha do arquivo
                String linha = scanner.nextLine();
                // Imprime a linha lida
                System.out.println(linha);
            }
            // Fecha o Scanner após a leitura
            scanner.close();
        } catch (FileNotFoundException e) {
            // Trata o caso de arquivo não encontrado
            System.out.println("Erro: O arquivo não pode ser encontrado!");
        }
    }

    public static void main(String[] args) {
        // Chama o metodo lerArquivo com o nome de um arquivo específico
        lerArquivo("arquivo.txt");
    }
}
