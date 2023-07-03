import java.util.Scanner;
import java.util.Locale;

public class Questao05 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double A;
    double taxaDeCrescimentoA = 0;
    double crescimentoA = 0;
    double B;
    double taxaDeCrescimentoB = 0;
    double crescimentoB;
    int anosNecessarios = 0;

    boolean valorValido = false;

    do {
      System.out.println("Qual a população do país A?");
      A = scanner.nextDouble();
      System.out.println("Qual a taxa de crescimento do país A?");
      taxaDeCrescimentoA = scanner.nextDouble();
      crescimentoA = (taxaDeCrescimentoA / 100) * A;

      System.out.println("Qual a população do país B?");
      B = scanner.nextDouble();
      System.out.println("Qual a taxa de crescimento do país B?");
      taxaDeCrescimentoB = scanner.nextDouble();
      crescimentoB = (taxaDeCrescimentoB / 100) * A;

      if (A > 0 || B > 0 || taxaDeCrescimentoB > 0 || crescimentoB > 0) {
        while(A <= B) {
          A += crescimentoA;
          B += crescimentoB;
          anosNecessarios++;
        }
      }
      else {
          System.out.println("Valores inválidos");
          valorValido = true;
      }
    } while (valorValido == true);

      

    System.out.println("Serão necessários " + anosNecessarios + " anos para que a população de A seja maior que população de B");

    scanner.close();

  }
}
