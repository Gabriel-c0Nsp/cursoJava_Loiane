public class App {
  public static void main(String[] args) {
    
    Quadrado quadrado = new Quadrado();
    quadrado.setLado(2);
    quadrado.setNome("Quadrado");

    Circulo circulo = new Circulo();
    circulo.setRaio(2);
    circulo.setNome("Circulo");

    Triangulo triangulo = new Triangulo();
    triangulo.setAltura(2);
    triangulo.setBase(3);
    triangulo.setNome("Triangulo");

    Cubo cubo = new Cubo();
    cubo.setLado(3);
    cubo.setNome("Cubo");

    Cilindro cilindro = new Cilindro();
    cilindro.setAltura(3);
    cilindro.setRaio(2);
    cilindro.setNome("Cilindro");

    Piramide piramide = new Piramide();
    piramide.setAltura(3);
    piramide.setApotema(4);
    piramide.setArestaBase(2);
    piramide.setNumeroPoligonoBase(4);
    piramide.setBase(quadrado);
    piramide.setNome("Piramide");

    FiguraGeometrica figurasGeometricas[] = {quadrado, circulo, triangulo, cubo, cilindro, piramide};

    for (FiguraGeometrica figura : figurasGeometricas) {
    System.out.println("=====================");

    System.out.println(figura.getNome());

    if (figura instanceof Figura2D) {
      Figura2D figura2d = (Figura2D) figura;
      System.out.println(figura2d.calcularArea());
    }

    if (figura instanceof Figura3D) {
      Figura3D figura3d = (Figura3D) figura;
      System.out.println(figura3d.calcularArea());
      System.out.println(figura3d.calcularVolume());
    }

    }

  }
}
