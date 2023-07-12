import java.util.Random;

public class Questao02 {
  public static void main(String[] args) {

    Random random = new Random();

    int[][] M = new int[10][10];

    int maior = 0;
    int menor = 10;

    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M[i].length; j++) {
        M[i][j] = random.nextInt(10);
        System.out.print(M[i][j] + " ");
      }
    }
    System.out.println();

    for (int j = 0; j < M[5].length; j++) {
      if (M[5][j] > maior) {
        maior = M[5][j];
      }
      if (M[5][j] < menor) {
        menor = M[5][j];
      }
    }

    System.out.println("O maior valor da linha 5 é: " + maior);
    System.out.println("O menor valor da linha 5 é: " + menor);

    // reaproveitando a variável
    maior = 0;
    menor = 0;

    for (int i = 0; i < M.length; i++) {
      if (M[i][7] > maior) {
        maior = M[i][7];
      }
      if (M[i][7] < menor) {
        menor = M[i][7];
      }
    }

    System.out.println();
    System.out.println("O maior valor da coluna 7 é: " + maior);
    System.out.println("O menor valor da coluna 7 é: " + menor);
  }
}
