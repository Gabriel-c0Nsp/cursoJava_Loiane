import java.util.Scanner;
import java.util.Locale;

public class DescontoSalario {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o seu valor/hora");
    double valorHora = scanner.nextDouble();

    System.out.println("Digite a quantidade de horas trabalhadas");
    double horasTrabalhadas = scanner.nextDouble();

    double salarioBruto = horasTrabalhadas * valorHora;
    double ir = 0.05 * salarioBruto;
    double inss = 0.10 * salarioBruto;
    double fgts = 0.11 * salarioBruto;
    double totalDeDescontos = ir + inss + fgts;
    double salarioLiquido = salarioBruto - totalDeDescontos;
    double descontoExtra = 0;

    if(salarioBruto <= 900) {
      descontoExtra = 0;
    }
    else if (salarioBruto > 900 && salarioBruto <= 1500) {
      descontoExtra = 0.05 * salarioBruto;
    }
    else if (salarioBruto > 1500 && salarioBruto <= 2500) {
      descontoExtra = 0.10 * salarioBruto;
    }
    else if (salarioBruto > 2500) {
      descontoExtra = 0.10 * salarioBruto;
    }
    else {
      System.out.println("Você não digitou valores válidos");
    }

    System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
    System.out.printf("Imposto de renda: R$ %.2f%n", ir);
    System.out.printf("INSS: R$ %.2f%n", inss);
    System.out.printf("FGTS: R$ %.2f%n", fgts);
    System.out.printf("Desconto adicional: R$ %.2f%n", descontoExtra);
    System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

    scanner.close();

  }
}
