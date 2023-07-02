import java.util.Scanner;
import java.util.Locale;

public class HipermercadoTabajara {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o tipo de carne comprada");
    String tipoDeCarne = scanner.nextLine();

    System.out.println("Digite a quantidade de carne comprada");
    double kilosComprados = scanner.nextDouble();

    System.out.println("O pagamento foi efetuado através do cartão Tabajara (\"S\" para sim e \"N\" para não)?");
    String formaDePagamento = scanner.next();

    double desconto = 0;
    double precoTotal = 0;
    double precoTotalComDesconto = 0;
    boolean pagamentoCartao = false;

    if (formaDePagamento.equalsIgnoreCase("S")) {
      pagamentoCartao = true;
    } 
    if (pagamentoCartao == false && tipoDeCarne.equalsIgnoreCase("file") && kilosComprados <= 5) {
      precoTotal = 4.90 * kilosComprados;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotal);
    }
    else if (pagamentoCartao == true && tipoDeCarne.equalsIgnoreCase("file") && kilosComprados <= 5) {
      precoTotal = 4.90 * kilosComprados;
      desconto = 0.05 * precoTotal;
      precoTotalComDesconto = precoTotal - desconto;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotalComDesconto);
    }
    else if (pagamentoCartao == false && tipoDeCarne.equalsIgnoreCase("file") && kilosComprados > 5) {
      precoTotal = 5.80 * kilosComprados;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotal);
    }
    else if (pagamentoCartao == true && tipoDeCarne.equalsIgnoreCase("file") && kilosComprados > 5) {
      precoTotal = 5.80 * kilosComprados;
      desconto = 0.05 * precoTotal;
      precoTotalComDesconto = precoTotal - desconto;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotalComDesconto);
    }
    else if (pagamentoCartao == false && tipoDeCarne.equalsIgnoreCase("alcatra") && kilosComprados <= 5) {
      precoTotal = 5.90 * kilosComprados;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotal);
    }
    else if (pagamentoCartao == true && tipoDeCarne.equalsIgnoreCase("alcatra") && kilosComprados <= 5) {
      precoTotal = 5.90 * kilosComprados;
      desconto = 0.05 * precoTotal;
      precoTotalComDesconto = precoTotal - desconto;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotalComDesconto);
    }
    else if (pagamentoCartao == false && tipoDeCarne.equalsIgnoreCase("alcatra") && kilosComprados > 5) {
      precoTotal = 6.80 * kilosComprados;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotal);
    }
    else if (pagamentoCartao == true && tipoDeCarne.equalsIgnoreCase("alcatra") && kilosComprados > 5) {
      precoTotal = 6.80 * kilosComprados;
      desconto = 0.05 * precoTotal;
      precoTotalComDesconto = precoTotal - desconto;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotalComDesconto);
    }
    else if (pagamentoCartao == false && tipoDeCarne.equalsIgnoreCase("picanha") && kilosComprados <= 5) {
      precoTotal = 6.90 * kilosComprados;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotal);
    }
    else if (pagamentoCartao == true && tipoDeCarne.equalsIgnoreCase("picanha") && kilosComprados <= 5) {
      precoTotal = 6.90 * kilosComprados;
      desconto = 0.05 * precoTotal;
      precoTotalComDesconto = precoTotal - desconto;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotalComDesconto);
    }
    else if (pagamentoCartao == false && tipoDeCarne.equalsIgnoreCase("picanha") && kilosComprados > 5) {
      precoTotal = 7.80 * kilosComprados;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotal);
    }
    else if (pagamentoCartao == true && tipoDeCarne.equalsIgnoreCase("picanha") && kilosComprados > 5) {
      precoTotal = 7.80 * kilosComprados;
      desconto = 0.05 * precoTotal;
      precoTotalComDesconto = precoTotal - desconto;
      System.out.println("NOTA FISCAL:");
      System.out.println();
      System.out.println("Tipo da carne: file duplo.");
      System.out.printf("Quantidade de carne: %.3f%n", kilosComprados);
      System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
      System.out.printf("O preço total do pagamento será de: R$ %.2f%n", precoTotalComDesconto);
    }
    else {
      System.out.println("Este tipo de carne não está disponível");
    }

    scanner.close();
  }
}
