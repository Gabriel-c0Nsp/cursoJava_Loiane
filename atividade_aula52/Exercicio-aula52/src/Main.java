import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    Contato[] contatos = new Contato[10];
    Agenda agenda = new Agenda();

    int escolha = 0;
    boolean escolhaValida = false;

    System.out.println("[AGENDA DE CONTATOS]");
    System.out.println();

    do {
      System.out.println("(1) Consultar contato da agenda        |        (2) Adicionar contato à agenda");
      escolha = scanner.nextInt();

      if (escolha == 2) {
        // TODO:
        escolhaValida = true; 

      } else if (escolha == 1 && contatos != null) {
          // TODO:
          escolhaValida = true;

        } else {

          System.out.println("Essa não é uma opção válida. Tente novamente!");
        }
    } while (escolhaValida);

    scanner.close();
  }
}
