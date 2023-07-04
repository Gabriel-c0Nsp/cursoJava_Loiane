import java.util.Scanner;

public class Questao10 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número");
    int numero1 = scanner.nextInt();

    System.out.println("Digite o segundo número");
    int numero2 = scanner.nextInt();

    int distancia = 0;
    int contandoAteADistancia = 0;
    int numeroDeDestino = 0;

    if (numero1 > numero2) {
      distancia = numero1 - numero2;
      contandoAteADistancia = numero2;
      numeroDeDestino = numero1;
    }
    else if (numero2 > numero1) {
      distancia = numero2 - numero1;
      contandoAteADistancia = numero1;
      numeroDeDestino = numero2;
    }

    contandoAteADistancia++;
    numeroDeDestino--;

    System.out.println();

    System.out.println("Os números presentes no intervalo entre o número " + numero1 + " e o número " + numero2 + " são:");


    for (int i = contandoAteADistancia; i <= numeroDeDestino; i++) {
      System.out.println(i);
    }

    scanner.close();

  }
}
