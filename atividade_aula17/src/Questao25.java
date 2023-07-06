import java.util.Scanner;

public class Questao25 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa avalia a média de idades e informa a sua descrição.");
    System.out.println("Digite \"0\" para finalizar a leitura de idades e calcular as informações");

    int idade;
    boolean exit = true;
    int soma = 0;
    double media = 0;
    int quantidadeDeIdades = 0;

    System.out.println();

    do {
      System.out.println("Digite a sua idade");
      idade = scanner.nextInt();
      quantidadeDeIdades++;
      soma += idade;
        if (idade == 0) {
          exit = false;
        }
        else {
          exit = true;
        }
    } while (exit == true);

    quantidadeDeIdades--; //trata a variável para que o calculo funcione como o planejado.

    media = soma / quantidadeDeIdades;

    System.out.println();
    if (media <= 25) {
      System.out.println("CLASSIFICAÇÃO: Jovem");
    }
    else if (media > 25 && media <= 60) {
      System.out.println("CLASSIFICAÇÃO: Adulto");
    }
    else if (media > 60) {
      System.out.println("CLASSIFICAÇÃO: Idoso");
    }

    scanner.close();

  }
}
