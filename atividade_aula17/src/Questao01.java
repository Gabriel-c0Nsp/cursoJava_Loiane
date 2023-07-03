import java.util.Scanner;

public class Questao01 {
  public static void main(String[]args) {

    Scanner scanner = new Scanner(System.in);

    boolean invalido = true;
    double nota = 0; 

    do {
      System.out.println("Digite a nota do aluno");
      nota = scanner.nextDouble();
        if (nota >= 0 && nota <= 10) {
          invalido = false;
        }
        else {
          System.out.println("Digite apenas valores entre 0 a 10");
        }
    } while (invalido == true);

    scanner.close();

  }
}
