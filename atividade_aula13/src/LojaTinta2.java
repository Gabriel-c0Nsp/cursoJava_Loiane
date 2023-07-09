import java.util.Scanner;
import java.util.Locale;

public class LojaTinta2 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite em metros quadrados a área a ser pintada");
    double area = sc.nextDouble();

    //apenas adicionando espaço entre input e output
    System.out.println();

    double lataTintaGrande= 18;
    double precoLataTintaGrande = 80;

    double galoesTintaPequeno = 3.6;
    double precoGaloesTintaPequeno = 25;

    double litrosUsados = area / 6;

    double latasUsadasGrandes = litrosUsados / lataTintaGrande;
    double latasUsadasValorArredondadoLatasGrandes = Math.ceil(latasUsadasGrandes);
    double precoTotalLatasGrandes = latasUsadasValorArredondadoLatasGrandes * precoLataTintaGrande;

    double galoesUsadosPequenos = litrosUsados / galoesTintaPequeno;
    double galoesUsadosValorArredondadoGaloesPequenos= Math.ceil(galoesUsadosPequenos);
    double precoTotalGaloesPequenos = galoesUsadosValorArredondadoGaloesPequenos * precoGaloesTintaPequeno;


    System.out.printf("A quantidade de latas de 18 litros a serem compradas será de: %.0f%n", latasUsadasValorArredondadoLatasGrandes);
    System.out.printf("O valor total da compra será de: R$ %.2f%n", precoTotalLatasGrandes);
    System.out.println();
    System.out.printf("A quantidade de galões de 3,6 litros a serem comprados será de: %.0f%n", galoesUsadosValorArredondadoGaloesPequenos);
    System.out.printf("O valor total da compra será de: R$ %.2f%n", precoTotalGaloesPequenos);

    double folga =  0.10 * litrosUsados;
    double litrosTotaisComFolga = litrosUsados + folga;

    double calculadoraLitrosLataGrande = litrosTotaisComFolga / 18;
    double latasGrandesUsadas = Math.floor(calculadoraLitrosLataGrande);

    double litrosAtuais = Math.ceil(calculadoraLitrosLataGrande) * 18;
    double litrosFaltando = litrosAtuais - litrosUsados;
    double calculadoraLitrosGalaoPequeno = litrosFaltando / 3.6;
    double galoesUsadosPequeno = Math.ceil(calculadoraLitrosGalaoPequeno);

    double precoLatasGrandesUsadas = latasGrandesUsadas * precoLataTintaGrande;
    double precoGaloesPequenosUsados = galoesUsadosPequeno * precoGaloesTintaPequeno;
    double precoTotal = precoLatasGrandesUsadas + precoGaloesPequenosUsados;

    System.out.println();
    System.out.println("Ao comprar galões e latas a fim de pintar a área desejada (considerando uma quantidada a mais de tinta, por segurança) gastando o mínimo possível, você terá que:");
    System.out.println();
    System.out.format("comprar %.0f latas e %.0f galões de tinta %n", latasGrandesUsadas, galoesUsadosPequeno);
    System.out.printf("gastar R$ %.2f%n", precoTotal);

    sc.close();
    
  }
}
