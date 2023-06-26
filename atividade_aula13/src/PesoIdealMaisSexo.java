import java.util.Scanner;

public class PesoIdealMaisSexo {
  public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a sua altura");
    double altura = sc.nextDouble();

    System.out.println("Digite o seu sexo");
    String sexo = sc.next();

    double pesoIdealParaHomens = (72.7 * altura) - 58;
    double pesoIdealParaMulheres= (62.1 * altura) - 44.7;

    if (sexo.equalsIgnoreCase("homem")) {
      System.out.println(pesoIdealParaHomens);
    }
    else if (sexo.equalsIgnoreCase("mulher")) {
      System.out.println(pesoIdealParaMulheres);
    }
    else {
      System.out.println("Estes não são valores válidos");
    }
    
    sc.close();
  }
}
