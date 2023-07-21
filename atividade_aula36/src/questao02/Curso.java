package questao02;

public class Curso {

  private String nome;
  private String horario;
  private Professor professor;
  private Aluno[] alunos;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public Aluno[] getAlunos() {
    return alunos;
  }

  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }

  public String mostrarInformacoes() {
    String informacoes = "Nome do curso: " + nome + "\n";
    if (professor != null) {
      informacoes += professor.mostrarInformacoes();
    }
    if (alunos != null) {
      System.out.println("--- ALUNOS ---");
      for (Aluno aluno : alunos) {
        if (aluno != null) {
          informacoes += aluno.mostrarInformacoes();
          informacoes += "\n";
        }
      }
      informacoes += "\nMédia da turma: " + calcularMedia();
    }
    return informacoes;
  }

  public double calcularMedia() {
    double soma = 0;
    for (Aluno aluno : alunos) {
      if (aluno != null) {
        soma += aluno.calcularMedia();
      }
    }
    return soma / alunos.length;
  }

}
