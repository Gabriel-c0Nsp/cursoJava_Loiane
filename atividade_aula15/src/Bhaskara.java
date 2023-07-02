import java.util.Scanner;
import java.util.Locale;

public class Bhaskara {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com os valores de a, b e c para que o programa possa fazer o cálculo");
    System.out.println();
    System.out.println("Digite o valor de a");
    double a = sc.nextDouble();
    double b;
    double c;

    double delta = 0;
    double raiz1 = 0;
    double raiz2 = 0;

    boolean equacaoSegundoGrau = false;
    boolean deltaNegativo = false;
    
    if (a != 0) {
      equacaoSegundoGrau = true;
    } 
    else {
      System.out.println("Não é uma equação do segundo grau!");
    }

    if (equacaoSegundoGrau == true) {
      System.out.println("Digite o valor de b");
      b = sc.nextDouble();
      System.out.println("Digite o valor de c");
      c = sc.nextDouble();
      delta = (Math.pow(b, 2)) - 4 * a * c;
      raiz1 = (-(b) + (Math.sqrt(delta))) / (2 * a);
      raiz2 = (-(b) - (Math.sqrt(delta))) / (2 * a);
    }
    
    if (delta < 0) {
      deltaNegativo = true;
      System.out.println("A equação não possui raízes reais");
    }

    if (deltaNegativo == false && equacaoSegundoGrau == true) {
      if (delta == 0) {
        System.out.println("A equação possui apenas uma raiz");
        System.out.println("X = " + raiz1);
      } 
      if (delta > 0) {
        System.out.println("A equação possui duas raízes");
        System.out.println("X1 = " + raiz1);
        System.out.println("X2 = " + raiz2);
      } 
    }

    sc.close();

  }
}
