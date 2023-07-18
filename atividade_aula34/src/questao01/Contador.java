package questao01;

public class Contador {

  public static int contador;

  public static void incrementar() {
    contador++;
    System.out.println(contador);
  }

  public static void zerar() {
    contador = 0;
    System.out.println(contador);
  }

  public static int retornarValor() {
    return contador;
  }
}
