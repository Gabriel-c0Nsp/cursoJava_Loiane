import java.util.Scanner;
import java.util.Locale;

public class PositivoNegativo {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número e ao final do programa você saberá se ele é positivo ou negativo");
    double numero = sc.nextDouble();

    if (numero > 0) {
      System.out.println("Este é um número positivo");
    }
    else if (numero < 0) {
      System.out.println("Este é um número negativo");
    }
    else {
      System.out.println("Você digitou o número 0");
    }

    sc.close();

  }
}
