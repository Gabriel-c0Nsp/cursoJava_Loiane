import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    Agenda agenda = new Agenda();
    Contato contato = null;

    int escolha = 0;
    boolean escolhaValida = false;
    int identificador;

    System.out.println("[AGENDA DE CONTATOS]");
    System.out.println();

    do {
      System.out.println("(1) Consultar contato da agenda        |        (2) Adicionar contato à agenda");
      escolha = scanner.nextInt();

      if (escolha == 2) {
        System.out.print("Insira o nome do contato: ");
        String nome = scanner.next();
        System.out.print("Insira o telefone do contato: ");
        long telefone = scanner.nextLong();

        contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);

        agenda.adicionarContato(contato);
        contato.setNome(nome);
        contato.setTelefone(telefone);


      } else if (escolha == 1) {
        System.out.println("Insira o identificador do contato");
        identificador = scanner.nextInt();
        System.out.println(agenda.consultarContato(identificador));

        } else {
          System.out.println("Essa não é uma opção válida. Tente novamente!");
        }
    } while (!escolhaValida);

    System.out.println(escolhaValida);

    scanner.close();
  }
}
