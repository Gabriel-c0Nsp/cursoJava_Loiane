package questao01;

public class Fibonacci {

  public static int calcularSequenciaFibonacci(int numero) {
    if (numero < 2) {
      return 1;
    }
    return calcularSequenciaFibonacci(numero - 1) + (numero - 2);
  }
}
