import java.util.Scanner;

public class Questao27 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];
    char[] B = new char[A.length];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();

      if (A[i] < 7) {
        B[i] = 'a';
      }
      else if (A[i] == 7) {
        B[i] = 'b';
      }
      else if (A[i] > 7) {
        B[i] = 'c';
      }
      else if (A[i] == 10) {
        B[i] = 'd';
      }
      else if (A[i] > 10) {
        B[i] = 'e';
      }
    }

    for (char x : B) {
      System.out.println(x);
    }

    scanner.close();

  }
}
