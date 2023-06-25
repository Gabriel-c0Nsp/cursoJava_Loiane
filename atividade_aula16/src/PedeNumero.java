import java.util.Scanner;

public class PedeNumero {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número e ele será mostrado ao final do programa");

    double numero = sc.nextDouble();

    System.out.println("O número informado foi: " + numero);

    sc.close();

  }
}
