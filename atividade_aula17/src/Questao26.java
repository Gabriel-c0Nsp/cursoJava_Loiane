import java.util.Scanner;

public class Questao16 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número total de eleitores");
    int numeroDeEleitores = scanner.nextInt();

    System.out.println();

    System.out.println("Esta eleição é composta por 3 candidatos");

    System.out.println("Digite 18 para votar no candidato Bolsounaro");
    System.out.println("Digite 23 para votar no candidato Polvo");
    System.out.println("Digite 33 para votar no candidato Siro");

    int voto;
    int votosCandidatoBolsounaro = 0;
    int votosCandidatoPolvo = 0;
    int votosCandidatoSiro = 0;

    System.out.println();

    for (int i = 1; i <= numeroDeEleitores; i++) {
      System.out.println("Eleitor " + i + ", insira o seu voto!");
      voto = scanner.nextInt();
        
        if (voto == 18) {
          votosCandidatoBolsounaro++;
        }
        else if (voto == 23) {
          votosCandidatoPolvo++;
        }
        else if (voto == 33) {
          votosCandidatoSiro++;
        }

      System.out.println("Obrigado por votar!");
      }

    System.out.println();

    System.out.println("O candidato Bolsounaro obteve " + votosCandidatoBolsounaro + " voto(s)");
    System.out.println("O candidato Polvo obteve " + votosCandidatoPolvo + " voto(s)");
    System.out.println("O candidato Siro obteve " + votosCandidatoSiro + " voto(s)");

    scanner.close();

    }
  }

