public class Questao16 {
  public static void main(String[] args) {

    int primeiroNumero = 1;
    int segundoNumero = 1;
    int resultado = 0;

    System.out.println();

    System.out.printf(primeiroNumero + ", " + segundoNumero + ", ");

    while (resultado < 500) {
      resultado = primeiroNumero + segundoNumero;
      primeiroNumero = segundoNumero;
      segundoNumero = resultado;
      System.out.printf(resultado + ", ");
    }
  }
}
