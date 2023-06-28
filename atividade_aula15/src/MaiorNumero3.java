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

    double maiorNumero = 0;
    double menorNumero = 0;

    if (numero1 > numero2 && numero1 > numero3) {
      maiorNumero = numero1;
    }
    else if (numero2 > numero1 && numero2 > numero3) {
      maiorNumero = numero2;
    }
    else if (numero3 > numero1 && numero3 > numero2) {
      maiorNumero = numero3;
    }
    if (numero1 < numero2 && numero1 < numero3) {
      menorNumero = numero1;
    }
    else if (numero2 < numero1 && numero2 < numero3) {
      menorNumero = numero2;
    }
    else if (numero3 < numero1 && numero3 < numero2) {
      menorNumero = numero3;
    }
    else {
      System.out.println("Os números digitados são iguais");
    }
    System.out.println("O maior número é: " + maiorNumero);
    System.out.println("O menor número é: " + menorNumero);

    sc.close();

  }
}
