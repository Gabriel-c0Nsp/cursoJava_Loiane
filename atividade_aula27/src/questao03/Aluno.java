package questao03;

public class Aluno {

  String nome;
  String matricula;
  String curso;
  String[] nomeDisciplinas = new String[3];
  double[][] notasDisciplinas = new double[3][4];

  void mostrarInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Curso: " + curso);

    for (int i = 0; i < notasDisciplinas.length; i++) {
      System.out.println("Notas da disciplina " + notasDisciplinas[i]);
      for (int j = 0; j < notasDisciplinas[i].length; j++) {
        System.out.println(notasDisciplinas[i][j] + " ");
      }
      System.out.println();
    }
  }

  boolean verificarAprovadoOuReprovado(int indice) {
    double soma = 0;

    for (int i = 0; i < notasDisciplinas[indice].length; i++) {
      soma += notasDisciplinas[indice][i];
    }

    double media = soma / 4;

    if (media >= 7) {
      return true;
    }
    return false;
  }
}
