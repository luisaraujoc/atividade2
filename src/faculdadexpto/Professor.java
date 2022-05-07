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

    public void cadastrarProfessor(String nome, String formacao, String titulacao, String descricaoMaterias, int cargaHoraria, int salario) {
        Professor professor = new Professor(nome, formacao, titulacao, descricaoMaterias, cargaHoraria, salario);
    }

    public void alterarCadastro(String nome, String formacao, String titulacao, String descricaoMaterias, int cargaHoraria, int salario) {
        Professor professor = new Professor(nome, formacao, titulacao, descricaoMaterias, cargaHoraria, salario);
    }

    public void imprimirCadastro(Professor professor) {
        System.out.println("Nome: " + nome);
        System.out.println("Formação: " + formacao);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Descrição das matérias: " + descricaoMaterias);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Salário: " + salario);
    }
}
