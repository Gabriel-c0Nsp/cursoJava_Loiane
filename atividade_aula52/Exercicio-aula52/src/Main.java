import java.util.Scanner;
import java.util.InputMismatchException;

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
    System.out.println("OBS: A sua agenda tem espaço para 10 contatos");
    System.out.println();

    try {
      do {
        System.out.println("(1) Consultar contato da agenda        |        (2) Adicionar contato à agenda");
        escolha = scanner.nextInt();

        if (escolha == 2) {
          System.out.print("Insira o nome do contato: ");
          scanner.nextLine();
          String nome = scanner.nextLine();
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
    }
    catch(InputMismatchException e) {
      System.out.println("Esta opção aceita apenas números");
      escolhaValida = false;
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Não foi possível acessar uma certa posição do array");
      escolhaValida = false;
    }

    scanner.close();

  }
}
