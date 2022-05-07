package bancoxpto;

import java.util.Scanner;

public class ProgramaCarro {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Deseja cadastrar uma poupanca (1) ou alterar uma poupanca (2)?");
        opcao = sc.nextInt();

        if (opcao == 1)
        {
            cadastrarPoup();
        }else if (opcao == 2)
        {
            alterarPoup();
        }else{
            System.out.println("Opção inválida!");
        }
    }

    public static void cadastrarPoup() {
        Scanner sc = new Scanner(System.in);
        String nomeCorrentista;
        int cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta;


        System.out.println("Digite o nome do correntista:");
        nomeCorrentista = sc.nextLine();
        
        System.out.println("Digite o cpf do correntista:");
        cpfCorrentista = sc.nextInt();
        
        System.out.println("Digite o rg do correntista:");
        rgCorrentista = sc.nextInt();

        System.out.println("Digite o numero da agencia:");
        numeroAgencia = sc.nextInt();

        System.out.println("Digite o numero da conta:");
        numeroConta = sc.nextInt();

        System.out.println("Digite um valor para ser depositado no saldo da conta:");
        double saldo = sc.nextDouble();


        Poupanca.cadastrarPoupanca(nomeCorrentista, cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta, saldo);
        Poupanca.imprimirPoupanca(); //incompleta
        sc.close();

    }

    public static void alterarPoup() {
        Scanner sc = new Scanner(System.in);

        String nomeCorrentista;
        int cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta;
        double saldo;


        System.out.println("Digite o nome do correntista:");
        nomeCorrentista = sc.nextLine();

        System.out.println("Digite o cpf do correntista:");
        cpfCorrentista = sc.nextInt();

        System.out.println("Digite o rg do correntista:");
        rgCorrentista = sc.nextInt();

        System.out.println("Digite o numero da agencia:");
        numeroAgencia = sc.nextInt();

        System.out.println("Digite o numero da conta:");
        numeroConta = sc.nextInt();

        System.out.println("Digite um valor para ser depositado no saldo da conta:");
        saldo = sc.nextDouble();

        Poupanca.alterarPoupanca(nomeCorrentista, cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta, saldo);
        Poupanca.imprimirPoupanca(); //incompleta

        sc.close();
    }
}
