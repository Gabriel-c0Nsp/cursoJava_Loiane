import java.util.Scanner;
import java.util.Locale;

public class Questao08 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe 5 números. Ao final do programa os mesmo serão somados, e com isso, você também terá a média.");
    System.out.println();

    double numero;
    double soma = 0;
    double media = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite o número aqui: ");
      numero = scanner.nextDouble();
      soma += numero;
    }

    media = soma / 5;

    System.out.println("A soma dos números digitados é: " + soma);
    System.out.println("A media dos números digitados é: " + media);

    scanner.close();

  }
}
