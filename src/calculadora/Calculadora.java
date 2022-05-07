package calculadora;

public class Calculadora {
    public static float calc(float numero, float numero2, int operacao) {
        switch (operacao) {
            float resultado = 0;
            case 1:
                float resultado = numero + numero2;
                break;
            case 2:
                float resultado = numero - numero2;
                break;
            case 3:
                float resultado = numero * numero2;
                break;
            case 4:
                float resultado = numero / numero2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        return resultado;
    }
}
