import java.util.Scanner;

public class MaiorNumero {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira dois números");
    double numero1 = sc.nextDouble();
    double numero2 = sc.nextDouble();

    if (numero1 > numero2) {
      System.out.println("O número " + numero1 + " é maior que o número " + numero2);
    }
    else if (numero2 > numero1) {
      System.out.println("O número " + numero2 + " é maior que o número " + numero1);
    }
    else {
      System.out.println("Estes números são iguais");
    }

    sc.close();

  }
}
