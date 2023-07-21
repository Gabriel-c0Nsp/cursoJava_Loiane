package questao02;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o nome do curso");
    String nome = scanner.nextLine();

    System.out.println("Insira o horario do curso");
    String horario = scanner.nextLine();

    System.out.println("Insira o nome do professor");
    String nomeProfessor = scanner.nextLine();

    System.out.println("Insira o email do professor");
    String emailProfessor = scanner.nextLine();

    System.out.println("Insira o departamento do professor");
    String departamentoProfessor = scanner.nextLine();

    Curso curso = new Curso();

    curso.setNome(nome);
    curso.setHorario(horario);

    Professor professor = new Professor();

    professor.setNome(nome);
    professor.setEmail(emailProfessor);
    professor.setDepartamento(departamentoProfessor);

    curso.setProfessor(professor);

    System.out.println("--- ALUNOS ---");

    Aluno[] alunos = new Aluno[5];

    for (int i = 0; i < 5; i++) {
      scanner.nextLine();

      System.out.println("Insira o nome do aluno " + (i + 1) + ": ");
      String nomeAluno = scanner.nextLine();
      System.out.print("Insira o número da matrícula do aluno: ");
      String matriculaAluno = scanner.nextLine();

      double[] notas = new double[4];

      for (int j = 0; j < 4; j++) {
        System.out.println("Informe a " + (j + 1) + "º nota");
        notas[j] = scanner.nextDouble();
      }

      Aluno aluno = new Aluno();

      aluno.setNome(nome);
      aluno.setMatricula(matriculaAluno);
      aluno.setNotas(notas);
      alunos[i] = aluno;
    }

    curso.setAlunos(alunos);

    System.out.println(curso.mostrarInformacoes());

    scanner.close();

  }
}
