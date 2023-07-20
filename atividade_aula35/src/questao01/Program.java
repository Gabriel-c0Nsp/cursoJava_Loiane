package questao01;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira o enésimo número da sequência de Fibonacci: ");
    int numero = scanner.nextInt();

    System.out.println();
    System.out.println(
        "O " + numero + "º número da sequência de Fibonacci é: " + Fibonacci.calcularSequenciaFibonacci(numero));

    scanner.close();

  }
}
