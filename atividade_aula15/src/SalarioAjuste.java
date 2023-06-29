import java.util.Scanner;
import java.util.Locale;

public class SalarioAjuste {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o salário do colaborador");
    double salarioAtual = sc.nextDouble();

    double salarioReajuste20 = 0.20 * salarioAtual;
    double salarioReajuste15 = 0.15 * salarioAtual;
    double salarioReajuste10 = 0.10 * salarioAtual;
    double salarioReajuste05 = 0.05 * salarioAtual;

    if (salarioAtual > 0 && salarioAtual <= 280){
      double salarioReajustado = salarioAtual + salarioReajuste20;
      System.out.printf("O salário antes do reajuste é de: R$ %.2f%n", salarioAtual);
      System.out.println("O percentual a ser aplicado em cima do salario atual é de: 20%");
      System.out.printf("O valor do aumento será de: R$ %.2f%n", salarioReajuste20);
      System.out.printf("O salário do colaborador após o aumento será de: R$ %.2f%n", salarioReajustado);
    }
    else if (salarioAtual > 0 && salarioAtual > 280 && salarioAtual <= 700){
      double salarioReajustado = salarioAtual + salarioReajuste15;
      System.out.printf("O salário antes do reajuste é de: R$ %.2f%n", salarioAtual);
      System.out.println("O percentual a ser aplicado em cima do salario atual é de: 15%");
      System.out.printf("O valor do aumento será de: R$ %.2f%n", salarioReajuste15);
      System.out.printf("O salário do colaborador após o aumento será de: R$ %.2f%n", salarioReajustado);
    }
    else if (salarioAtual > 0 && salarioAtual > 700 && salarioAtual <= 1500){
      double salarioReajustado = salarioAtual + salarioReajuste10;
      System.out.printf("O salário antes do reajuste é de: R$ %.2f%n", salarioAtual);
      System.out.println("O percentual a ser aplicado em cima do salario atual é de: 10%");
      System.out.printf("O valor do aumento será de: R$ %.2f%n", salarioReajuste10);
      System.out.printf("O salário do colaborador após o aumento será de: R$ %.2f%n", salarioReajustado);
    }
    else if (salarioAtual > 0 && salarioAtual > 1500){
      double salarioReajustado = salarioAtual + salarioReajuste05;
      System.out.printf("O salário antes do reajuste é de: R$ %.2f%n", salarioAtual);
      System.out.println("O percentual a ser aplicado em cima do salario atual é de: 5%");
      System.out.printf("O valor do aumento será de: R$ %.2f%n", salarioReajuste05);
      System.out.printf("O salário do colaborador após o aumento será de: R$ %.2f%n", salarioReajustado);
    }
    else {
      System.out.println("Você não digitou um valor válido");
    }

    sc.close();
    
  }
}
