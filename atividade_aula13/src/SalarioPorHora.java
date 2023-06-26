import java.util.Scanner;

public class SalaroPorHora {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite quanto recebe por hora");
    double salarioHora = sc.nextDouble();

    System.out.println("Digite quantas são as horas trabalhadas");
    int horasTrabalhadas = sc.nextInt();

    double salarioMensal = salarioHora * horasTrabalhadas;

    System.out.println("O seu salário é de R$" + salarioMensal);
  }
}
