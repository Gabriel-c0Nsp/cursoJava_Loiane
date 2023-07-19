package questao04;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira a quantidade de metros quadrados para que seja convertido para pés quadrados: ");
    double metroPe = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeArea.calcularMetrosPes(metroPe));

    System.out.println();
    System.out.print("Insira a quantidade de pés quadrados para que seja convertido para centímetros quadrados: ");
    double peCM = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeArea.calcularPesCM(peCM));

    System.out.println();
    System.out.print("Insira a quantidade de milhas quadradas para que seja convertido para acres: ");
    double milhaAcre = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeArea.calcularMilhaAcre(milhaAcre));

    System.out.println();
    System.out.print("Insira a quantidade de acres para que seja convertido para pés quadrados: ");
    double acrePe = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeArea.calcularAcrePes(acrePe));

    scanner.close();

  }
}
