import java.util.Scanner;

public class Questao06 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char[][] tabuleiro = new char[3][3];

    System.out.println("jogador 1: X");
    System.out.println("jogador 1: O");

    System.out.println();

    boolean ganhou = false;
    int jogada = 1;
    char simbolo;
    int linha = 0;
    int coluna = 0;

    while (!ganhou) {
      if (jogada % 2 == 1) {
        System.out.println("Rodada do jogador 1!");
        System.out.println("Escolha linha e coluna (1-3)");
        simbolo = 'X';
      } else {
        System.out.println("Rodada do jogador 2!");
        System.out.println("Escolha linha e coluna (1-3)");
        simbolo = 'O';
      }

      boolean linhaValida = false;

      while (!linhaValida) {
        System.out.println("Insira a linha");
        linha = scanner.nextInt();
        if (linha >= 1 && linha <= 3) {
          linhaValida = true;
        } else {
          System.out.println("Escolha inválida, tente novamente!");
        }
      }

      boolean colunaValida = false;

      while (!colunaValida) {
        System.out.println("Insira a coluna");
        coluna = scanner.nextInt();
        if (coluna >= 1 && coluna <= 3) {
          colunaValida = true;
        } else {
          System.out.println("Escolha inválida, tente novamente!");
        }
      }

      linha--; // trata a variável para que o output fique mais agradável para o usuário
      coluna--;

      if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
        System.out.println("Essa posição já foi preenchida, tente novamente!");
      } else {
        tabuleiro[linha][coluna] = simbolo;
        jogada++;
      }

      for (int i = 0; i < tabuleiro.length; i++) {
        for (int j = 0; j < tabuleiro[i].length; j++) {
          System.out.print(tabuleiro[i][j] + " | ");
        }
        System.out.println();
      }

      if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')
          || (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')
          || (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')
          || (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X')
          || (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X')
          || (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')
          || (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')) {
        ganhou = true;
        System.out.println("Parabéns, jogador 1, você ganhou!!!");
      } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O')
          || (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')
          || (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')
          || (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O')
          || (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O')
          || (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')
          || (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')) {
        ganhou = true;
        System.out.println("Parabéns, jogador 2, você ganhou!!!");
      } else if (jogada > 9) {
        ganhou = true;
        System.out.println("Essa partida empatou!");
      }
    }

    scanner.close();

  }
}
