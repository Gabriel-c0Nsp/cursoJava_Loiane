import java.util.Scanner;

public class Triangulo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor de cada um dos lados de um triângulo");
    double lado1 = sc.nextDouble();
    double lado2 = sc.nextDouble();
    double lado3 = sc.nextDouble();

    boolean eTriangulo;
    
    if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2) && (lado1 > 0) && (lado2 > 0) && (lado3 > 0)) {
      eTriangulo = true;
    }
    else {
      eTriangulo = false;
    }

    if (eTriangulo == true && lado1 == lado2 && lado1 == lado3) {
      System.out.println("Este É UM TRIÂNGULO: Equilátero");
    }
    else if (eTriangulo == true && lado1 == lado2) {
      System.out.println("Este É UM TRIÂNGULO: Isósceles");
    }
    else if (eTriangulo == true && lado1 == lado3) {
      System.out.println("Este É UM TRIÂNGULO: Isósceles");
    }
    else if (eTriangulo == true && lado2 == lado3) {
      System.out.println("Este É UM TRIÂNGULO: Isósceles");
    }
    else if (eTriangulo == true && lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
      System.out.println("Este É UM TRIÂNGULO: Escaleno");
    }
    else {
      System.out.println("este NÃO É UM TRIÂNGULO");
    } 

    sc.close();

  }
}
