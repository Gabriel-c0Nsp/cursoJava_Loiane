import java.util.Scanner;
import java.util.Locale;

public class Questao14 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

    double soma = 0;
    double media = 0;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();
      soma += A[i];
    }

    media = soma / 10;

    System.out.printf("A média é: %.2f%n", media);

    scanner.close();

  }
}
