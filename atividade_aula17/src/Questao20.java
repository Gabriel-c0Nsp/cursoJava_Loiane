import java.util.Scanner;

public class Questao20 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int resultado = 1;
    boolean repetir = false;
    boolean invalido = false;
    int numero = 0;
    String resposta;

    do {
      do {
        System.out.println("Este programa é uma calculadora de fatorial. Digite o número inteiro que deseja calcular (é necessário que o número seja positivo e menor que 16)");
        numero = scanner.nextInt();
          if (numero <=0 || numero > 16) {
            System.out.println("Apenas números positivos até 16");
            invalido = true;
          }
          else {
            invalido = false;
          }  
      } while (invalido == true);

      System.out.println();


      for (int i = numero; i > 0; i--) {
        resultado = resultado * i;
      }

      System.out.println("O resultado de " + numero + "! é igual a " + resultado);

      System.out.println("Deseja repetir o programa? Digite \"S\" para sim ou \"N\" para não.");
      resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")) {
          repetir = true;
        }
        else {
          repetir = false;
        }
    } while (repetir == true);

    scanner.close();

  }
}
