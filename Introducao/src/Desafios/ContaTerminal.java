package Desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {

    int conta;
    String agencia, nomeCliente;
    double saldo = 1200.50;

    Scanner in = new Scanner(System.in);

    System.out.println("Digite o número da conta: ");
    conta = in.nextInt();

    System.out.println("Digite o número da agência: ");
    agencia = in.next();

    System.out.println("Informe seu nome: ");
    nomeCliente = in.next();

    String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque.",
    nomeCliente, agencia, conta, saldo);

    System.out.println(mensagem);



    

}
}
