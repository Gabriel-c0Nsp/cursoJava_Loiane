import java.util.Scanner;
import java.util.Locale;

public class MediaNota {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com as duas notas do aluno");
    double nota1 = sc.nextDouble();
    double nota2 = sc.nextDouble();

    double media = (nota1 + nota2) / 2;

    if (media >= 7 && media < 10) {
      System.out.println("Aprovado");
    }
    
    else if (media == 10) {
      System.out.println("Aprovado com Distinção");
    }
    else {
      System.out.println("Reprovado");
    }

    sc.close();

  }
}
