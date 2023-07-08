public class Questao15 {
  public static void main(String[] args) {

    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] B = A;

    for (int i = 0; i < A.length; i++) {
      B[i] = A[i] * i;
    }

    for (int x : B) {
      System.out.println("Resultado: " + x);
    }
  }
}
