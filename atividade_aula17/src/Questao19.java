import java.util.Scanner;
import java.util.Locale;

public class Questao19 {
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
    boolean valido;

      for (int i = 0; i < n; i++) {
        valido = true;
        do {
          System.out.println("Digite um número");
          numeroDigitado = scanner.nextInt();
          if (numeroDigitado >= 0 && numeroDigitado <= 1000){
            valido = false;
            if (maior < numeroDigitado) {
              maior = numeroDigitado;
            }
            if (menor > numeroDigitado) {
              menor = numeroDigitado;
            }
            soma += numeroDigitado;
          } else {
            System.out.println("Número ínválido: Digite apenas números entre 0 e 1000");   
          }
        } while (valido == true);
    }
    
    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
    System.out.println("A soma de todos os valores informados é: " + soma);

    scanner.close();

  }
}
