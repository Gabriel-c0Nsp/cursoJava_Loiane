import java.util.Scanner;

public class Logica {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Número inteiro");
    int num1 = sc.nextInt();
    System.out.println("Número inteiro");
    int num2 = sc.nextInt();
    System.out.println("Número real");
    double num3 = sc.nextDouble();

    double res1 = (num1 * 2) * (num2/2);
    double res2 = (num1 * 3) + num3;
    double res3 = Math.pow(num3, 3);

    System.out.println("o produto do dobro do primeiro com metade do segundo é " + res1);
    System.out.println("a soma do triplo do primeiro com o terceiro é " + res2);
    System.out.println("o terceiro elevado ao cubo é " + res3);

    sc.close();

  }
}
