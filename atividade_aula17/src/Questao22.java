import java.util.Scanner;

public class Questao22 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número inteiro e ao final do programa você saberá se ele é um número primo ou não");
    int numero = scanner.nextInt();

    boolean numeroPrimo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        System.out.println("divisível por: " + i);
        numeroPrimo = false;
      }
    }
    if (numeroPrimo == false) {
      System.out.println("Portanto, o número " + numero + " não é um número primo.");
    }

    if (numeroPrimo) {
        System.out.println(numero + " é um número primo");
    }

    scanner.close();

  }
}
