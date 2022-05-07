package empresaxpto;

public class Funcionario {
    private String nome, naturalidade, dataDeNascimento, profissao, grauDeInstrucao;
    int matricula, RG, CPF;
    double salario;

    public Funcionario(String nome, String naturalidade, String dataDeNascimento, String profissao, String grauDeInstrucao, int matricula, int RG, int CPF, double salario) {
        this.nome = nome;
        this.naturalidade = naturalidade;
        this.dataDeNascimento = dataDeNascimento;
        this.profissao = profissao;
        this.grauDeInstrucao = grauDeInstrucao;
        this.matricula = matricula;
        this.RG = RG;
        this.CPF = CPF;
        this.salario = salario;
    }

    


    public void cadastrarFuncionario(String nome, String naturalidade, String dataDeNascimento, String profissao, String grauDeInstrucao, int matricula, int RG, int CPF, double salario) {
        Funcionario func = new Funcionario(nome, naturalidade, dataDeNascimento, profissao, grauDeInstrucao, matricula, RG, CPF, salario);
    }

    public void alterarFuncionario(String nome, String naturalidade, String dataDeNascimento, String profissao, String grauDeInstrucao, int matricula, int RG, int CPF, double salario) {
        Funcionario func = new Funcionario(nome, naturalidade, dataDeNascimento, profissao, grauDeInstrucao, matricula, RG, CPF, salario);
    }

    public void imprimirFuncionario(String nome, String naturalidade, String dataDeNascimento, String profissao, String grauDeInstrucao, int matricula, int RG, int CPF, double salario) {
        System.out.println("Nome: "+ getNome());
        System.out.println("Naturalidade: " + getNaturalidade());
        System.out.println("Data de nascimento: " + getDataDeNascimento());
        System.out.println("Profissão: " + getProfissao());
        System.out.println("Grau de instrução: " + getGrauDeInstrucao());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("RG: " + getRG());
        System.out.println("CPF: " + getCPF());
        System.out.println("Salário: " + getSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getGrauDeInstrucao() {
        return grauDeInstrucao;
    }

    public void setGrauDeInstrucao(String grauDeInstrucao) {
        this.grauDeInstrucao = grauDeInstrucao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
