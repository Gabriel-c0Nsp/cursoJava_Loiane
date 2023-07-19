package questao06;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira a quantidade de minutos para que seja convertido para segundos: ");
    int minutoSegundo = scanner.nextInt();
    System.out.println("O resultado da conversão é: "
        + ConversaoDeUnidadesDeTempo.calcularMinutosSegundos(minutoSegundo) + " segundos.");

    System.out.println();
    System.out.print("Insira a quantidade de horas para que seja convertido para minutos: ");
    int horaMinuto = scanner.nextInt();
    System.out.println(
        "O resultado da conversão é: " + ConversaoDeUnidadesDeTempo.calcularHorasMinutos(horaMinuto) + " minutos.");

    System.out.println();
    System.out.print("Insira a quantidade de dias para que seja convertido para horas: ");
    int diaHora = scanner.nextInt();
    System.out
        .println("O resultado da conversão é: " + ConversaoDeUnidadesDeTempo.calcularDiasHoras(diaHora) + " horas.");

    System.out.println();
    System.out.print("Insira a quantidade de semanas para que seja convertido para dias: ");
    int semanaDia = scanner.nextInt();
    System.out
        .println("O resultado da conversão é: " + ConversaoDeUnidadesDeTempo.calcularSemanasDias(semanaDia) + " dias.");

    System.out.println();
    System.out.print("Insira a quantidade de meses para que seja convertido para dias: ");
    int mesDia = scanner.nextInt();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeTempo.calcularMesesDias(mesDia) + " dias");

    System.out.println();
    System.out.print("Insira a quantidade de anos para que seja convertido para dias: ");
    double anoDia = scanner.nextDouble();
    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeTempo.calcularAnosDias(anoDia) + " dias");

    scanner.close();

  }
}
