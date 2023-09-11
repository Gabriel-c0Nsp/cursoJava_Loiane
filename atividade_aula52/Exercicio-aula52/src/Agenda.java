public class Agenda {

  private Contato contato;
  private Contato[] contatos;

  public Agenda() {
    this.contatos = new Contato[3];
  }

  public Contato[] getContatos() {
    return contatos;
  }

  public void setContatos(Contato[] contatos) {
    this.contatos = contatos;
  }

  public Contato getContato() {
    return contato;
  }

  public void setContato(Contato contato) {
    this.contato = contato;
  }

  public void adicionarContato(Contato contato) {
    for (int i = 0; i < contatos.length; i++) {
      if (contatos[i] == null) {
        contatos[i] = contato;
        return;
      }
    }
    System.out.println("A agenda está cheia. Você atingiu o número máximo de contatos!");
  }

  public void consultarContato() {
      // TODO:
    }
  
}