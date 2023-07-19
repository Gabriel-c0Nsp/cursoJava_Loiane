package questao04;

public class JogoDaVelha {

  char[][] tabuleiro = new char[3][3];
  int jogada = 1;

  boolean validarJogada(int linha, int coluna, char simbolo) {
    if (tabuleiro[linha][coluna] == simbolo || tabuleiro[linha][coluna] == 'O') {
      System.out.println("Essa posição já foi preenchida, tente novamente!");
      return false;
    } else {
      tabuleiro[linha][coluna] = simbolo;
      jogada++;
      return true;
    }
  }

  void imprimirTabuleiro() {
    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro[i].length; j++) {
        System.out.print(tabuleiro[i][j] + " | ");
      }
      System.out.println();
    }
  }

  boolean verificarGanhador(char simbolo) {
    if ((tabuleiro[0][0] == simbolo && tabuleiro[0][1] == simbolo && tabuleiro[0][2] == simbolo)
        || (tabuleiro[1][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[1][2] == simbolo)
        || (tabuleiro[2][0] == simbolo && tabuleiro[2][1] == simbolo && tabuleiro[2][2] == simbolo)
        || (tabuleiro[0][0] == simbolo && tabuleiro[1][0] == simbolo && tabuleiro[2][0] == simbolo)
        || (tabuleiro[0][1] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][1] == simbolo)
        || (tabuleiro[0][2] == simbolo && tabuleiro[1][2] == simbolo && tabuleiro[2][2] == simbolo)
        || (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo)
        || (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo)) {
      return true;
    }
    return false;
  }

  boolean vezJogador1() {
    if (jogada % 2 == 1) {
      return true;
    }
    return false;
  }

}
