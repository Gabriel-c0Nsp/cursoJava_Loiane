import java.util.Scanner;

public class Questao26 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];
    int[] B = new int[A.length];
    int[] C = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();
    }

    System.out.println();
    System.out.println("Agora os valores de B");

    for (int i = 0; i < B.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      B[i] = scanner.nextInt();

      if (A[i] > B[i]) {
        C[i] = 1;
      }
      else if (A[i] < B[i]) {
        C[i] = -1;
      }
      else if (A[i] == B[i]) {
        C[i] = 0;
      }
    }

    for (int x : C) {
      System.out.println(x);
    }

    scanner.close();

  }
}
