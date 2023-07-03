public class Questao04 {
  public static void main(String[] args) {

    double A = 80000;
    double B = 200000;

    double crescimentoA = 0.03 * A;
    double crescimentoB = 0.015 * A;

    int anosNecessarios = 0;

    while (A <= B) {
       A += crescimentoA;
       B += crescimentoB;   
      anosNecessarios++;
    }

    System.out.println("a população de A irá se igualar ou superar a população de B em " + anosNecessarios + " anos");
  }
}
