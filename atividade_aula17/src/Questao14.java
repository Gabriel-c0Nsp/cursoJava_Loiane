import java.util.Scanner;

public class Questao14 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa recebe 10 números inteiros e informa a quantidade de números pares e ímpares");

    System.out.println();

    int numero;
    int numerosPares = 0;
    int numerosImpares = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite o número aqui:");
      numero = scanner.nextInt();
        if (numero % 2 == 0) {
          numerosPares++;   
        }
        else {
          numerosImpares++;
        }
    }

    System.out.println("Você informou " + numerosPares + " número(s) par(es)");
    System.out.println("Você informou " + numerosImpares + " número(s) ímpar(es)");

    scanner.close();

  }
}
