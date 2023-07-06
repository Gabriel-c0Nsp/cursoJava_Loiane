import java.util.Scanner;
import java.util.Locale;

public class Questao30 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o preço do pão");
    double precoDoPao = scanner.nextDouble();

    double quantidadeMaximaDePaes = 50;

    for (int i = 1; i <= quantidadeMaximaDePaes; i++) {
      System.out.printf(i + " - R$ %.2f%n", precoDoPao * i); 
    }

    scanner.close();

  }
}
