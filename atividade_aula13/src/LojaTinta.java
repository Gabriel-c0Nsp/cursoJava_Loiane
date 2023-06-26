import java.util.Scanner;
import java.util.Locale;

public class LojaTinta {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a área em metros quadrados a ser pintada");
    double area = sc.nextDouble();
    
    double lataTinta = 18;
    double precoLataTinta = 80;

    double litrosUsados = area / 3;
    double latasUsadas = litrosUsados / lataTinta;
    double latasUsadasValorArredondado = Math.ceil(latasUsadas);
    double precoTotal = latasUsadasValorArredondado * precoLataTinta;

    System.out.println();
    System.out.printf("A quantidade de latas a ser compradas será de: %.0f%n", latasUsadasValorArredondado);
    System.out.printf("O valor total da compra será de: R$ %.2f%n", precoTotal);

    sc.close();

  }
}
