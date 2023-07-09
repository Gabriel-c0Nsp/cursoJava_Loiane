import java.util.Scanner;

public class Questao24 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

    for (int i = 0; i < A.length; i++) {
      A[i] = scanner.nextInt();
    }

    if (A[0] == A[9] && A[1] == A[8] && A[2] == A[7] && A[3] == A[6] && A[4] == A[5]) {
      System.out.println("Este é um palíndromo");
    }
    else {
      System.out.println("Este não é um palíndromo");
    }

    scanner.close();

  }
}
