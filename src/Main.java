import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Digite o seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite o tipo da sua conta bancaria: ");
        String tipoDeConta = leitura.nextLine();

        System.out.println("Digite o saldo da sua conta bancaria: ");
        double saldo = leitura.nextDouble();

        System.out.println("***********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println(" ");
        System.out.println("Nome:           " + nome);
        System.out.println("Tipo de conta   " + tipoDeConta);
        System.out.println("Saldo Inicial:  " + saldo + "R$");
        System.out.println("***********************************");

        String menu = """
                ---------------------------
                Digite sua opção:
                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                ---------------------------
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("O seu novo saldo é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
