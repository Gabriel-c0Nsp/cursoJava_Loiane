import java.util.Scanner;
import java.util.Locale;

public class MaiorNumero2 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 3 números e ao final do programa você saberá qual é o maior entre eles");
    double numero1 = sc.nextDouble();
    double numero2 = sc.nextDouble();
    double numero3 = sc.nextDouble();

    if (numero1 > numero2 && numero1 > numero3) {
      System.out.println("O " + numero1 + " é o maior número");
    }
    else if (numero2 > numero1 && numero2 > numero3) {
      System.out.println("O " + numero2 + " é o maior número");
    }
    else if (numero3 > numero1 && numero3 > numero2) {
      System.out.println("O " + numero3 + " é o maior número");
    }
    else {
      System.out.println("Os números digitados são iguais");
    }
    
    sc.close();

  }
}
