import java.util.Scanner;

public class Questao12 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int numero;
    int resultado = 0;

    boolean invalido = false;

    do {
      System.out.println("Digite um número entre 1 e 10 e ao final do programa você terá a tabuada do mesmo");
      numero = scanner.nextInt();
      if (numero > 0 && numero <= 10) {
        invalido = false;
        for (int i = 1; i <= 10; i++) {
          resultado = numero * i;
          System.out.println(numero + " * " + i + " = " + resultado);
        }
      }
      else {
        System.out.println("Apenas aceitos números entre 1 e 10");
        invalido = true;
      }
    } while (invalido == true);

  }
}
