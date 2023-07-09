import java.util.Scanner;

public class Questao13 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

    int soma = 0;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i+1));
      A[i] = scanner.nextInt();
      if (A[i] % 5 == 0) {
        soma += A[i];
      }
    }

    System.out.println("Ao somar apenas os múltiplos de 5, temos: " + soma);

    scanner.close();

  }
}
