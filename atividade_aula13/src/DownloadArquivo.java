import java.util.Scanner;

public class DownloadArquivo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o tamanho do arquivo em MB");
    double mb = sc.nextDouble();

    System.out.println("Digite a velocidade da internet em Mbps");
    double mbps = sc.nextDouble();

    double calculadoraDownload = mb / (mbps / 8);
    double calculadoraDownloadMinutos = calculadoraDownload / 60;
    double calculadoraDownloadMinutosArredondado = Math.floor(calculadoraDownloadMinutos);

    System.out.println();
    System.out.printf("O download deste arquivo irá demorar %.0f minuto(s) %n", calculadoraDownloadMinutosArredondado);

    sc.close(); 

  }
}
