import java.util.Random;

public class Questao01 {
  public static void main(String[] args) {

    Random random = new Random();

    int[][] M = new int[4][4];

    int maior = 0;
    int linha = 0;
    int coluna = 0;

    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M[i].length; j++) {
        M[i][j] = random.nextInt(10);
        if (M[i][j] > maior) {
          maior = M[i][j];
          linha = i;
          coluna = j;
        }
      }
    }

    System.out.println("O maior valor é: " + maior);
    System.out.println("Se encontra na linha: " + linha);
    System.out.println("E na coluna: " + coluna);
  }
}
