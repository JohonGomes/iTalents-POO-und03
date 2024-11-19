# Exercícios sobre Lançamento e Tratamento de Exceções em Java

Este repositório contém exercícios práticos para aprimorar seus conhecimentos sobre **exceções** em Java. As atividades são divididas em três categorias principais: **lançamento de exceções**, **captura de exceções** e **exceções personalizadas**. 

## 📋 Exercícios

### 1. Lançamento de Exceções
1. **Divisão por zero**  
   Implemente um método que receba dois números como parâmetros e lance uma exceção se o segundo número for zero.

2. **Conversão de temperatura**  
   Crie uma classe `ConversorTemperatura` com o método `converterCelsiusParaFahrenheit(double temperaturaCelsius)`.  
   - Lance uma exceção `IllegalArgumentException` se a temperatura Celsius for menor que -273.15 (zero absoluto).  
   - Capture a exceção e exiba uma mensagem de erro amigável.

3. **Validação de idade**  
   Crie uma classe `Idade` com o método `verificarIdade(int idade)` que lança uma exceção se:  
      - A idade for menor que 0.  
      - A idade for maior que 150.  

### 2. Captura de Exceções
4. **Divisão por zero com entrada do usuário**  
   Escreva um programa que:  
   - Solicite ao usuário que insira um número.  
   - Divida o número por zero.  
   - Use um bloco `try-catch` para capturar a exceção `ArithmeticException` e exibir uma mensagem amigável.  

5. **Leitura de arquivos**  
   Implemente um método que leia um arquivo.  
   - Capture a exceção `FileNotFoundException` caso o arquivo não seja encontrado.  

6. **Conversão de string para inteiro**  
   Crie um programa que converta uma string em um número inteiro.  
   - Use um bloco `try-catch` para capturar a exceção `NumberFormatException` caso a string não seja válida.  

### 3. Exceções Personalizadas
7. **Saldo insuficiente**  
   - Crie uma exceção personalizada `SaldoInsuficienteException`.  
   - Lance essa exceção quando houver uma tentativa de sacar mais dinheiro do que o saldo disponível.  

8. **Validação de senha**  
   - Implemente uma classe `ValidadorSenha` com o método `validarSenha(String senha)`.  
   - Crie uma exceção personalizada `SenhaInvalidaException` para ser lançada se a senha não atender aos critérios de segurança (ex.: senha muito curta).  

9. **Transferência bancária**  
   - Desenvolva uma classe `ContaBancaria` com o método `transferir`.  
   - Lance uma exceção personalizada `TransferenciaInvalidaException` se a quantia a ser transferida for menor ou igual a zero.  

10. **Divisão inteira exata**  
    - Crie uma classe `DivisaoInteira` com o método que realize a divisão inteira entre dois números.  
    - Lance uma exceção personalizada `DivisaoInteiraInvalidaException` se a divisão não for exata.  

## 🚀 Como começar
1. Clone este repositório.  
2. Implemente os exercícios seguindo as instruções fornecidas.  
3. Teste e valide suas soluções.  

## 💡 Sugestões
- Use boas práticas de programação, como tratamento adequado de exceções e mensagens claras para o usuário.  
- Explore a documentação oficial do Java para aprender mais sobre o sistema de exceções.  

## 📚 Recursos úteis
- [Documentação oficial do Java sobre exceções](https://docs.oracle.com/javase/tutorial/essential/exceptions/)  
- Tutoriais sobre [exceções personalizadas](https://www.baeldung.com/java-new-custom-exception)  

--- 

Boa prática e aprendizado! 😊
