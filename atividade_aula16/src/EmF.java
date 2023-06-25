import java.util.Scanner;

public class EmF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em Celsius");
    double temperaturaCelsius = sc.nextDouble();

    double conversao = (temperaturaCelsius * 1.8) + 32;

    System.out.println("a temperatura " + temperaturaCelsius + " é igual a " + conversao + " em Farenheit");

    sc.close();
  }
}
