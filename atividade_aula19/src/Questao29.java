import java.util.Scanner;

public class Questao29 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];
    int[] B = new int[A.length];
    int[] C = new int[(A.length) * 2];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor para a posição " + (i + 1));
      A[i] = scanner.nextInt();
      C[i] = A[i];
    }

    System.out.println();
    System.out.println("Agora os valores de B");

    for (int i = 0; i < B.length; i++) {
      System.out.println("Insira o valor para a posição " + (i + 1));
      B[i] = scanner.nextInt();
    }

    C[10] = B[0];
    C[11] = B[1];
    C[12] = B[2];
    C[13] = B[3];
    C[14] = B[4];
    C[15] = B[5];
    C[16] = B[6];
    C[17] = B[7];
    C[18] = B[8];
    C[19] = B[9];

    for (int x : C) {
      System.out.println(x);
    }

    scanner.close();

  }
}
