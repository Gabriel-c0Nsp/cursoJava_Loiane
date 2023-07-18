package questao02;

import java.util.Scanner;

public class ContaCorrente {

  Scanner scanner = new Scanner(System.in);

  private static long numeroConta;
  private double saldo;
  private boolean statusEspecial;
  private double limite;

  public ContaCorrente(long numeroConta, double saldo, boolean statusEspecial, double limite) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
    this.statusEspecial = statusEspecial;
    this.limite = limite;
  }

  public Scanner getScanner() {
    return scanner;
  }

  public void setScanner(Scanner scanner) {
    this.scanner = scanner;
  }

  public static long getNumeroConta() {
    return numeroConta;
  }

  public static void setNumeroConta(long numeroConta) {
    ContaCorrente.numeroConta = numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public boolean isStatusEspecial() {
    return statusEspecial;
  }

  public void setStatusEspecial(boolean statusEspecial) {
    this.statusEspecial = statusEspecial;
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

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
