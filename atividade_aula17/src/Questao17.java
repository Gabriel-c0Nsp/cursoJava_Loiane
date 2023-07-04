import java.util.Scanner;

public class Questao17 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa é uma calculadora de fatorial. Digite o número inteiro que deseja calcular");
    int numero = scanner.nextInt();

    System.out.println();

    int resultado = 1;

    for (int i = numero; i > 0; i--) {
      resultado = resultado * i;
    }

    System.out.println("O resultado de " + numero + "! é igual a " + resultado);

    scanner.close();

  }
}
