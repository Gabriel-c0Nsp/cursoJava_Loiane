public class Contato {
  
  private String nome;
  private long telefone;
  private int identificador = 0;


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public long getTelefone() {
    return telefone;
  }

  public void setTelefone(long telefone) {
    this.telefone = telefone;
  }

  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  @Override 
  public String toString() {
    return "Nome: " + nome + "\n" +
           "Telefone: " + telefone + "\n" + 
           "Nº do contato na agenda: " + identificador;
  }

}
