import java.util.Scanner;
import java.util.Locale;

public class Questao03 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    boolean valorValido = true;

    int idade;
    double salario;
    String sexo;
    String estadoCivil;

    do {
      System.out.println("Qual o seu nome?");
      String nome = scanner.next();

      if (nome.length() <= 3) {
        System.out.println("INVÁLIDO: O nome precisa ter pelo menos 4 caracteres!");
        valorValido = false;
      }
      else {
        valorValido = true;
      }
    } while (valorValido == false);

    valorValido = true;

    do {
      System.out.println("Digite sua idade");
      idade = scanner.nextInt();

      if (idade < 0 || idade > 150) {
        System.out.println("INVÁLIDO: A idade precisa ser um valor entre 0 e 150");
        valorValido = false;
      }
      else {
        valorValido = true;
      }
    } while (valorValido == false);

    valorValido = true;

    do {
      System.out.println("Insira o seu salário");
      salario = scanner.nextDouble();

      if (salario <= 0) {
        System.out.println("INVÁLIDO: O salário não pode ser igual ou menor que 0");
        valorValido = false;
      }
      else {
        valorValido = true;
      }
    } while (valorValido == false);

    valorValido = true;

    do {
      System.out.println("Digite o seu gênero (\"F\" para feminino e \"M\" para masculino)");
      sexo = scanner.next();

      if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
        valorValido = true;
      }
      else {
        valorValido = false;
        System.out.println("INVÁLIDO: Este não é um gênero válido");
      }
    } while (valorValido == false);

    valorValido = true;

    do {
      System.out.println("Informe o seu estado civil (\"S\" para solteiro, \"C\" para casado \"N\" para namorando e \"D\" para divorciado)");
      estadoCivil = scanner.next();

      if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("D") || estadoCivil.equalsIgnoreCase("N")) {
        valorValido = true;
      }
      else {
        valorValido = false;
        System.out.println("INVÁLIDO: Este não é um valor válido");
      }
    } while (valorValido == false);

    scanner.close();

  }
}
