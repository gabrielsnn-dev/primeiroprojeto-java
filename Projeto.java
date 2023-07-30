import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {

        // Dados iniciais do cliente

        String nomeCliente = "Gabriel de Almeida Senna";
        double saldo = 2350.00;
        String tipoDeConta = "Corrente";
        int opcaoDesejada = 0;

        // Inicialização do programa

        System.out.println("*************************************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**************************************");

        // Menu de operações

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo 
                2 - Transferir valor 
                3 - Receber valor 
                4 - Sair
                
                
                """;

        Scanner leitor = new Scanner(System.in);

        // Loop while para exibir o menu caso a opção escolhida não for o número 4 para sair do programa.

        while (opcaoDesejada != 4) {
            System.out.println(menu);
            opcaoDesejada = leitor.nextInt();

            if (opcaoDesejada == 1) {
                System.out.println("Seu saldo é R$ " + saldo);
            } else if (opcaoDesejada == 2) {
                System.out.println("Digite o valor que deseja transferir ");
                double valorTransferido = leitor.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Não foi possivel transferir, pois o valor é maior que o saldo atual.");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Seu novo saldo é de: R$ " + saldo);
                }
            } else if (opcaoDesejada == 3) {
                System.out.println("Digite o valor do depósito: ");
                double valorRecebido = leitor.nextDouble();
                saldo += valorRecebido;

                System.out.println("Seu novo saldo é de:" + saldo);
            }
        }
}   }
