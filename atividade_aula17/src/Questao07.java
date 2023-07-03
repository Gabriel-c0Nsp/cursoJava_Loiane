import java.util.Scanner;
import java.util.Locale;

public class Questao07 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double maior = Integer.MIN_VALUE;
    double num;

    System.out.println("Digite 5 números e o programa irá mostrar o maior deles");

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite um número");
      num = scanner.nextDouble();
      if (maior < num) {
        maior = num;
      }
     
      System.out.println("O maior número é: " + maior);
    }

    scanner.close();

  }
}
