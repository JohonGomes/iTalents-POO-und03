package Atividades.exe02;
/*
2 - Crie uma classe ConversorTemperatura com um metodo converterCelsiusParaFahrenheit(double
temperaturaCelsius). Este metodo deve lançar uma exceção do tipo IllegalArgumentException se a
temperatura Celsius fornecida for menor que -273.15, que é o zero absoluto em Celsius. Implemente um
programa que utilize esta classe para converter uma temperatura Celsius em Fahrenheit e capture a exceção,
caso ocorra, fornecendo uma mensagem de erro adequada.
 */

// Classe para conversão de temperaturas
public class ConversorTemperatura {
    // Metodo para converter temperatura de Celsius para Fahrenheit
    public static double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        // Validação para impedir temperaturas abaixo do zero absoluto
        if (temperaturaCelsius < -273.15) {
            // Lança exceção se a temperatura for invalida
            throw new IllegalArgumentException("Temperatura inválida: menor que zero absoluto em Celsius");
        }
        // Fórmula de conversao de Celsius para Fahrenheit
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    // Classe interna com o metodo main para executar a conversão
    public static class exe02 {
        public static void main(String[] args) {
            // Definição de uma temperatura inválida em Celsius
            double temperaturaCelsius = -300;

            // Bloco try-catch para tratamento de exceção
            try {
                // Tenta converter a temperatura
                double temperaturaFahrenheit = ConversorTemperatura.converterCelsiusParaFahrenheit(temperaturaCelsius);
                // Imprime o resultado da conversão
                System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
            } catch (IllegalArgumentException e) {
                // Captura e imprime mensagem de erro caso a temperatura seja inválida
                System.out.println("Erro de conversão: " + e.getMessage());
            }
        }
    }
}
