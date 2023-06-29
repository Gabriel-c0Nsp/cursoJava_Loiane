import java.util.Scanner;

public class DiaDaSemana {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com um número entre 1-7 e ao final do programa será exibido o dia da semana correspondente");
    int diaDaSemana = sc.nextInt();

    switch(diaDaSemana) {
      case 1: 
      System.out.println("Domigo");
      break;
      case 2: 
      System.out.println("Segunda");
      break;
      case 3: 
      System.out.println("Terça");
      break;
      case 4: 
      System.out.println("Quarta");
      break;
      case 5: 
      System.out.println("Quinta");
      break;
      case 6: 
      System.out.println("Sexta");
      break;
      case 7: 
      System.out.println("Sábado");
      break;
      default:
      System.out.println("Valor inválido");
    }

    sc.close();
  }
}
