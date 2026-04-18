package OrientadoObjetos.Projetos;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome = "Vinicius Augustin";
        double saldoInicial = 11000.0;

        String dadosCliente = """
                ***********************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: Corrente
                Saldo inicial: R$%.2f
                ***********************
                """.formatted(nome, saldoInicial);

        String menu = """
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Qual opção você escolhe?
                """;

        System.out.println(dadosCliente);
        System.out.println(menu);

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Seu saldo atual: R$%.2f\n", saldoInicial);
                break;

            case 2:
                System.out.println("Informe o valor a receber: ");
                double saldo = entrada.nextDouble();

                saldoInicial += saldo;

                System.out.printf("Saldo atual: R$%.2f\n", saldoInicial);
                break;

            case 3:
                System.out.println("Informe o valor a transferir: ");
                double valor = entrada.nextDouble();

                saldoInicial -= valor;

                System.out.printf("Saldo atual: R$%.2f\n", saldoInicial);
                break;

            case 4:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}