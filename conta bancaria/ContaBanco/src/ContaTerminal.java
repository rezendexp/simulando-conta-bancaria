import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do scanner para leitura dos dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Para ler uma linha de texto após um número, devemos adicionar scanner.nextLine() para consumir a quebra de linha
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem formatada com os dados inseridos
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );
        System.out.println(mensagem);

        // Fechamento do scanner
        scanner.close();
    }
}
