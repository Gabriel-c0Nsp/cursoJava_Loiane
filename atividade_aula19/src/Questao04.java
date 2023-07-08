public class Questao04 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    double[] B = A;

    for (int i = 0; i < A.length; i++) {
      B[i] = Math.sqrt(A[i]);
    }
    
    for (double x : B) {
      System.out.println("Resultado: " + x);
    }
  }
}
