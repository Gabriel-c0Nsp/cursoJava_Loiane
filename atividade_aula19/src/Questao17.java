import java.util.Scanner;

public class Questao17 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] idades = new int[10];

    int maiorQue35 = 0;

    for (int i = 0; i < idades.length; i++) {
      System.out.println("Insira idade aqui:");
      idades[i] = scanner.nextInt();
      if (idades[i] > 35) {
        maiorQue35++;
      }
    }

    System.out.println("O número de pessoas com idade maior que 35 anos é de: " + maiorQue35);

    scanner.close();

  }
}
