import java.util.Scanner;

public class Questao23 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número inteiro e ao final do programa você saberá se ele é um número primo ou não");
    int numero = scanner.nextInt();

    System.out.println();

    boolean numeroPrimo = true;
    int numeroDeDivisoes = 0;
    int numeroDeDivisores = 0;

    for (int i = 2; i < numero; i++) {
      numeroDeDivisoes = i;
      if (numero % i == 0) {
        System.out.println("divisível por: " + i);
        numeroDeDivisores++;
        numeroPrimo = false;
      }
    }

    System.out.println("O número de divisões executadas foram: " + numeroDeDivisoes);
    System.out.println("O número de divisores é de: " + numeroDeDivisores);

    if (numeroPrimo == false) {
      System.out.println("Portanto, o número " + numero + " não é um número primo.");
    }

    if (numeroPrimo) {
        System.out.println(numero + " é um número primo");
    }

    scanner.close();

  }
}
