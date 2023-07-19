package questao04;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    JogoDaVelha jogoDaVelha = new JogoDaVelha();

    System.out.println("jogador 1: X");
    System.out.println("jogador 1: O");

    boolean ganhou = false;
    char simbolo;
    int linha = 0;
    int coluna = 0;

    while (!ganhou) {
      if (jogoDaVelha.vezJogador1()) {
        System.out.println("Rodada do jogador 1!");
        System.out.println("Escolha linha e coluna (1-3)");
        simbolo = 'X';
      } else {
        System.out.println("Rodada do jogador 2!");
        System.out.println("Escolha linha e coluna (1-3)");
        simbolo = 'O';
      }

      linha = valor("linha", scanner);
      coluna = valor("coluna", scanner);

      jogoDaVelha.validarJogada(linha, coluna, simbolo);

      jogoDaVelha.imprimirTabuleiro();

      if (jogoDaVelha.verificarGanhador('X')) {
        ganhou = true;
        System.out.println("Parabéns, jogador 1, você ganhou!!!");
      } else if (jogoDaVelha.verificarGanhador('O')) {
        ganhou = true;
        System.out.println("Parabéns, jogador 2, você ganhou!!!");
      } else if (jogoDaVelha.jogada > 9) {
        ganhou = true;
        System.out.println("Essa partida empatou!");
      }

    }

    scanner.close();

  }

  static int valor(String tipoValor, Scanner scanner) {
    int valor = 0;
    boolean valorValido = false;

    while (!valorValido) {
      System.out.println("Insira a " + tipoValor);
      valor = scanner.nextInt();
      if (valor >= 1 && valor <= 3) {
        valorValido = true;
      } else {
        System.out.println("Escolha inválida, tente novamente!");
      }
    }
    valor--;
    return valor;
  }
}
