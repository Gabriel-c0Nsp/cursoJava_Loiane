import java.util.Scanner;


public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    Scanner scanner = new Scanner(System.in);

    private static double pi = 3.14159;

    @Override
    public double calcularArea() {
        System.out.print("Digite o valor da altura do cilindro:");
        double altura = scanner.nextDouble();

        System.out.print("Digite o valor do raio do cilindro:");
        double raio = scanner.nextDouble();
        double areaBase = pi * (Math.pow(raio, 2));
        double areaLateral = (2 * pi) * raio * altura;
        return (2 * areaBase) + areaLateral;
    }

    @Override
        public double calcularVolume() {
        System.out.print("Digite o valor da altura do cilindro:");
        double altura = scanner.nextDouble();

        System.out.print("Digite o valor do raio do cilindro:");
        double raio = scanner.nextDouble();
        return pi * (Math.pow(raio, 2)) * altura;
    }
    
}
