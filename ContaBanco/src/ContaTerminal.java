import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /* TODO LIST
        * - Conhecer e importar a classe Scanner
        * - Exibir as mensagens para o nosso usuario
        * - Obter pela Scanner os valores digitados no terminal
        * - Exibir a mensagem conta criada
        * */

        // Declarando as variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in); // Criar o objeto "scanner" da classe Scanner

        System.out.println("Por favor, digite o numero da Agencia! ");
        numero = scanner.nextInt();

        scanner.nextLine(); // Fazer a quebra da linha

        System.out.println("Por favor, digite a Agencia! ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome! ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo! ");
        saldo = scanner.nextDouble();

        // Exibir
        System.out.println("Ola " + nomeCliente + "\nObrigado por criar uma conta em nosso banco!" + "\nSua agencia e: "
                + agencia + "\nconta: " + numero + "\nsaldo: " + saldo + " ja esta disponivel para saque!");
    }
}