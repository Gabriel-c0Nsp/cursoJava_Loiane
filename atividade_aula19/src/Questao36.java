public class Questao36 {
  public static void main(String[] args) {
    
    double[] A = new double[11];

    for (int i = 0; i < A.length; i++) {
      A[i] = Math.pow(2, i);
    }

    for (double x : A) {
      System.out.println(x);
    }
  }
}
