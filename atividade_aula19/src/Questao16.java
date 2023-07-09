import java.util.Scanner;
import java.util.Locale;

public class Questao16 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];


    int contagemIgualA15 = 0;
    double somaMenorQue15 = 0;
    double somaMaiorQue15 = 0;
    double mediaMaiorQue15 = 0;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();
      if (A[i] < 15) {
        somaMenorQue15 += A[i];
      }
      if (A[i] == 15) {
        contagemIgualA15++; 
      }
      if (A[i] > 15) {
        somaMaiorQue15++;
      }
    }

    mediaMaiorQue15 = somaMaiorQue15 / 10;

    System.out.println("A soma dos elementos que são inferiores a 15 é: " + somaMenorQue15);
    System.out.println("A quantidade de elementos armazenados que são iguais a 15 é: " + contagemIgualA15);
    System.out.printf("A média dos elementos armazenados que são superiores a 15 é: %.2f%n", mediaMaiorQue15);

    scanner.close();

  }
}
