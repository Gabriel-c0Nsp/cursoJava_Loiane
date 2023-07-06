import java.util.Scanner;

public class Questao27 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de turmas");
    int numeroDeTurmas = scanner.nextInt();

    boolean recalcular = true;
    int numeroDeAlunosParaCadaTurma;
    int somaDosAlunos = 0;
    int mediaDeAlunosPorTurma = 0;

    do {
      for (int i = 1; i <= numeroDeTurmas; i++) {
        System.out.println("Digite o número de alunos da turma " + i);
        numeroDeAlunosParaCadaTurma = scanner.nextInt();
        somaDosAlunos += numeroDeAlunosParaCadaTurma;
      }

      mediaDeAlunosPorTurma = somaDosAlunos / numeroDeTurmas;
      
      if (mediaDeAlunosPorTurma > 40) {
        System.out.println("As turmas não podem ter mais que 40 alunos!");
        System.out.println();
        System.out.println("Deseja reajustar os valores a fim de que as turmas consigam suportar o número suficiente de alunos? Digite \"sim\" para repetir o programa.");
        String resposta = scanner.next();

          if (resposta.equalsIgnoreCase("sim")) {
            recalcular = true;
          }
          else {
          recalcular = false;
          }
      }
      else if (mediaDeAlunosPorTurma <= 40) {
        System.out.println("A média de alunos para cada turma é de: " + mediaDeAlunosPorTurma + " alunos");
        recalcular =  false;
      }
    } while (recalcular == true);

    scanner.close();

  }
}
