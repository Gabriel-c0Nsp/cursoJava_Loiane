package questao05;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira a quantidade de litros para que seja convertido para centímetros cúbicos: ");
    double litroCMcubico = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeVolume.calcularLitrosCMcubicos(litroCMcubico));

    System.out.println();
    System.out.print("Insira a quantidade de metros cúbicos para que seja convertido para litros: ");
    double metrocubicolitro = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeVolume.calcularMetroscubicosLitros(metrocubicolitro));

    System.out.println();
    System.out.print("Insira a quantidade de metros cúbicos para que seja convertido para pés cúbicos: ");
    double metrocubicoPecubico = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeVolume.calcularMetroscubicosPescubicos(metrocubicoPecubico));

    System.out.println();
    System.out.print("Insira a quantidade de galões americanos para que seja convertido para polegadas cúbicas: ");
    double galaoamericanoPolegadacubica = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeVolume.calcularGaloesamericanosPolegadasCubicas(galaoamericanoPolegadacubica));

    System.out.println();
    System.out.print("Insira a quantidade de galões americanos para que seja convertido para litros: ");
    double galaoamericanoLitro = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeVolume.calcularGaloesamericanosLitros(galaoamericanoLitro));

    scanner.close();

  }
}
