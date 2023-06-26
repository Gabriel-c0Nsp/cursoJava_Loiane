import java.util.Scanner;

public class MultaPeixe {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o peso total dos peixes");
    double pesoDePeixes = sc.nextDouble();
    double multa = 4;
    double excesso = 0;
    double calculoParaMulta = pesoDePeixes - 50;
    double valorFinalComMulta = multa * calculoParaMulta ;

    if (pesoDePeixes > 50) {
      excesso = calculoParaMulta;
      System.out.println("A multa a pagar será de: R$" + valorFinalComMulta);
    }

    System.out.println("O excesso do total permitido foi de " + excesso);

    sc.close();

    }
  }
