package questao06;

public class ConversaoDeUnidadesDeTempo {

  public static int calcularMinutosSegundos(int minutoSegundo) {
    return minutoSegundo * 60;
  }

  public static int calcularHorasMinutos(int horaMinuto) {
    return horaMinuto * 60;
  }

  public static int calcularDiasHoras(int diaHora) {
    return diaHora * 24;
  }

  public static int calcularSemanasDias(int semanaDia) {
    return semanaDia * 7;
  }

  public static int calcularMesesDias(int mesDia) {
    return mesDia * 30;
  }

  public static double calcularAnosDias(double anoDia) {
    return anoDia * 365.25;
  }
}
