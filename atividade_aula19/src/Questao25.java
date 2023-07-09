import java.util.Scanner;

public class Questao25 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];
    int[] B = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Informe o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();

      if (A[i] % 2 == 0) {
        B[i] = 1;
      }
      else {
        B[i] = 0;
      }
    }

    for (int x : B) {
      System.out.println(x);
    }

    scanner.close();

  }
}
