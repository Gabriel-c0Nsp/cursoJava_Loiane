import java.util.Scanner;

public class CaixaEletronico {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, informe o valor do saque");
    int saque = sc.nextInt();

    boolean quantiaValida = false;
    int valorMINeMAX = saque;

    int nota1 = 0;
    int nota5 = 0;
    int nota10 = 0;
    int nota50 = 0;
    int nota100 = 0;

    nota100 = saque / 100;
    saque = saque % 100;

    nota50 = saque / 50;
    saque = saque % 50;

    nota10 = saque / 10;
    saque = saque % 10;

    nota5 = saque / 5;
    saque = saque % 5;

    nota1 = saque / 1;
    saque = saque % 1;

    if (valorMINeMAX >= 10 && valorMINeMAX <= 600) {
      quantiaValida = true;
    }

    if (quantiaValida == true) {
      System.out.println(nota100 + " nota(s) de 100");
      System.out.println(nota50 + " nota(s) de 50");
      System.out.println(nota10 + " nota(s) de 10");
      System.out.println(nota5 + " nota(s) de 5");
      System.out.println(nota1 + " nota(s) de 1");
    }
    else {
      System.out.println("Não foi possível realizar o saque: Valor não permitido");
    }
   
    sc.close();
    
  }
}
