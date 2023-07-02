import java.util.Scanner;

public class ParOuImpar {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número inteiro e ao final do programa você saberá se ele é um número par ou um número ímpar");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("Este é um número par");
    }
    else {
      System.out.println("Este é um número ímpar");
    }

    sc.close();

  }
}
