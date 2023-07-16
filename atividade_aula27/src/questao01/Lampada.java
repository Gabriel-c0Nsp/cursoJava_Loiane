package questao01;

public class Lampada {

  boolean ligado;

  void informarEstadoDaLampada(int estado) {
    if (estado == 0) {
      System.out.println("A lâmpada está desligada!");
    }
    else if (estado == 1) {
      System.out.println("A lâmpada está ligada!");
    }
    else {
      System.out.println("Resposta inválida");
    }
  }
}
