import java.util.Scanner;
import java.util.Locale;

public class Questao28 {
  public static void main(String [] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a quantidade de CD's da sua coleção");
    int quantidadeDeCDs = scanner.nextInt();

    double precoCD;
    double somaPrecoCDS = 0;
    double valorMedio = 0;

    for (int i = 1; i <= quantidadeDeCDs; i++) {
      System.out.println("Insira o preço do " + i + "º CD");
      precoCD = scanner.nextDouble();
      somaPrecoCDS += precoCD;
    }

    valorMedio = somaPrecoCDS / quantidadeDeCDs;

    System.out.printf("O valor total investido na sua coleção foi de: R$ %.2f%n", somaPrecoCDS);
    System.out.printf("O valor médio gasto por CD é de: R$ %.2f%n", valorMedio);

    scanner.close();

  }
}
