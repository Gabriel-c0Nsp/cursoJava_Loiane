import java.util.Scanner;

public class Turno {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o turno em que você estuda (ou a inicial do respectivo turno)");
    String turno = sc.nextLine();
    System.out.println();

    if (turno.equalsIgnoreCase("m") || turno.equalsIgnoreCase("matutino")) {
      System.out.println("Bom dia!");
    }
    else if (turno.equalsIgnoreCase("v") || turno.equalsIgnoreCase("vespertino")) {
      System.out.println("Boa tarde!");
    }
    else if (turno.equalsIgnoreCase("n") || turno.equalsIgnoreCase("noturno")) {
      System.out.println("Boa noite!");
    }
    else {
      System.out.println("Valor inválido!");
    }

    sc.close();

  }
}
