import java.util.Scanner;

public class Questao06 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char[][] tabuleiro = new char[3][3];

    System.out.println("Jogador 1: X");
    System.out.println("Jogador 2: O");

    boolean ganhou = false;
    boolean linhaValida = false;
    boolean colunaValida = false;
    char simbolo;

    int escolhaLinha = 0;
    int escolhaColuna = 0;

    int jogada = 1;

    while (ganhou == false) {
      if (jogada % 2 == 1) {
        System.out.println("Vez do jogador 1!");
        System.out.println("Escolha linha e coluna (1-3)");
        simbolo = 'X';
      } else {
        System.out.println("Vez do jogador 2!");
        System.out.println("Escolha linha e coluna (1-3)");
        simbolo = 'O';
      }

      while (linhaValida == false) {
        System.out.println("Escolha a linha que deseja jogar (1, 2 ou 3)");
        escolhaLinha = scanner.nextInt();
        if (escolhaLinha < 0 && escolhaLinha <= 3) {
          linhaValida = true;
        } else {
          System.out.println("Linha inválida, digite novamente!");
        }
        while (colunaValida == false) {
          System.out.println("Escolha a coluna que deseja jogar (1, 2 ou 3)");
          escolhaLinha = scanner.nextInt();

          if (escolhaColuna < 0 && escolhaColuna <= 3) {
            colunaValida = true;
          } else {
            System.out.println("Coluna inválida, digite novamente!");
          }
        }
        escolhaLinha--;
        escolhaColuna--; // Trata as variáveis para que o índice 0 não interfira na lógica do jogo
        if (tabuleiro[escolhaLinha][escolhaColuna] == 'X' || tabuleiro[escolhaColuna][escolhaColuna] == 'O') {
          System.out.println("Posição já usada, tente novamente!");
        } else {
          tabuleiro[escolhaLinha][escolhaColuna] = simbolo;
          jogada++;
        }

        for (int i = 0; i < tabuleiro.length; i++) {
          for (int j = 0; j < tabuleiro[i].length; j++) {
            System.out.println(tabuleiro[i][j] + " | ");
          }
          System.out.println();
        }

        if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')
            || (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')
            || (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || tabuleiro[0][0] == 'X'
            || tabuleiro[1][1] == 'X' || tabuleiro[2][2] == 'X') {
          ganhou = true;
          System.out.println("Parabéns, o jogador 1 ganhou!!!");
        } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O')
            || (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')
            || (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || tabuleiro[0][0] == 'O'
            || tabuleiro[1][1] == 'O' || tabuleiro[2][2] == 'O') {
          ganhou = true;
          System.out.println("Parabéns, o jogador 2 ganhou!!!");
        } else if (jogada > 9) {
          System.out.println("A partida empatou!");
          ganhou = true;
        }

      }
    }

    scanner.close();

  }
}
