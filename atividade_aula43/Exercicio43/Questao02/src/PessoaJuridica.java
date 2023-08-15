public class PessoaJuridica {

    private String nomePessoa;
    private double rendaBruta;

    public PessoaJuridica(String nomePessoa, double rendaBruta) {
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
    return 0.10 * this.rendaBruta;
   } 

}