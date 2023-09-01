import java.util.Scanner;

public class Circulo extends Figura2D implements DimensaoSuperficial {

    Scanner scanner = new Scanner(System.in);

    private static double pi = 3.14159;

    @Override
    public double calcularArea() {
        System.out.print("Informe o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        return pi * (Math.pow(raio, 2));
    }

}
