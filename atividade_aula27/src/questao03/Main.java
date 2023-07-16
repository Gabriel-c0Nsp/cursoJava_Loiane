package questao03;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Aluno aluno = new Aluno();

    System.out.println("Insira o nome do aluno");
    aluno.nome = scanner.next();

    System.out.println("Insira o nome do curso");
    aluno.curso = scanner.next();

    System.out.println("Insira a matrúcula");
    aluno.matricula = scanner.next();

    for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
      System.out.println("Insira o nome da disciplina " + (i + 1));
      aluno.nomeDisciplinas[i] = scanner.next();
    }

    for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
      System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
      for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
        System.out.println("Insira a nota " + (j + 1));
        aluno.notasDisciplinas[i][j] = scanner.nextDouble();
      }
    }

    aluno.mostrarInformacoes();

    for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
      if (aluno.verificarAprovadoOuReprovado(i)) {
        System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + "- foi aprovado");
      } else {
        System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + "- foi reprovado");
      }
    }

    scanner.close();
  }
}
