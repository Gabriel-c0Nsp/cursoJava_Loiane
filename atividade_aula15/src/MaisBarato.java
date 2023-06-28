import java.util.Scanner;
import java.util.Locale;

public class MaisBarato {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa escolhe a melhor opção de produto para você");
    System.out.println();
    System.out.println("Digite o nome e o preço do primeiro produto");
    String produtoNome1 = sc.nextLine();
    double produtoPreco1 = sc.nextDouble();
    sc.nextLine();

    System.out.println("Digite o nome e o preço do segundo produto");
    String produtoNome2 = sc.nextLine();
    double produtoPreco2 = sc.nextDouble();
    sc.nextLine();

    System.out.println("Digite o nome e o preço do terceiro produto");
    String produtoNome3 = sc.nextLine();
    double produtoPreco3 = sc.nextDouble();
    sc.nextLine();

    if (produtoPreco1 < produtoPreco2 && produtoPreco1 < produtoPreco3 && produtoPreco1 >= 0) {
      System.out.println("O melhor produto a se comprar é o " + produtoNome1);
    }
    else if (produtoPreco2 < produtoPreco1 && produtoPreco2 < produtoPreco3 && produtoPreco2 >= 0) {
      System.out.println("O melhor produto a se comprar é o " + produtoNome2);
    }
    else if (produtoPreco3 < produtoPreco1 && produtoPreco3 < produtoPreco2 && produtoPreco3 >= 0) {
      System.out.println("O melhor produto a se comprar é o " + produtoNome3);
    }
    else {
      System.out.println("Estes não são valores válidos");
    }

    sc.close();

  }
}
