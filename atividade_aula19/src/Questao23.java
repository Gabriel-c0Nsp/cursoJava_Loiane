import java.util.Scanner;

public class Questao23 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();
      if (A[i] % 2 != 0) {
        break;
      }
    }
  }
}
