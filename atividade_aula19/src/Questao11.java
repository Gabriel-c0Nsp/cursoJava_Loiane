import java.util.Scanner;

public class Questao11 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira 10 números inteiros e saiba quantos deles são par");
    System.out.println();

    int[] A = new int[10];

    int par = 0;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor de A para a posição " + (i + 1));
      A[i] = scanner.nextInt();
        if (A[i] % 2 == 0) {
          par++;
        }
    }

    System.out.println("A quantidade de números pares é: " + par);

    scanner.close();

  }
}
