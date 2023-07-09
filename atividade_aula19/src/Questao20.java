import java.util.Scanner;

public class Questao20 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double[] A = new double[20];

    System.out.println("Digite a cotação do dolar em relação ao real");
    double cotacao = scanner.nextDouble();

    for (int i = 0; i < A.length; i++) {
      A[i] = cotacao * i;
      System.out.println("Resultado: " + A[i]);
    }

    scanner.close();

  }
}
