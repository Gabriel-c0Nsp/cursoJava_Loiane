import java.util.Scanner;

public class MediaNota2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as duas notas parciais do aluno");
    double primeiraNota = sc.nextDouble();
    double segundaNota = sc.nextDouble();

    double media = (primeiraNota + segundaNota) / 2;

    if (primeiraNota >= 0 && segundaNota >= 0 && media <= 4) {
      System.out.printf("A média do aluno é de: %.3f%n", media);
      System.out.println("Essa média corresponde a um: E");
      System.out.println("Resultado: REPROVADO");
    }
    else if (primeiraNota >= 0 && segundaNota >= 0 && media > 4 && media <= 6) {
      System.out.printf("A média do aluno é de: %.3f%n", media);
      System.out.println("Essa média corresponde a um: D");
      System.out.println("Resultado: REPROVADO");
    }
    else if (primeiraNota >= 0 && segundaNota >= 0 && media > 6 && media <= 7.5) {
      System.out.printf("A média do aluno é de: %.3f%n", media);
      System.out.println("Essa média corresponde a um: C");
      System.out.println("Resultado: APROVADO");
    }
    else if (primeiraNota >= 0 && segundaNota >= 0 && media > 7.5 && media <= 9) {
      System.out.printf("A média do aluno é de: %.3f%n", media);
      System.out.println("Essa média corresponde a um: B");
      System.out.println("Resultado: APROVADO");
    }
    else if (primeiraNota >= 0 && segundaNota >= 0 && media > 9 && media <= 10) {
      System.out.printf("A média do aluno é de: %.3f%n", media);
      System.out.println("Essa média corresponde a um: A");
      System.out.println("Resultado: APROVADO");
    }
    else {
      System.out.println("Você digitou algum valor inválido");
    }

    sc.close();
  }
}
