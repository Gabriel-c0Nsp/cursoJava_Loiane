import java.util.Scanner;
import java.util.Locale;

public class Questao24 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de notas que deseja avaliar");
    int quantidadeDeNotas = scanner.nextInt();

    double nota;
    double media = 0;
    double soma = 0;

    for (int i = 0; i < quantidadeDeNotas; i++) {
      System.out.println("Digite a nota do aluno");
      nota = scanner.nextDouble();
      soma += nota;
    }

    media = soma / quantidadeDeNotas;

    System.out.printf("A media do aluno é: %.3f%n", media);

    scanner.close();

  }
}
