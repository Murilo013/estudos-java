import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double saldoInicial;
        String nome;

        ContaBancaria conta = new ContaBancaria();
        System.out.print("Insira seu nome:");
        nome = in.next();
        conta.setNome(nome);

        do {
            System.out.print("Valor de depósito na criação da conta:");
            saldoInicial = in.nextDouble();
            conta.setSaldo(saldoInicial);
        } while (saldoInicial <= 0);

        System.out.println("Conta criada");

        String opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Pagar Boleto");
            System.out.println("5 - Sacar Dinheiro");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");
            opcao = in.next();

            switch (opcao) {
                case "1":
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;

                case "2":
                    System.out.println("Cheque especial disponível: R$" + conta.getChequeEspecial());
                    break;

                case "3":
                    double deposito;
                    do {
                        System.out.print("Insira o valor a ser depositado: ");
                        deposito = in.nextDouble();
                    } while (deposito <= 0);
                    conta.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case "4":
                    double boleto;
                    do {
                        System.out.print("Insira o valor do boleto a ser pago: ");
                        boleto = in.nextDouble();
                    } while (boleto <= 0);
                    conta.retirar(boleto);
                    System.out.println("Boleto pago com sucesso!");
                    break;

                case "5":
                    double saque;
                    do {
                        System.out.print("Insira o valor a ser sacado: ");
                        saque = in.nextDouble();
                    } while (saque <= 0);
                    conta.retirar(saque);
                    System.out.println("Saque realizado com sucesso!");
                    break;

                case "6":
                    if (conta.getSaldo() < 0) {
                        System.out.println("Você está usando o cheque especial.");
                    } else {
                        System.out.println("Sua conta está com saldo positivo.");
                    }
                    break;

                case "0":
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("0"));

        in.close();
        System.out.println("Sistema encerrado.");
    }
}