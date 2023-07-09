import java.util.Scanner;

public class Questao28 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];
    int[] B = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Inserir o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();
    }

    B[0] = A[9];
    B[1] = A[8];
    B[2] = A[7];
    B[3] = A[6];
    B[4] = A[5];
    B[5] = A[4];
    B[6] = A[3];
    B[7] = A[2];
    B[8] = A[1];
    B[9] = A[0];

    System.out.println();
    for (int x : B) {
      System.out.println(x);
    }

    scanner.close();

  }
}
