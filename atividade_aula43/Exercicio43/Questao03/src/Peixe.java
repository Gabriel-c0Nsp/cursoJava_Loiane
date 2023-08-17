public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

   @Override
   public String toString() {
     return "Animal: " + getNome() + "\n" + "Comprimento: " + getComprimento() + " cm" + "\n" + "Patas: " + getNumeroPatas() + "\n" + "Cor: " + getCor() + "\n" + "Ambiente: " + getAmbiente() + "\n" + "Velocidade: " + getVelocidade() + " m/s" +  "\n" + "Características: " + getCaracteristicas(); 
   } 
}
