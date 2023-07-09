import java.util.Scanner;

public class Questao34 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); 

    int[] A = new int[10];

    boolean par = true;

    for (int i = 0; i < A.length; i++) {
      System.out.println("Insira o valor da posição " + (i + 1));
      A[i] = scanner.nextInt();
    }

    for (int i = 0; i < A.length; i++) {
      par = true;
      for (int j = 0; j < A[i]; j++) {
        if (A[i] % 2 == 0) {
          par = true;
        }
        else {
          par = false;
        }
      } 
      if (par == true) {
        System.out.println(A[i] + " é par");
      }
      else if (par != true) {
        System.out.println(A[i] + " não é par");
      }
    }

    scanner.close();

  }
}
