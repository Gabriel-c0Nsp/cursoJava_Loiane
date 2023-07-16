package questao02;

import java.util.Scanner;

public class ContaCorrente {

  Scanner scanner = new Scanner(System.in);

  static long numeroConta;
  double saldo;
  boolean statusEspecial;
  double limite;

  static boolean verificarNumeroConta(Long numeroConta, boolean contaExiste) {
    contaExiste = false;
    if (numeroConta == 98987237519L) {
      contaExiste = true;
      System.out.println("Seja bem vindo! Muito bom te ver de novo.");
    } else if (numeroConta == 98985041081L) {
      contaExiste = true;
      System.out.println("Seja bem vindo! Muito bom te ver de novo.");
    } else {
      contaExiste = false;
      System.out.println("Essa conta não existe");
    }
    return contaExiste;
  }

  void verificarChequeEspecial() {
    if (statusEspecial == true) {
      System.out.println("Opa, parece que você possui o nosso cheque especial, muito bem!");
    }
  }

  void calcularSaqueOuDeposito(int escolha) {
    double answer = 0;
    if (escolha == 0) {
      System.out.println("Este é o seu saldo atual: " + saldo);
      System.out.print("Insira o valor que deseja sacar: ");
      double saque = scanner.nextDouble();
      answer = saldo - saque;
      System.out.print("Saldo atual: " + answer);
    } else if (escolha == 1) {
      System.out.println("Este é o seu saldo atual: " + saldo);
      System.out.print("Insira o valor que deseja depositar na sua conta: ");
      double deposito = scanner.nextDouble();
      answer = saldo + deposito;
      System.out.print("Saldo atual: " + answer);
    }
  }
}
