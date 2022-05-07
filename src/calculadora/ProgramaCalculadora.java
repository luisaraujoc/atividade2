package calculadora;
import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        float numero = scanner.nextFloat();

        System.out.println("Digite outro número: ");
        float numero2 = scanner.nextFloat();

        System.out.println("Que operação matemática deseja realizar com esses números?\n");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
        int operacao = scanner.nextInt();

        float resultado = Calculadora.calc(numero, numero2, operacao);

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();

    }
}



