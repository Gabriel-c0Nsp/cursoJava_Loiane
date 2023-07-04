import java.util.Scanner;
import java.util.Locale;

public class Questao18 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Digite a quantidade de números que deseja analisar");
    int n = scanner.nextInt();

    System.out.println();

    int numeroDigitado = n;

    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int soma = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Digite um número");
      numeroDigitado = scanner.nextInt();
        if (maior < numeroDigitado) {
          maior = numeroDigitado;
        }
        if (menor > numeroDigitado) {
          menor = numeroDigitado;
        }
      soma += numeroDigitado;
    }

    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
    System.out.println("A soma de todos os valores informados é: " + soma);

    scanner.close();

  }
}
