import java.util.Scanner;

public class Questao18 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] idades = new int[10];

    int maior = idades[0];
    int posicaoMenor = 0;
    int menor = idades[0];
    int posicaoMaior = 0;

    for (int i = 0; i < idades.length; i++) {
      System.out.println("Insira idade aqui:");
      idades[i] = scanner.nextInt();
      if (idades[i] > maior) {
        maior = idades[i];
        posicaoMaior = (i + 1);
      }
      else if (idades[i] < menor) {
        menor = idades[i];
        posicaoMenor = (i + 1);
      }
    }

    System.out.println("A maior idade digitada foi: " + maior);
    System.out.println("E a maior idade se encontra na posição " + posicaoMaior);

    System.out.println("A menor idade digitada foi: " + menor);
    System.out.println("E a menor idade se encontra na posição " + posicaoMenor);

    scanner.close();

  }
}
