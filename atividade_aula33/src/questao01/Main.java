
package questao01;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Lampada lampada = new Lampada();

    int resposta;

    System.out.println("você deseja ligar ou desligar a lâmpada?");
    System.out.println("(0) desligar     |     (1) ligar");
    resposta = scanner.nextInt();

    lampada.informarEstadoDaLampada(resposta);

    scanner.close();

  }
}
