package faculdadexpto;

import java.util.Scanner;

public class ProgramaFaculdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Deseja cadastrar um animal (1) ou alterar um animal (2)?");
        opcao = sc.nextInt();
        
        if (opcao == 1) {
            cadastrar();
        } else if (opcao == 2) {
            alterar();
        } else {
            System.out.println("Opção inválida!");
        }       

        sc.close();
    }

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);
        String nome, formacao, titulacao, descricaoMaterias;
        int cargaHoraria, salario;

        System.out.println("Digite o nome do professor:");
        nome = sc.nextLine();

        System.out.println("Digite a formação do professor:");
        formacao = sc.nextLine();

        System.out.println("Digite a titulação do professor:");
        titulacao = sc.nextLine();

        System.out.println("Digite a descrição das matérias:");
        descricaoMaterias = sc.nextLine();

        System.out.println("Digite a carga horária:");
        cargaHoraria = sc.nextInt();

        System.out.println("Digite o salário:");
        salario = sc.nextInt();

        Professor professor = new Professor(nome, formacao, titulacao, descricaoMaterias, cargaHoraria, salario);
        professor.imprimirCadastro(professor);

        sc.close();
    }

    public static void alterar() {
        Scanner sc = new Scanner(System.in);
        String nome, formacao, titulacao, descricaoMaterias;
        int cargaHoraria, salario;

        System.out.println("Digite o nome do professor:");
        nome = sc.nextLine();

        System.out.println("Digite a formação do professor:");
        formacao = sc.nextLine();

        System.out.println("Digite a titulação do professor:");
        titulacao = sc.nextLine();

        System.out.println("Digite a descrição das matérias:");
        descricaoMaterias = sc.nextLine();

        System.out.println("Digite a carga horária:");
        cargaHoraria = sc.nextInt();

        System.out.println("Digite o salário:");
        salario = sc.nextInt();

        Professor professor = new Professor(nome, formacao, titulacao, descricaoMaterias, cargaHoraria, salario);
        professor.imprimirCadastro(professor);

        sc.close();
    }
}