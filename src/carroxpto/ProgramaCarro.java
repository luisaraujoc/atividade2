package carroxpto;
import java.util.Scanner;

public class ProgramaCarro {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja cadastrar um carro ou alterar um carro? (C/A)");
        String opcao = sc.nextLine();

        if (opcao.equals("C")) {
            cadrastrarCar();
        } else if (opcao.equals("A")) {
            alterarCar();
        } else {
            System.out.println("Opção inválida!");
        }
        
    }


    public static void cadrastrarCar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cor do carro: ");
        String cor = sc.nextLine();

        System.out.println("Digite a marca do carro: ");
        String marca = sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o tipo de combustível do carro: ");
        String tipoCombustivel = sc.nextLine();

        System.out.println("Digite o tipo de carro: ");
        String tipoCarro = sc.nextLine();

        System.out.println("Digite o número de portas do carro: ");
        int numeroDePortas = sc.nextInt();

        System.out.println("Digite o código de fabricação do carro: ");
        int codigoDeFabricacao = sc.nextInt();

        System.out.println("Digite a quantidade disponível do carro: ");
        int quantidadeDisponivel = sc.nextInt();

        System.out.println("Digite o preço do carro: ");
        double preco = sc.nextDouble();

        Carro car = new Carro(cor, marca, modelo, tipoCombustivel, tipoCarro, numeroDePortas, codigoDeFabricacao, quantidadeDisponivel, preco);
        car.imprimirCarro(car);

        sc.close();
    }

    public static void alterarCar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nova cor do carro: ");
        String cor = sc.nextLine();

        System.out.println("Digite a nova marca do carro: ");
        String marca = sc.nextLine();

        System.out.println("Digite o nova modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o novo tipo de combustível do carro: ");
        String tipoCombustivel = sc.nextLine();

        System.out.println("Digite o novo tipo de carro: ");
        String tipoCarro = sc.nextLine();

        System.out.println("Digite o novo número de portas do carro: ");
        int numeroDePortas = sc.nextInt();

        System.out.println("Digite o novo código de fabricação do carro: ");
        int codigoDeFabricacao = sc.nextInt();

        System.out.println("Digite a novo quantidade disponível do carro: ");
        int quantidadeDisponivel = sc.nextInt();

        System.out.println("Digite o novo preço do carro: ");
        double preco = sc.nextDouble();

        Carro car = new Carro(cor, marca, modelo, tipoCombustivel, tipoCarro, numeroDePortas, codigoDeFabricacao, quantidadeDisponivel, preco);
        car.imprimirCarro(car);

        sc.close();
    }
}
