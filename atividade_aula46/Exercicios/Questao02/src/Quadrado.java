import java.util.Scanner;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

    Scanner scanner = new Scanner(System.in);

    @Override
    public double calcularArea() {
        System.out.print("Informe um dos lados do quadrado: ");
        double lado = scanner.nextDouble();

        return lado * lado;
    }

}
