import java.util.Scanner;

public class AnoBissexto {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o ano que você deseja saber se corresponde a um ano bissexto ou não");
    int ano = sc.nextInt();

    if (ano % 4 == 0) {
      System.out.println("Este é um ano bissexto");
    }
    else {
      System.out.println("Este não é um ano bissexto");
    }

    sc.close();

  }
}
