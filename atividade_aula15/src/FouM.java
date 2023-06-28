import java.util.Scanner;

public class FouM {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a letra F ou a letra M");
    char letra = sc.next().charAt(0);

    if (letra == 'F') {
      System.out.println("F - Feminino");
    }
    else if (letra == 'M') {
      System.out.println("M - Masculino");
    }
    else {
      System.out.println("Sexo inválido");
    }

    sc.close();

  }
}
