import java.util.Scanner;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

    Scanner scanner = new Scanner(System.in);

    @Override
    public double calcularArea() {
        System.out.print("Informe o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        double altura = scanner.nextDouble();

        return (base * altura) / 2;
    }

}
