import java.util.Scanner;
import java.util.Locale;

public class Frutaria {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a quantidade de morangos comprados pelo cliente em kilos");
    double kilosMorango = scanner.nextDouble();

    System.out.println("Informe a quantidade de maçâs comprados pelo cliente em kilos");
    double kilosMacas = scanner.nextDouble();

    double valorDaCompraMorango = 0;
    double valorDaCompraMaca = 0;

    boolean descontoExtra = false;
    double valorDescontoExtra = 0;

    double valorFinal;

    if ((kilosMacas + kilosMorango > 8)) {
      descontoExtra = true;
    }

    if (kilosMorango >= 0 && kilosMorango <= 5) {
      valorDaCompraMorango = kilosMorango * 2.50;
    }

    if (kilosMorango >= 0 && kilosMorango > 5) {
      valorDaCompraMorango = kilosMorango * 2.20;
    }

    if (kilosMacas >= 0 && kilosMacas <= 5) {
      valorDaCompraMaca = kilosMacas * 1.80;
    }

    if (kilosMacas >= 0 && kilosMacas > 5) {
      valorDaCompraMaca = kilosMacas * 1.50;
    }

    if ((valorDaCompraMaca + valorDaCompraMorango > 25)) {
      descontoExtra = true;
    }

    valorFinal = valorDaCompraMorango + valorDaCompraMaca;

    if (descontoExtra == true) {
      valorDescontoExtra = 0.10 * valorFinal;
      valorFinal = valorFinal - valorDescontoExtra;
    }


    System.out.printf("O valor a ser pago pelo cliente será de: R$ %.2f%n", valorFinal);

    scanner.close();

  }
}
