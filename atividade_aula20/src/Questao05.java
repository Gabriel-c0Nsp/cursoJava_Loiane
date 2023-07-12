import java.util.Scanner;

public class Questao05 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[][][] agendaPessoal = new String[13][32][25];

    boolean sair = false;
    int escolha = 0;
    boolean mesValido = false;
    boolean diaValido = false;
    boolean horaValida = false;

    int escolhaDoMes = 0;
    int escolhaDoDia = 0;
    int escolhaDaHora = 0;

    while (sair == false) {
      System.out.println("(1) Adicionar compromisso");
      System.out.println("(2) Consultar compromisso agendado");
      System.out.println("(0) Sair");

      escolha = scanner.nextInt();

      if (escolha == 1) {
        while (mesValido == false) {
          System.out.println("Insira o mês que deseja adicionar o compromisso");
          escolhaDoMes = scanner.nextInt();
          if (escolhaDoMes > 0 && escolhaDoMes <= 12) {
            mesValido = true;
          } else {
            System.out.println("Mês inválido, digite novamente");
          }
        }
        while (diaValido == false) {
          System.out.println("Insira o dia do mês que deseja adicionar o compromisso");
          escolhaDoDia = scanner.nextInt();
          if (escolhaDoDia > 0 && escolhaDoDia <= 31) {
            diaValido = true;
          } else {
            System.out.println("Dia inválido, digite novamente");
          }
        }
        while (horaValida == false) {
          System.out.println("Insira o horário que deseja adicionar o compromisso");
          escolhaDaHora = scanner.nextInt();
          if (escolhaDaHora >= 0 && escolhaDaHora <= 24) {
            horaValida = true;
          } else {
            System.out.println("Hora inválida, digite novamente");
          }
        }

        escolhaDoDia--; // trata a variável para que o dia não fique errado por conta do índice 0

        System.out.print("Insira o compromisso aqui: ");
        agendaPessoal[escolhaDoMes][escolhaDoDia][escolhaDaHora] = scanner.next();
        System.out.println();

        diaValido = false;
        horaValida = false;
        mesValido = false;

      } else if (escolha == 2) {
        while (mesValido == false) {
          System.out.println("Insira o mês que deseja adicionar o compromisso");
          escolhaDoMes = scanner.nextInt();
          if (escolhaDoMes > 0 && escolhaDoMes <= 12) {
            mesValido = true;
          } else {
            System.out.println("Mês inválido, digite novamente");
          }
        }

        while (diaValido == false) {
          System.out.println("Insira o dia do mês que deseja consultar o compromisso");
          escolhaDoDia = scanner.nextInt();
          if (escolhaDoDia > 0 && escolhaDoDia <= 31) {
            diaValido = true;
          } else {
            System.out.println("Dia inválido, digite novamente");
          }
        }
        while (horaValida == false) {
          System.out.println("Insira o horário do compromisso agendado");
          escolhaDaHora = scanner.nextInt();
          if (escolhaDaHora >= 0 && escolhaDaHora <= 24) {
            horaValida = true;
          } else {
            System.out.println("Hora inválida, digite novamente");
          }
        }

        escolhaDoDia--; // trata a variável para que o dia não fique errado por conta do índice 0

        System.out.print("O compromisso agendado para este dia é: ");
        System.out.println(agendaPessoal[escolhaDoMes][escolhaDoDia][escolhaDaHora]);

      } else if (escolha == 0) {
        sair = true;
      } else {
        System.out.println("Opção inválida, digite novamente!");
      }
    }

    scanner.close();

  }
}
