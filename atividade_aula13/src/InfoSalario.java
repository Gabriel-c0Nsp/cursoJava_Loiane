import java.util.Locale;
import java.util.Scanner;

public class InfoSalario {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o quanto você ganha por hora");
    double ganhoPorHora = sc.nextDouble();

    System.out.println("Digite o número de horas trabahadas no mês");
    double horasTrabalhadas = sc.nextDouble();

    double salarioBruto = ganhoPorHora * horasTrabalhadas;
    double inss = 0.08 * salarioBruto;
    double sindicato = 0.05 * salarioBruto;
    double impostoDeRenda = 0.11 * salarioBruto;
    double salarioLiquido = salarioBruto - inss - sindicato - impostoDeRenda;

    System.out.println("O seu salário bruto é de: R$" + salarioBruto);
    System.out.println();
    System.out.printf("O valor pago ao INSS foi de: R$ %.2f%n", inss);
    System.out.println();
    System.out.printf("O valor pago ao sindicato foi de: R$ %.2f%n", sindicato);
    System.out.println();
    System.out.printf("O seu salário líquido é de: R$ %.2f%n", salarioLiquido);

    sc.close();

  }
}
