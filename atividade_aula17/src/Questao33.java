import java.util.Scanner;
import java.util.Locale;

public class Questao33 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira a quantidade de temperaturas que deseja analisar");
    int numeroDeTemperaturas = scanner.nextInt();

    double temperatura;
    double maior = Integer.MIN_VALUE;
    double menor = Integer.MAX_VALUE;

    double soma = 0;
    double media = 0;

    for (int i = 0; i < numeroDeTemperaturas; i++) {
      System.out.println("Digite a temperatura");
      temperatura = scanner.nextDouble();
      soma += temperatura;

      if (maior < temperatura) {
        maior = temperatura;
      }
      if (menor > temperatura) {
        menor = temperatura;
      }
    }

    media = soma / numeroDeTemperaturas;

    System.out.printf("A menor temperatura é: %.1f%n", menor);
    System.out.printf("A maior temperatura é: %.1f%n", maior);
    System.out.printf("A temperatura média é: %.1f%n", media);

    scanner.close();

  }
}
