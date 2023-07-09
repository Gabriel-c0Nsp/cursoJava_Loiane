import java.util.Random;
import java.util.Locale;

public class Questao22 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Random random = new Random();

    int[] A = new int[10];

    int um = 0;
    double percentualDeNumeros1;
    int zero = 0;
    double percentualDeNumeros0;

    for (int i = 0; i < A.length; i++) {
      A[i] = (int)Math.round(Math.random() * 1);
      
      if (A[i] == 1) {
        um++;
      }
      else if (A[i] == 0) {
        zero++;
    }
    }

    percentualDeNumeros1 = (um * 100) / 10;
    percentualDeNumeros0 = (zero * 100) / 10;

    System.out.printf("O percentual de números 0's é de: %.1f%% %n", percentualDeNumeros0);
    System.out.printf("O percentual de números 1's é de: %.1f%% ", percentualDeNumeros1);
  }
}
