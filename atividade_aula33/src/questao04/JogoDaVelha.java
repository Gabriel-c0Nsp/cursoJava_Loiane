package questao04;

public class JogoDaVelha {

  char[][] tabuleiro;
  int jogada;

  JogoDaVelha() {
    tabuleiro = new char[3][3];
    jogada = 1;
  }

  public char[][] getTabuleiro() {
    return tabuleiro;
  }

  public void setTabuleiro(char[][] tabuleiro) {
    this.tabuleiro = tabuleiro;
  }

  public int getJogada() {
    return jogada;
  }

  public void setJogada(int jogada) {
    this.jogada = jogada;
  }

  public boolean validarJogada(int linha, int coluna, char simbolo) {
    if (tabuleiro[linha][coluna] == simbolo || tabuleiro[linha][coluna] == 'O') {
      System.out.println("Essa posição já foi preenchida, tente novamente!");
      return false;
    } else {
      tabuleiro[linha][coluna] = simbolo;
      jogada++;
      return true;
    }
  }

  public void imprimirTabuleiro() {
    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro[i].length; j++) {
        System.out.print(tabuleiro[i][j] + " | ");
      }
      System.out.println();
    }
  }

  public boolean verificarGanhador(char simbolo) {
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

  public boolean vezJogador1() {
    if (jogada % 2 == 1) {
      return true;
    }
    return false;
  }

}
