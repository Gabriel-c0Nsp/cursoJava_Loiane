package questao03;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira dois números por favor");

    System.out.println();
    System.out.print("Primeiro número: ");
    double numero1 = scanner.nextInt();

    System.out.print("Segundo número: ");
    double numero2 = scanner.nextInt();

    System.out.println();
    System.out.println("A soma dos dois números é: " + Calculadora.somar(numero1, numero2));
    System.out.println("A subtração dos dois números é: " + Calculadora.subtrair(numero1, numero2));
    System.out.println("A multiplicação dos dois números é: " + Calculadora.multiplicar(numero1, numero2));
    System.out.println("A divisão dos dois números é: " + Calculadora.dividir(numero1, numero2));

    System.out.println();
    System.out.println("Agora insira um número que servirá para a base");
    double numero = scanner.nextDouble();
    System.out.println("Agora o expoente");
    int expoente = scanner.nextInt();

    System.out.println();
    System.out.print("O resultado é: " + Calculadora.elevarAPotencia(numero, expoente));

    System.out.println();
    System.out.println("Agora digite o número inteiro que deseja calcular o fatorial");
    int fatorial = scanner.nextInt();

    System.out.println("O resultado de " + fatorial + "! é igual a " + Calculadora.calcularFatorial(fatorial));

    scanner.close();

  }
}
