package bancoxpto;

public class Poupanca {
    String nomeCorrentista;
    int cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta;
    double saldo;

    public Poupanca(String nomeCorrentista, int cpfCorrentista, int rgCorrentista, int numeroAgencia, int numeroConta, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.cpfCorrentista = cpfCorrentista;
        this.rgCorrentista = rgCorrentista;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public static void cadastrarPoupanca(String nomeCorrentista, int cpfCorrentista, int rgCorrentista, int numeroAgencia, int numeroConta, double saldo) {
        Poupanca poup = new Poupanca(nomeCorrentista, cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta, saldo);
    }

    public void alterarPoupanca(String nomeCorrentista, int cpfCorrentista, int rgCorrentista, int numeroAgencia, int numeroConta, double saldo) {
        Poupanca poup = new Poupanca(nomeCorrentista, cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta, saldo);
    }

    public void imprimirPoupanca(Poupanca poup) {
        System.out.println("Nome do correntista: " + nomeCorrentista);
        System.out.println("CPF do correntista: " + cpfCorrentista);
        System.out.println("RG do correntista: " + rgCorrentista);
        System.out.println("Número da agência: " + numeroAgencia);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

}
