import java.util.Scanner;

public class AreaQuadradoDobro {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as medidas do quadrado (altura/base)");
    double medida = sc.nextDouble();

    double areaAoQuadrado = (Math.pow(medida, 2) * 2);

    System.out.println("A o dobro da área ao quadrado é: " + areaAoQuadrado);

    sc.close();

  }
}
