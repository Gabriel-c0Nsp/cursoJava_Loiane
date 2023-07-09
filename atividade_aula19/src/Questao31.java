import java.util.Scanner;

public class Questao31 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[20];
    int[] B = new int[A.length];

    int posicaoB = 0;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();

      if (A[i] % 2 == 0) {
        B[posicaoB] = A[i];
        posicaoB++;
      }
    }

    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 != 0) {
      B[posicaoB] = A[i];
      posicaoB++;
      }
    }

    System.out.println();
    System.out.println("Resultado de B");

    for (int x: B) {
      System.out.println(x);
    }

    scanner.close();

  }
}
