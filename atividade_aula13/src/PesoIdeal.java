import java.util.Scanner;

public class PesoIdeal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a sua altura");
    double altura = sc.nextDouble();

    double pesoIdeal = (72.7*altura) - 58;

    System.out.println("A o seu peso ideal é: " + pesoIdeal);

    sc.close();
  }
}
