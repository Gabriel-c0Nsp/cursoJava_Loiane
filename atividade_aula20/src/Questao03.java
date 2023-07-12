import java.util.Scanner;

public class Questao03 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[][] M = new int[3][3];

    int pares = 0;
    int impares = 0;

    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M[i].length; j++) {
        System.out.println("Entre com o valor da posição [" + i + ", " + j + "]");
        M[i][j] = scanner.nextInt();
        if (M[i][j] % 2 == 0) {
          pares++;
        } else {
          impares++;
        }
      }
    }

    System.out.println();

    System.out.println("Numeros pares: " + pares);
    System.out.println("Numeros ímpares: " + impares);

    scanner.close();

  }
}
