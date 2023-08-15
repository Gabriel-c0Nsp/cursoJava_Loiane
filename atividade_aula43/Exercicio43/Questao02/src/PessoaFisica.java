public class PessoaFisica {
    
    private double nomePessoa;
    private double rendaBruta;

    public PessoaFisica(double nomePessoa, double rendaBruta) {
        this.nomePessoa = nomePessoa;
        this.rendaBruta = rendaBruta;
    }
    public double getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(double nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public double getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    
    //TODO lógica para calcular imposto da pessoa fisica

}