import java.util.Scanner;

public class Questao15 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor de n");
    int n = scanner.nextInt();

    int primeiroNumero = 1;
    int segundoNumero = 1;
    int resultado = 0;

    System.out.println();

    System.out.printf(primeiroNumero + ", " + segundoNumero + ", ");
    for (int i = 3; i <= n; i++) {
      resultado = primeiroNumero + segundoNumero;
      primeiroNumero = segundoNumero;
      segundoNumero = resultado;
      System.out.printf(resultado + ", ");
    }

    scanner.close();

  }
}
