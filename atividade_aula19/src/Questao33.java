import java.util.Scanner;

public class Questao33 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

      boolean primo = true;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();
    }

    for (int i = 0; i < A.length; i++) {
      primo = true;
      for (int j = 2; j < A[i]; j++) {
        if (A[i] % j == 0) {
          primo = false;
          break;
        }
      }
      if (primo == true) {
        System.out.println(A[i] + " é primo");
      }
      else if (primo != true) {
        System.out.println(A[i] + " não é primo");
      }
    }

    scanner.close();

  }
}
