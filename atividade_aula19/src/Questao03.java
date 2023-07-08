import java.util.Scanner;

public class Questao03 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); 

    int[] A = new int[15];
    int[] B = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      System.out.println("informe o valor da posição " + (i+1));
      A[i] = scanner.nextInt();
      B[i] = A[i] * A[i];
    }

    for (int x : B) {
      System.out.println("Resultado: " + x);
    }

    scanner.close();
  }
}
  
          

          
 
 
 
