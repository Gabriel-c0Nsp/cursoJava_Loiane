package questao01;

public class Agenda {

  private Contato[] contatos;
  private String nome;

  public Agenda(String nome) {
    this.nome = nome;
  }

  public Contato[] getContatos() {
    return contatos;
  }

  public void setContatos(Contato[] contatos) {
    this.contatos = contatos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String mostrarInformacoes() {
    String informacoes = "Nome: " + nome + "\n";
    if (contatos != null) {
      for (Contato c : contatos) {
        informacoes += c.mostrarInformacoes() + "\n";
      }
    }
    return informacoes;
  }
}
