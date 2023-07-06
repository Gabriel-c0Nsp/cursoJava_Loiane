public class Questao29 {
  public static void main(String[] args) {

    int numeroMaximoProdutos = 50;
    double precoCadaProduto = 1.99;

    for (int i = 1; i <= numeroMaximoProdutos; i++) {
      System.out.printf(i + " - R$ %.2f%n", precoCadaProduto * i);
    }
  }
}
