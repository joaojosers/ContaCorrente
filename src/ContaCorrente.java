import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String cliente = "Pedro Malazartes";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + cliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + saldo);

        int opcao;
        do {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cliente " + cliente + " possui saldo de: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor a ser recebido: ");
                    double valorRecebido = leitor.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;

                case 3:
                    System.out.print("Digite o valor a ser transferido: ");
                    double valorTransferencia = leitor.nextDouble();
                    if (saldo >= valorTransferencia) {
                        saldo -= valorTransferencia;
                        System.out.println("Transferência realizada. Saldo restante: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para a transferência.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        leitor.close();
    }
}
