import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao09 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

    double[] A = new double[10];
    double[] B = new double[A.length];
    double[] C = new double[A.length];

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i+1));
      A[i] = scanner.nextDouble();
    }

    System.out.println();

    System.out.println("Agora insira os valores de B");

    for (int i = 0; i < B.length; i++) {
      System.out.println("Insira o valor da posição " + (i+1));
      B[i] = scanner.nextDouble();
      C[i] = A[i] / B[i];
    }

    for (double x : C) {
      System.out.println(decimalFormat.format(x));
    }
     
    scanner.close();

  }
}
