package questao02;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira um número para que seu somatório seja calculado: ");
    int numero = scanner.nextInt();

    System.out.println(); 
    System.out.println("O resultado para o somatório a partir de " + numero + " é: " + Somatorio.calcularSomatorio(numero));

    scanner.close();

  }
}
