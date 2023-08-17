public class Mamifero extends Animal{

    private String alimento; 

    public String getAlimento() {
        return alimento;
    }

    public Mamifero(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

   @Override
   public String toString() {
     return "Animal: " + getNome() + "\n" + "Comprimento: " + getComprimento() + " cm" + "\n" + "Patas: " + getNumeroPatas() + "\n" + "Cor: " + getCor() + "\n" + "Ambiente: " + getAmbiente() + "\n" + "Velocidade: " + getVelocidade() + " m/s" + "\n" + "Alimento: " + getAlimento(); 
   } 
}
