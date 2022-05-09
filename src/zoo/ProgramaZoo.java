package zoo;

import java.util.Scanner;

public class ProgramaZoo {
    
    public static void main() {
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
        String nome, especie, localDeNascimento, dataDeNascimento, dd, mm, yyyy;
        int numeroDeRegistro;

        System.out.println("Digite o nome do animal:");
        nome = sc.nextLine();

        System.out.println("Digite a especie do animal:");
        especie = sc.nextLine();

        System.out.println("Digite o local de nascimento do animal:");
        localDeNascimento = sc.nextLine();

        System.out.println("Digite o dia de nascimento do animal:");
        dd = sc.nextLine();

        System.out.println("Digite o mês de nascimento do animal:");
        mm = sc.nextLine();

        System.out.println("Digite o ano de nascimento do animal:");
        yyyy = sc.nextLine();

        dataDeNascimento = data(dd, mm, yyyy);

        System.out.println("Digite o número de registro do animal:");
        numeroDeRegistro = sc.nextInt();


        Zoo animal = new Zoo(nome, especie, localDeNascimento, dataDeNascimento, numeroDeRegistro);
        animal.cadatrarAnimal(animal);
        Zoo.imprimirCadastro(animal);

        sc.close();
    }

    public static void alterar() {
        Scanner sc = new Scanner(System.in);

        String nome, especie, localDeNascimento, dataDeNascimento, dd, mm, yyyy;
        int numeroDeRegistro;

        System.out.println("Digite o nome do animal:");
        nome = sc.nextLine();

        System.out.println("Digite a especie do animal:");
        especie = sc.nextLine();

        System.out.println("Digite o local de nascimento do animal:");
        localDeNascimento = sc.nextLine();

        System.out.println("Digite o dia de nascimento do animal:");
        dd = sc.nextLine();

        System.out.println("Digite o mês de nascimento do animal:");
        mm = sc.nextLine();

        System.out.println("Digite o ano de nascimento do animal:");
        yyyy = sc.nextLine();

        dataDeNascimento = data(dd, mm, yyyy);


        System.out.println("Digite o número de registro do animal:");
        numeroDeRegistro = sc.nextInt();

        Zoo animal = new Zoo(nome, especie, localDeNascimento, dataDeNascimento, numeroDeRegistro);
        animal.alterarCadastro(animal);
        Zoo.imprimirCadastro(animal);

        sc.close();
    }
    
    public static String data(String dd, String MM, String yyyy){
        String date = dd + "/" + MM + "/" + yyyy;

        return date;
    }
}



// vamboraaaaaaaaa