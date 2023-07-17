package questao01;

public class Lampada {

  private double preco;
  private int quantidade;
  private double desconto;
  private boolean ligado;

  public Lampada() {
  }

  public double getPreco() {
    return this.preco;
  }
  public int getQuantidade() {
    return this.quantidade;
  }
  public double getDesconto() {
    return this.desconto;
  }
  public boolean isLigado() {
    return this.ligado;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  public void setDesconto(double desconto) {
    this.desconto = desconto;
  }
  public void setPreco(boolean ligado) {
    this.ligado = ligado;
  }

  public void informarEstadoDaLampada(int estado) {
    if (estado == 0) {
      System.out.println("A lâmpada está desligada!");
    } else if (estado == 1) {
      System.out.println("A lâmpada está ligada!");
    } else {
      System.out.println("Resposta inválida");
    }
  }
}
