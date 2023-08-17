public class App {
    public static void main(String[] args) throws Exception {

        Mamifero camelo = new Mamifero("Camelo", 1.50, 4, "Amarelo", "Terra", 2.0, "Plantas");
        Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
        Mamifero urso = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");

        System.out.println("Zoo:");
        System.out.println("------------------------");
        System.out.println(camelo);
        System.out.println("------------------------");
        System.out.println(tubarao);
        System.out.println("------------------------");
        System.out.println(urso);
        System.out.println("------------------------");
    }
}