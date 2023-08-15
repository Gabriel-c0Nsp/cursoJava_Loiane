import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    PessoaJuridica CarlosHenrique = new PessoaJuridica("Carlos Henrique", 14500);
    PessoaJuridica MelissaChristine = new PessoaJuridica("Melissa Christine Morgado Silva", 28000);
    PessoaJuridica ChristianMorgado = new PessoaJuridica("Christian Morgado Silva", 1350);

    PessoaFisica GabrielSilva = new PessoaFisica("Gabriel Silva Aires", 5800);
    PessoaFisica JoaoPereira = new PessoaFisica("João Pereira", 2350);
    PessoaFisica FelipeSilva = new PessoaFisica("Felipe Silva Aires", 1800);

    System.out.println("O imposto aplicado para pessoas Jurídicas é de 10%");

    System.out.print("O imposto a ser pago pela pessoa " + CarlosHenrique.getNomePessoa());
    System.out.printf(" será de: $ %.2f%n", CarlosHenrique.calcularImposto());
    System.out.print("O imposto a ser pago pela pessoa " + MelissaChristine.getNomePessoa());
    System.out.printf(" será de: $ %.2f%n", MelissaChristine.calcularImposto());
    System.out.print("O imposto a ser pago pela pessoa " + ChristianMorgado.getNomePessoa());
    System.out.printf(" será de: $ %.2f%n", ChristianMorgado.calcularImposto());

    System.out.println();

    System.out.println("imposto a ser aplicado às pessoas Físicas: ");

    System.out.print("O imposto a ser pago pela pessoa " + GabrielSilva.getNomePessoa());
    System.out.printf(" será de: $ %.2f%n", GabrielSilva.calcularImposto());
    System.out.print("O imposto a ser pago pela pessoa " + JoaoPereira.getNomePessoa());
    System.out.printf(" será de: $ %.2f%n", JoaoPereira.calcularImposto());
    System.out.print("O imposto a ser pago pela pessoa " + FelipeSilva.getNomePessoa());
    System.out.printf(" será de: $ %.2f%n", FelipeSilva.calcularImposto());

    scanner.close();
  }
}
