import java.util.Scanner;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    Scanner scanner = new Scanner(System.in);

    @Override
    public double calcularArea() {
        System.out.print("Informe o valor dos lados deste cubo: ");
        double lado = scanner.nextDouble();

        double areaDeUmQuadrado = lado * lado;
        return 6 * areaDeUmQuadrado;

    }

    @Override
    public double calcularVolume() {
        System.out.print("Informe o valor da aresta do cubo");
        double aresta = scanner.nextDouble();

        return Math.pow(aresta, 3);
    }

}
