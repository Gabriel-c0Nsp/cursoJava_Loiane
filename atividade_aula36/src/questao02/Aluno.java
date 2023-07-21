package questao02;

public class Aluno {

  private String nome;
  private String matricula;
  private double notas[];

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public String mostrarInformacoes() {
    String informacoes = "Nome do aluno: " + nome + "\n";
    informacoes += "Matricula" + matricula + "\n";
    informacoes += "Notas: ";

    double soma = 0;

    for (double nota : notas) {
      soma += nota;
      informacoes += nota + " ";
    }

    double media = soma / 4;
    informacoes += "\n" + "Média: " + media + "-";

    if (media >= 7) {
      informacoes += " APROVADO";
    } else {
      informacoes += " REPROVADO";
    }

    return informacoes;
  }

  public double calcularMedia() {
    double soma = 0;

    for (double nota : notas) {
      soma += nota;
    }
    return soma / 4;

  }
}
