import java.util.Scanner;

public class Questao12 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

    int soma = 0;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i+1));
      A[i] = scanner.nextInt();
      soma += A[i];
    }

    System.out.println("A soma dos valores é: " + soma);

    scanner.close();

  }
}
