import java.util.Scanner;

public class SomaDois {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois números e os mesmos serão somados ao final do programa");

    System.out.println();

    System.out.println("Digite o primeiro número");
    double numero1 = sc.nextDouble();

    System.out.println("Digite o segundo número");
    double numero2 = sc.nextDouble();

    double soma = numero1 + numero2;
    System.out.println();

    System.out.println("A soma dos dois números é " + soma);
  }
}
