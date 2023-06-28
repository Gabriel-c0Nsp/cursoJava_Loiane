import java.util.Scanner;
import java.util.Locale;

public class Decrescente {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite três números e os mesmos serão mostrados ao final do programa em ordem decrescente");
    double numero1 = sc.nextDouble();
    double numero2 = sc.nextDouble();
    double numero3 = sc.nextDouble();

    if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
      System.out.println(numero1);
      System.out.println(numero2);
      System.out.println(numero3);
    } 
    else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
      System.out.println(numero1);
      System.out.println(numero3);
      System.out.println(numero2);
    } 
    else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
      System.out.println(numero2);
      System.out.println(numero1);
      System.out.println(numero3);
    } 
    else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
      System.out.println(numero2);
      System.out.println(numero3);
      System.out.println(numero1);
    } 
    else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {
      System.out.println(numero3);
      System.out.println(numero2);
      System.out.println(numero1);
    } 
    else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
      System.out.println(numero3);
      System.out.println(numero1);
      System.out.println(numero2);
    } 
    else {
      System.out.println("Os números digitados são iguais");
    }

    sc.close();

  }
}
