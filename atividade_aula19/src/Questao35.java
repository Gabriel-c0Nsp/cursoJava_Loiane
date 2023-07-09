import java.util.Scanner;

public class Questao35 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor para a posição " + (i + 1));
      A[i] = scanner.nextInt();
    }

    for (int i = 0; i < A.length; i++) {
      System.out.println("Relação do número " + A[i]);

      for (int j = 2; j < A.length; j++) {
        if (A[i] % j == 0) {
          System.out.println(j + " é um divisor");
        }
      }
      System.out.println();
    }

    scanner.close();

  }
}
