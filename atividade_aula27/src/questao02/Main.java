package questao02;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    ContaCorrente contaCliente = new ContaCorrente();

    //simulando um banco de dados
    contaCliente.numeroConta = 98987237519L;
    contaCliente.saldo = 12000; 
    contaCliente.statusEspecial = true;
    contaCliente.limite = 20000;
   
    Scanner scanner = new Scanner(System.in);

    Long numeroConta;

    System.out.println("Seja bem-vindo ao banco!");

    boolean contaExiste = false;

    do {
      System.out.println("Insira o número da sua conta, por favor");
      numeroConta = scanner.nextLong();
      ContaCorrente.verificarNumeroConta(numeroConta, contaExiste);

      System.out.println();
      contaCliente.verificarChequeEspecial();
      System.out.println();
      System.out.println("Você gostaria de efetuar um saque ou simplesmente realizar um depósito?");
      System.out.println("(0) saque     |     (1) depósito");
      int escolha = scanner.nextInt();
      contaCliente.calcularSaqueOuDeposito(escolha);
    } while (contaExiste);

    scanner.close();

  }
}
