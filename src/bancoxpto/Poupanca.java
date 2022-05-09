package bancoxpto;

public class Poupanca {
    private String nomeCorrentista;
    private int cpfCorrentista, rgCorrentista, numeroAgencia, numeroConta;
    private double saldo;

    public Poupanca(String nomeCorrentista, int cpfCorrentista, int rgCorrentista, int numeroAgencia, int numeroConta, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.cpfCorrentista = cpfCorrentista;
        this.rgCorrentista = rgCorrentista;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public static void cadastrarPoupanca(Poupanca poup) {
        this.nomeCorrentista = poup.nomeCorrentista;
        this.cpfCorrentista = poup.cpfCorrentista;
        this.rgCorrentista = poup.rgCorrentista;
        this.numeroAgencia = poup.numeroAgencia;
        this.numeroConta = poup.numeroConta;
        this.saldo = poup.saldo;
    }

    public static void alterarPoupanca(String nomeCorrentista, int cpfCorrentista, int rgCorrentista, int numeroAgencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.cpfCorrentista = cpfCorrentista;
        this.rgCorrentista = rgCorrentista;
        this.numeroAgencia = numeroAgencia;
    }

    public void imprimirPoupanca(Poupanca poup) {
        System.out.println("Nome do correntista: " + poup.nomeCorrentista);
        System.out.println("CPF do correntista: " + poup.cpfCorrentista);
        System.out.println("RG do correntista: " + poup.rgCorrentista);
        System.out.println("Numero da agencia: " + poup.numeroAgencia);
        System.out.println("Numero da conta: " + poup.numeroConta);
        System.out.println("Saldo: " + poup.saldo);
    }

}
