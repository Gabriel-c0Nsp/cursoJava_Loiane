import java.util.Scanner;

public class Questao32 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[5];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor para a posição " + (i + 1));
      A[i] = scanner.nextInt();
    }

    for (int i = 0; i < A.length; i++) {
      System.out.println();
      System.out.println("Tabuada do " + A[i]);

      for (int j = 1; j <= 10; j++) {
        System.out.println(j + " x " + A[i] + " = " + (A[i] * j));
      }
    }

    System.out.println();

    scanner.close();

  }
}
