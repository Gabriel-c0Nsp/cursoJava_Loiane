public class PessoaFisica {

  private String nomePessoa;
  private double rendaBruta;

  public PessoaFisica(String nomePessoa, double rendaBruta) {
    this.nomePessoa = nomePessoa;
    this.rendaBruta = rendaBruta;
  }

  public String getNomePessoa() {
    return nomePessoa;
  }

  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  public double getRendaBruta() {
    return rendaBruta;
  }

  public void setRendaBruta(double rendaBruta) {
    this.rendaBruta = rendaBruta;
  }

  public double calcularImposto() {
    if (this.rendaBruta <= 0 && this.rendaBruta <= 1400) {
      return this.rendaBruta;
    } else if (this.rendaBruta > 1400 && this.rendaBruta <= 2100) {
      return (0.10 * this.rendaBruta) - 100;
    } else if (this.rendaBruta > 2100 && this.rendaBruta <= 2800) {
      return (0.15 * rendaBruta) - 270;
    } else if (this.rendaBruta > 2800 && this.rendaBruta <= 3600) {
      return (0.25 * rendaBruta) - 500;
    }
    return 0.30 * rendaBruta - 700;
  }

}
