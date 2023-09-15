import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scanner);

            if (opcao == 1) {
               consultarContato(scanner, agenda); 
            } else if (opcao == 2) {
                adicionarContato(scanner, agenda);
            }
        }

    }

   public static void adicionarContato(Scanner scanner, Agenda agenda) {
        System.out.println("Criando um contato. Entre com as informações");
        String nome = leInformacaoString("Entre com o nome do contato", scanner);
        String telefone = leInformacaoString("Entre com o nome do telefone", scanner);
        String email = leInformacaoString("Entre com o nome do email", scanner);

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        System.out.println("Contato a ser criado: ");
        System.out.println(contato);

        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
   } 

    public static void consultarContato(Scanner scanner, Agenda agenda) {
            String nomeContato = leInformacaoString("Entre com o nome do contato a ser pesquisado", scanner);
            try {
                if (agenda.consultaContato(nomeContato) >= 0) {
                    System.out.println("Contato existe");
                }
            } catch (ContatoNaoExisteException e) {
                System.out.println(e.getMessage());
            }
    }

    public static String leInformacaoString(String msg, Scanner scanner) {
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scanner) {
        int opcao = 3;
        boolean entradaValida = false;

        while(!entradaValida) {

            System.out.println("Digite a opção desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
             System.out.println("3: Sair");

            try {
                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                }
                else {
                    throw new Exception("Entrada inválida");
                }
            }
            catch(Exception e) {
                System.out.println("Entrada Inválida, Digite novamente!\n");
            }
        }

        return opcao;
    }
}
