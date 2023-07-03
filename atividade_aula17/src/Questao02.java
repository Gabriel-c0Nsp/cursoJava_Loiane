import java.util.Scanner;

public class Questao02 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String usuario;
    String senha;

    boolean senhaValida = false;

    do {
      System.out.println("Nome de usuário");
      usuario = scanner.next();
      System.out.println("Senha");
      senha = scanner.next();

        if (senha.equalsIgnoreCase(usuario)) {
          System.out.println("Senha inválida!");
          System.out.println();
        }
        else {
        senhaValida = true;
        }
    } while (senhaValida == false);

    scanner.close();
  }
}
