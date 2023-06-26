import java.util.Scanner;

public class AreaCirculo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o raio do círculo");
    double raio = sc.nextDouble();

    double pi = 3.14;

    double areaCirculo = pi * (raio * raio);

    System.out.println("A área do círculo é: " + areaCirculo);

    sc.close();

  }
}
