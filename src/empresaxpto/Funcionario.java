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

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.nome = funcionario.nome;
        this.naturalidade = funcionario.naturalidade;
        this.dataDeNascimento = funcionario.dataDeNascimento;
        this.profissao = funcionario.profissao;
        this.grauDeInstrucao = funcionario.grauDeInstrucao;
        this.matricula = funcionario.matricula;
        this.RG = funcionario.RG;
        this.CPF = funcionario.CPF;
        this.salario = funcionario.salario;
    }

    public void alterarFuncionario(Funcionario funcionario) {
        this.nome = funcionario.nome;
        this.naturalidade = funcionario.naturalidade;
        this.dataDeNascimento = funcionario.dataDeNascimento;
        this.profissao = funcionario.profissao;
        this.grauDeInstrucao = funcionario.grauDeInstrucao;
        this.matricula = funcionario.matricula;
        this.RG = funcionario.RG;
        this.CPF = funcionario.CPF;
        this.salario = funcionario.salario;
    }

    public void imprimirFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Naturalidade: " + funcionario.naturalidade);
        System.out.println("Data de nascimento: " + funcionario.dataDeNascimento);
        System.out.println("Profissão: " + funcionario.profissao);
        System.out.println("Grau de instrução: " + funcionario.grauDeInstrucao);
        System.out.println("Matricula: " + funcionario.matricula);
        System.out.println("RG: " + funcionario.RG);
        System.out.println("CPF: " + funcionario.CPF);
        System.out.println("Salario: " + funcionario.salario);
    }

    
}
