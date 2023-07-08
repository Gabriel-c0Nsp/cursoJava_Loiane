import java.util.Scanner;

public class Questao10 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];
    int[] B = new int[A.length];
    int[] C = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i+1));
      A[i] = scanner.nextInt();
    }

    System.out.println();

    System.out.println("Agora insira os valores de B");

    for (int i = 0; i < B.length; i++) {
      System.out.println("Insira o valor da posição " + (i+1));
      B[i] = scanner.nextInt();
      C[i] = A[i] % B[i];
    }

    for (int x : C) {
      System.out.println("Resultado: " + x);
    }
     
    scanner.close();

  }
}
