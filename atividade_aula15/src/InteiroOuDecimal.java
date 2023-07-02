import java.util.Scanner;

public class InteiroOuDecimal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número e ao final do programa você saberá se o mesmo é um número inteiro ou um número decimal");
    double numero = sc.nextDouble();

    double numeroArredondado = Math.floor(numero);
    double resultadoFinal = numero - numeroArredondado;

    if (resultadoFinal == 0) {
      System.out.println("Este é um número inteiro");
    }
    else {
      System.out.println("Este é um número decimal");
    }
    
    sc.close();
    
  }
}
