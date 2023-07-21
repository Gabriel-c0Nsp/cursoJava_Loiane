package questao01;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o nome da agenda");
    String nome = scanner.nextLine();

    Agenda agenda = new Agenda(nome);

    Contato[] contatos = new Contato[3];

    for (int i = 0; i < 3; i++) {
      Contato contato = new Contato();

      System.out.println("Insira o nome do " + (i + 1) + "º contato");
      nome = scanner.nextLine();
      contato.setNome(nome);

      System.out.println("Insira o número do " + (i + 1) + "º contato");
      String telefone = scanner.nextLine();
      contato.setTelefone(telefone);

      System.out.println("Insira o email do " + (i + 1) + "º contato");
      String email = scanner.nextLine();
      contato.setEmail(email);

      contatos[i] = contato;
      System.out.println();
    }

    agenda.setContatos(contatos);

    if (agenda != null) {
      System.out.println(agenda.mostrarInformacoes());
    }

    scanner.close();

  }
}
