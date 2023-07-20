package questao02;

public class Somatorio {

  public static int calcularSomatorio(int numero) {
    if (numero == 1) {
      return 1;
    }
    return numero + calcularSomatorio(numero - 1);
  }
}
