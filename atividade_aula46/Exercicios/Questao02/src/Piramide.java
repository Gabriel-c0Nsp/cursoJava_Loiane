import java.util.Scanner;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    Scanner scanner = new Scanner(System.in);

    @Override
    public double calcularArea() {
        System.out.print("Qual o formato da base da pirâmide? ");
        System.out.print("Informe o valor do lado da base: ");
        double ladoBase = scanner.nextDouble();
        double areaBase = ladoBase * ladoBase;

        System.out.println("Informe a altura da pirâmide: ");
        double altura = scanner.nextDouble();

        double areaLateral = ladoBase * altura;

        return areaBase + (4 * areaLateral);
    }

    @Override
    public double calcularVolume() {
        System.out.print("Qual o formato da base da pirâmide? ");
        String formatoBase = scanner.next();

        if (formatoBase.equalsIgnoreCase("quadrado") || formatoBase.equalsIgnoreCase("quadrada")) {
            System.out.print("Informe a medida de um dos lados da base: ");
            double ladoBase = scanner.nextDouble();

            double areaBase = ladoBase * ladoBase;

            System.out.print("Informe a altura da pirâmide: ");
            double altura = scanner.nextDouble();

            return (areaBase * altura) / 3;
        } else if (formatoBase.equalsIgnoreCase("triangular") || formatoBase.equalsIgnoreCase("triangulo")
                || formatoBase.equalsIgnoreCase("triângulo")) {
            System.out.print("Informe a medida do lado da base: ");
            double medidaLadoBase = scanner.nextDouble();

            System.out.print("Informe a altura relativa a esse lado da pirâmide: ");
            double altura = scanner.nextDouble();

            return (medidaLadoBase * altura) / 2;
        } else {
            System.out.println("Valores incorretos");
            return 0;
        }
    }

}
