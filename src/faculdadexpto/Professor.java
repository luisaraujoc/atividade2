package faculdadexpto;

public class Professor {
    String nome, formacao, titulacao, descricaoMaterias;
    int cargaHoraria, salario;

    public Professor(String nome, String formacao, String titulacao, String descricaoMaterias, int cargaHoraria, int salario) { 
        // Construtor   
        // para criar um objeto Professor
        this.nome = nome;
        this.formacao = formacao;
        this.titulacao = titulacao;
        this.descricaoMaterias = descricaoMaterias;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }

    public void cadastrarProfessor(Professor professor) {
        this.nome = professor.nome;
        this.formacao = professor.formacao;
        this.titulacao = professor.titulacao;
        this.descricaoMaterias = professor.descricaoMaterias;
        this.cargaHoraria = professor.cargaHoraria;
        this.salario = professor.salario;
    }

    public void alterarCadastro(Professor professor) {
        this.nome = professor.nome;
        this.formacao = professor.formacao;
        this.titulacao = professor.titulacao;
        this.descricaoMaterias = professor.descricaoMaterias;
        this.cargaHoraria = professor.cargaHoraria;
        this.salario = professor.salario;
    }

    public void imprimirCadastro(Professor professor) {
        System.out.println("Nome: " + professor.nome);
        System.out.println("Formação: " + professor.formacao);
        System.out.println("Titulação: " + professor.titulacao);
        System.out.println("Descrição das matérias: " + professor.descricaoMaterias);
        System.out.println("Carga horária: " + professor.cargaHoraria);
        System.out.println("Salário: " + professor.salario);
    }
}
