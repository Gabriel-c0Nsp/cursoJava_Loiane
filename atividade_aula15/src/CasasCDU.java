import java.util.Scanner;

public class CasasCDU {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número inteiro menor que 1000. Ao final do programa, será impresso a(s) centena(s), a(s) dezena(s) e a(s) unidade(s) do mesmo");
    int numero = sc.nextInt();
    int numeroDigitado = numero;


    int unidades = 0;
    int dezenas = 0;
    int centenas = 0;

    boolean menorQueMil = false;

    centenas = numero / 100;
    numero = numero % 100;

    dezenas = numero / 10;
    numero = numero % 10;

    unidades = numero / 1;
    numero = numero % 1;
    
    if (numeroDigitado < 1000) {
      menorQueMil = true;    
      if (centenas == 1 && dezenas == 1 && unidades == 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centena, " + dezenas + " dezena e " + unidades + " unidade");
      }
      else if (centenas != 1 && dezenas == 1 && unidades == 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centenas, " + dezenas + " dezena e " + unidades + " unidade");
      }
      else if (centenas == 1 && dezenas != 1 && unidades == 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centena, " + dezenas + " dezenas e " + unidades + " unidade");
      }
      else if (centenas == 1 && dezenas == 1 && unidades != 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centena, " + dezenas + " dezena e " + unidades + " unidades");
      }
      else if (centenas != 1 && dezenas != 1 && unidades == 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");
      }
      else if (centenas != 1 && dezenas == 1 && unidades != 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centenas, " + dezenas + " dezena e " + unidades + " unidades");
      }
      else if (centenas == 1 && dezenas != 1 && unidades != 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centena, " + dezenas + " dezenas e " + unidades + " unidades");
      }
      else if (centenas != 1 && dezenas != 1 && unidades != 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");
      }
      else if (centenas == 1 && dezenas == 1 && centenas > 0 && dezenas > 0 && unidades == 0) {
        System.out.println(centenas + " centena e " + dezenas + " dezena");
      }
      else if (centenas != 1 && dezenas == 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centenas e " + dezenas + " dezena");
      }
      else if (centenas == 1 && dezenas != 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centena e " + dezenas + " dezenas");
      }
      else if (centenas != 1 && dezenas != 1 && centenas > 0 && dezenas > 0 && unidades > 0) {
        System.out.println(centenas + " centenas e " + dezenas + " dezenas");
      }
      else if (centenas == 1 && unidades == 1 && centenas > 0 && unidades > 0 && dezenas == 0) {
        System.out.println(centenas + " centena e " + unidades + " unidade");
      }
      else if (centenas != 1 && unidades == 1 && centenas > 0 && unidades > 0 && dezenas == 0) {
        System.out.println(centenas + " centenas e " + unidades + " unidade");
      }
      else if (centenas == 1 && unidades != 1 && centenas > 0 && unidades > 0 && dezenas == 0) {
        System.out.println(centenas + " centena e " + unidades + " unidades");
      }
      else if (centenas != 1 && unidades != 1 && centenas > 0 && unidades > 0 && dezenas == 0) {
        System.out.println(centenas + " centenas e " + unidades + " unidades");
      }
      else if (dezenas == 1 && unidades == 1 && dezenas > 0 && unidades > 0 && centenas == 0) {
        System.out.println(dezenas + " dezena e " + unidades + " unidade");
      }
      else if (dezenas != 1 && unidades == 1 && dezenas > 0 && unidades > 0 && centenas == 0) {
        System.out.println(dezenas + " dezenas e " + unidades + " unidade");
      }
      else if (dezenas == 1 && unidades != 1 && dezenas > 0 && unidades > 0 && centenas == 0) {
        System.out.println(dezenas + " dezena e " + unidades + " unidades");
      }
      else if (dezenas != 1 && unidades != 1 && dezenas > 0 && unidades > 0 && centenas == 0) {
        System.out.println(dezenas + " dezenas e " + unidades + " unidades");
      }
      else if (centenas == 1 && centenas > 0 && dezenas == 0 && unidades == 0) {
        System.out.println(centenas + " centena");
      }
      else if (centenas != 1 && centenas > 0 && dezenas == 0 && unidades == 0) {
        System.out.println(centenas + " centenas");
      }
      else if (dezenas == 1 && dezenas > 0 && centenas == 0 && unidades == 0) {
        System.out.println(dezenas + " dezena");
      }
      else if (dezenas != 1 && dezenas > 0 && centenas == 0 && unidades == 0) {
        System.out.println(dezenas + " dezenas");
      }
      else if (unidades == 1 && unidades > 0 && centenas == 0 && dezenas == 0) {
        System.out.println(unidades + " unidade");
      }
      else if (unidades != 1 && unidades > 0 && centenas == 0 && dezenas == 0) {
        System.out.println(unidades + " unidades");
      }
    }
    else {
      System.out.println("Digite apenas valores menores que mil para que o programa possa continuar");
    }

    sc.close();

  }
}
