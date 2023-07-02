import java.util.Scanner;
import java.util.Locale;

public class Operacoes {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois números");
    double numero1 = sc.nextDouble();
    double numero2 = sc.nextDouble();

    System.out.println("Agora digite qual operação você deseja realizar (este programa suporta apenas as quatro operações básicas).");

    char operacao = sc.next().charAt(0);
    
    double resultadoDaOperacao = 0;
    double resultadoInteiroOuDecimal = 0; 

    boolean valorValido = false;

    System.out.println(); //separar input do usuário do output (estética)
  
    if (operacao == '+') {
      resultadoDaOperacao = numero1 + numero2;
      valorValido = true;
      System.out.println("O resultado da operação é: " + resultadoDaOperacao);
      double resultadoDaOperacaoArredondado = Math.floor(resultadoDaOperacao);
      resultadoInteiroOuDecimal = resultadoDaOperacao - resultadoDaOperacaoArredondado;
    }
    else if (operacao == '-') {
      resultadoDaOperacao = numero1 - numero2;
      valorValido = true;
      System.out.println("O resultado da operação é: " + resultadoDaOperacao);
      double resultadoDaOperacaoArredondado = Math.floor(resultadoDaOperacao);
      resultadoInteiroOuDecimal = resultadoDaOperacao - resultadoDaOperacaoArredondado;
    }
    else if (operacao == '/') {
      resultadoDaOperacao = numero1 / numero2;
      valorValido = true;
      System.out.println("O resultado da operação é: " + resultadoDaOperacao);
      double resultadoDaOperacaoArredondado = Math.floor(resultadoDaOperacao);
      resultadoInteiroOuDecimal = resultadoDaOperacao - resultadoDaOperacaoArredondado;
    }
    else if (operacao == '*') {
      resultadoDaOperacao = numero1 * numero2;
      valorValido = true;
      System.out.println("O resultado da operação é: " + resultadoDaOperacao);
      double resultadoDaOperacaoArredondado = Math.floor(resultadoDaOperacao);
      resultadoInteiroOuDecimal = resultadoDaOperacao - resultadoDaOperacaoArredondado;
    }
    else {
      System.out.println("Você digitou um valor inválido");
    }

    System.out.println(); //separar input do usuário do output (estética)

    if (valorValido == true && resultadoDaOperacao % 2 == 0) {
      System.out.println("É um valor par");
    }
    if (valorValido == true && resultadoDaOperacao % 2 != 0) {
      System.out.println("É um valor ímpar");
    }
    if (valorValido == true && resultadoDaOperacao > 0) {
      System.out.println("É um valor positivo");
    }
    if (valorValido == true && resultadoDaOperacao < 0) {
      System.out.println("É um valor negativo");
    }
    if (valorValido == true && resultadoDaOperacao == 0) {
      System.out.println("0 é um número neutro");
    }
    
    if (valorValido == true && resultadoInteiroOuDecimal == 0) {
      System.out.println("É um valor inteiro");
    }
    if (valorValido == true && resultadoInteiroOuDecimal != 0) {
      System.out.println("É um valor decimal");
    }

    sc.close();
    
  }
}
