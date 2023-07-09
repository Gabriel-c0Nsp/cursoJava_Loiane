import java.util.Scanner;

public class Questao19 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] nota1 = new int[10];
    int[] nota2 = new int[nota1.length];
    int[] resultado = new int[nota1.length];

    for (int i = 0; i < nota1.length; i++) {
      System.out.println("Insira a primeira nota do aluno " + (i + 1));
      nota1[i] = scanner.nextInt();
      System.out.println("Insira a segunda nota do aluno " + (i + 1));
      nota2[i] = scanner.nextInt();

      resultado[i] = (nota1[i] + nota2[i] / 2);

      if (resultado[i] >= 7) {
        System.out.println("O aluno " + (i + 1) + " está aprovado");
      }
      else {
        System.out.println("O aluno " + (i + 1) + " está reprovado");
      }
    }

    scanner.close();

  }
}
