import java.util.Scanner;

public class MediaNota3 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as 3 notas do aluno e ao final do programa, será calculada a sua média. Com base nessa média, será julgado se o aluno está aprovado ou reprovado");
    System.out.println();

    System.out.println("Digite a primeira nota do aluno");
    double nota1 = sc.nextDouble();

    System.out.println("Digite a segunda nota do aluno");
    double nota2 = sc.nextDouble();

    System.out.println("Digite a terceira nota do aluno");
    double nota3 = sc.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    if (nota1 >=0 && nota2 >= 0 && nota3 >= 0 && media == 10) {
      System.out.println("Aprovado com Distinção");
    }
    else if (nota1 >=0 && nota2 >= 0 && nota3 >= 0 && media >= 7 && media < 10) {
      System.out.println("Aprovado");
    }
    else if (nota1 >=0 && nota2 >= 0 && nota3 >= 0 && media >= 0 && media < 7) {
      System.out.println("Reprovado");
    }
    else {
      System.out.println("Valor(es) digitado(s) inválido(s)");
    }

    sc.close();

  }
}
