import java.util.Scanner;

public class NotasBimestrais {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira as 4 notas do aluno e ao final do programa será calculada a sua média bimestral");
    
    double nota1 = sc.nextDouble();
    double nota2 = sc.nextDouble();
    double nota3 = sc.nextDouble();
    double nota4 = sc.nextDouble();

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.println("A media bimestral do aluno é " + media);

    sc.close();

  }
}
