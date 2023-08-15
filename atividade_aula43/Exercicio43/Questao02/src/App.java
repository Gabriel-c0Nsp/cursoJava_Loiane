import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        PessoaJuridica CarlosHenrique = new PessoaJuridica("Carlos Henrique", 14500);
        PessoaJuridica MelissaChristine = new PessoaJuridica("Melissa Christine Morgado Silva", 28000);
        PessoaJuridica ChristianMorgado = new PessoaJuridica("Christian Morgado Silva", 1350);

        System.out.println("O imposto aplicado para pessoas Jurídicas é de 10%");

        System.out.print("O imposto a ser pago pela pessoa " + CarlosHenrique.getNomePessoa()); System.out.printf(" será de: $ %.2f%n", CarlosHenrique.calcularImposto());
        System.out.print("O imposto a ser pago pela pessoa " + MelissaChristine.getNomePessoa()); System.out.printf(" será de: $ %.2f%n", MelissaChristine.calcularImposto());
        System.out.print("O imposto a ser pago pela pessoa " + ChristianMorgado.getNomePessoa()); System.out.printf(" será de: $ %.2f%n", ChristianMorgado.calcularImposto());

        scanner.close();
    }
}