import java.util.Scanner;
import java.util.Locale;

public class PostoDeGasolina {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual a quantidade de litros vendida?");
    double litrosVendidos = scanner.nextDouble();

    System.out.println("Qual foi o tipo do combustível vendido (insira \"G\" para gasolina ou \"A\" para álcool)?");
    String tipoDoCombustivel = scanner.next();

    double precoSemDesconto = 0; 
    double desconto = 0;
    double precoFinal = 0;

    if (tipoDoCombustivel.equalsIgnoreCase("A") && litrosVendidos > 0 && litrosVendidos <= 20) {
      desconto = 0.03 * precoSemDesconto;
      precoFinal = precoSemDesconto - desconto;
      precoSemDesconto = litrosVendidos * 1.90;
      System.out.printf("O valor a ser pago pelo cliente será de: R$ %.2f%n", precoFinal);
    }
    else if (tipoDoCombustivel.equalsIgnoreCase("A") && litrosVendidos > 0 && litrosVendidos > 20) {
      desconto = 0.05 * precoSemDesconto;
      precoFinal = precoSemDesconto - desconto;
      precoSemDesconto = litrosVendidos * 1.90;
      System.out.printf("O valor a ser pago pelo cliente será de: R$ %.2f%n", precoFinal);
    }
    else if (tipoDoCombustivel.equalsIgnoreCase("G") && litrosVendidos > 0 && litrosVendidos <= 20) {
      precoSemDesconto = litrosVendidos * 2.50;
      desconto = 0.04 * precoSemDesconto;
      precoFinal = precoSemDesconto - desconto;
      System.out.printf("O valor a ser pago pelo cliente será de: R$ %.2f%n", precoFinal);
    }
    else if (tipoDoCombustivel.equalsIgnoreCase("G") && litrosVendidos > 0 && litrosVendidos > 20) {
      precoSemDesconto = litrosVendidos * 2.50;
      desconto = 0.06 * precoSemDesconto;
      precoFinal = precoSemDesconto - desconto;
      System.out.printf("O valor a ser pago pelo cliente será de: R$ %.2f%n", precoFinal);
    }
    else {
      System.out.println("Você não digitou valores corretos.");
    }

    scanner.close();

  }
}
