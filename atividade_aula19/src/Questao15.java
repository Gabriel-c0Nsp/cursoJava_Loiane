import java.util.Scanner;
import java.util.Locale;

public class Questao15 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int[] A = new int[10];

    int numerosPares = 0;
    int numerosImpares = 0;
    double porcentagemNumerosPares;
    double porcentagemNumerosImpares;

    for (int i = 0; i < A.length; i++) {
      A[i] = scanner.nextInt();
      
      if (A[i] % 2 == 0) {
        numerosPares++;
      }
      else {
        numerosImpares++;
      }
    }

    porcentagemNumerosPares = (numerosPares * 100) / 10;
    porcentagemNumerosImpares = (numerosImpares * 100) / 10;

    System.out.printf("Resultado: %.1f%% de números pares", porcentagemNumerosPares);
    System.out.printf("Resultado: %.1f%% de números ímpares", porcentagemNumerosImpares);

    scanner.close();

  }
}
