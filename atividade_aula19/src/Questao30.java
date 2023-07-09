import java.util.Scanner;

public class Questao30 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[20];
    int[] B = new int[A.length];
    int[] C = new int[A.length];
    
    int posicaoB = 0;
    int posicaoC = 0;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor para posição " + (i + 1));
      A[i] = scanner.nextInt();
      
      if (A[i] % 2 == 0) {
        B[posicaoB] = A[i];
        posicaoB++;
      }
      else {
        C[posicaoC] = A[i];
        posicaoC++;
      }
    }

    System.out.println();
    System.out.println("Resultado para B");

    for (int i = 0; i < posicaoB; i++) {
      System.out.println(B[i]);
    }

    System.out.println();
    System.out.println("Resultado para C");

    for (int i = 0; i < posicaoC; i++) {
      System.out.println(C[i]);
    }

    scanner.close();

  }
}
