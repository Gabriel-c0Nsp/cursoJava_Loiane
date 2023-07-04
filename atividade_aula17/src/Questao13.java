import java.util.Scanner;

public class Questao13 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor da base");
    int base = scanner.nextInt();

    System.out.println("Digite o valor do expoente");
    int expoente = scanner.nextInt();

    int baseInicial = base;
    int resultado = base;

    System.out.println();

    for (int i = 1; i != expoente; i++) {
      resultado *= baseInicial; 
    }

    System.out.println("O número " + base + " elevado ao expoente " + expoente + " é igual a: " + resultado);

    scanner.close();
  }
}
