package empresaxpto;

import java.util.Scanner;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja cadastrar um funcionário ou alterar um funcionário? (C/A)");
        String opcao = sc.nextLine();

        if (opcao.equals("C")) {
            cadastrar();
        } else if (opcao.equals("A")) {
            alterar();
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }

    public static void cadastrar(){
        Scanner sc = new Scanner(System.in);
        String nome, naturalidade, dataDeNascimento, profissao, grauDeInstrucao;
        int matricula, RG, CPF;
        double salario;

        System.out.println("Digite o nome do funcionario: ");
        nome = sc.nextLine();

        System.out.println("Digite a naturalidade do funcionario: ");
        naturalidade = sc.nextLine();

        System.out.println("Digite a data de nascimento do funcionario: ");
        dataDeNascimento = sc.nextLine();

        System.out.println("Digite a profissão do funcionario: ");
        profissao = sc.nextLine();

        System.out.println("Digite o grau de instrução do funcionario: ");
        grauDeInstrucao = sc.nextLine();

        System.out.println("Digite a matricula do funcionario: ");
        matricula = sc.nextInt();

        System.out.println("Digite o RG do funcionario: ");
        RG = sc.nextInt();

        System.out.println("Digite o CPF do funcionario: ");
        CPF = sc.nextInt();

        System.out.println("Digite o salario do funcionario: ");
        salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, naturalidade, dataDeNascimento, profissao, grauDeInstrucao, matricula, RG, CPF, salario);
        funcionario.cadastrarFuncionario(funcionario);

        funcionario.imprimirFuncionario(funcionario);

        sc.close();
    }

    public static void alterar(){
        Scanner sc = new Scanner(System.in);

        String nome, naturalidade, dataDeNascimento, profissao, grauDeInstrucao;
        int matricula, RG, CPF;
        double salario;

        System.out.println("Digite o nome do funcionario: ");
        nome = sc.nextLine();

        System.out.println("Digite a naturalidade do funcionario: ");
        naturalidade = sc.nextLine();

        System.out.println("Digite a data de nascimento do funcionario: ");
        dataDeNascimento = sc.nextLine();

        System.out.println("Digite a profissão do funcionario: ");
        profissao = sc.nextLine();

        System.out.println("Digite o grau de instrução do funcionario: ");
        grauDeInstrucao = sc.nextLine();

        System.out.println("Digite a matricula do funcionario: ");
        matricula = sc.nextInt();

        System.out.println("Digite o RG do funcionario: ");
        RG = sc.nextInt();

        System.out.println("Digite o CPF do funcionario: ");
        CPF = sc.nextInt();

        System.out.println("Digite o salario do funcionario: ");
        salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, naturalidade, dataDeNascimento, profissao, grauDeInstrucao, matricula, RG, CPF, salario);
        funcionario.alterarFuncionario(funcionario);

        funcionario.imprimirFuncionario(funcionario);

        sc.close();
    }
}
