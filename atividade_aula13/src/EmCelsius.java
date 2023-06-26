import java.util.Scanner;

public class EmCelsius {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em Farenheit");
    double temperaturaFarenheit = sc.nextDouble();

    double conversao = (temperaturaFarenheit - 32) / 1.8;

    System.out.println("a temperatura " + temperaturaFarenheit + " é igual a " + conversao + " em celsius");

    sc.close();
  }
}
