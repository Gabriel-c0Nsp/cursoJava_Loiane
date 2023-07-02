import java.util.Scanner;

public class Investigacao {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Telefonou para a vítima (responda \"sim\" ou \"não\")?");
    String acusacaoTelefone = scanner.next();

    System.out.println("Esteve no local do crime (responda \"sim\" ou \"não\")?");
    String acusacaoLocal = scanner.next();

    System.out.println("Mora perto da vítima (responda \"sim\" ou \"não\")?");
    String acusacaoMoradia = scanner.next();

    System.out.println("Devia para a vítima (responda \"sim\" ou \"não\")?");
    String acusacaoDivida = scanner.next();

    System.out.println("Já trabalhou com a vítima (responda \"sim\" ou \"não\")?");
    String acusacaoTrabalho = scanner.next();

    int contador = 0; 

    if (acusacaoTelefone.equalsIgnoreCase("sim")) {
      contador++;
    }
    if (acusacaoTrabalho.equalsIgnoreCase("sim")) {
      contador++;
    }
    if (acusacaoLocal.equalsIgnoreCase("sim")) {
      contador++;
    }
    if (acusacaoDivida.equalsIgnoreCase("sim")) {
      contador++;
    }
    if (acusacaoMoradia.equalsIgnoreCase("sim")) {
      contador++;
    }

    if (contador == 2) {
      System.out.println("Classificação: Suspeita");
    }
    else if (contador > 2 && contador <=4) {
      System.out.println("Classificação: Cúmplice");
    }
    else if (contador == 5) {
      System.out.println("Classificação: Assassino");
    }
    else {
      System.out.println("Classificação: Inocente");
    }

    scanner.close();

  }
}
