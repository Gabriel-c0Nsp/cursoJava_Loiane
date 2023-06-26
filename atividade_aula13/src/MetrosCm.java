import java.util.Scanner;

public class MetroCm {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor em metros e ele será convertido para centímetros");
    double metros = sc.nextDouble();

    double conversao = metros * 100;

    System.out.println();
    System.out.println(metros + " em Cm é igual á " + conversao + "cm");

    sc.close();
  }
}
