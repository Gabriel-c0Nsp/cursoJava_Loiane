package questao02;

public class Calculadora {

  static double resposta;

  public static double somar(double numero1, double numero2) {
    resposta = numero1 + numero2;
    return resposta;
  }

  public static double subtrair(double numero1, double numero2) {
    resposta = numero1 - numero2;
    return resposta;
  }

  public static double multiplicar(double numero1, double numero2) {
    resposta = numero1 * numero2;
    return resposta;
  }

  public static double dividir(double numero1, double numero2) {
    resposta = numero1 / numero2;
    return resposta;
  }

  public static double elevarAPotencia(double numero, int expoente) {
    resposta = Math.pow(numero, expoente);
    return resposta;
  }
}
