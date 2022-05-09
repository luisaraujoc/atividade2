package zoo;

public class Zoo {
    String nome, especie, localDeNascimento, dataDeNascimento;
    int numeroDeRegistro = 0;


    public Zoo(String nome, String especie, String localDeNascimento, String dataDeNascimento, int numeroDeRegistro) {
        this.nome = nome;
        this.especie = especie;
        this.localDeNascimento = localDeNascimento;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDeRegistro = numeroDeRegistro++;
    }

    public void cadatrarAnimal(Zoo animal) {
        this.nome = animal.nome;
        this.especie = animal.especie;
        this.localDeNascimento = animal.localDeNascimento;
        this.dataDeNascimento = animal.dataDeNascimento;
        this.numeroDeRegistro = animal.numeroDeRegistro;
    }

    public void alterarCadastro(Zoo animal) {
        this.nome = animal.nome;
        this.especie = animal.especie;
        this.localDeNascimento = animal.localDeNascimento;
        this.dataDeNascimento = animal.dataDeNascimento;
        this.numeroDeRegistro = animal.numeroDeRegistro;
    }

    public static void imprimirCadastro(Zoo animal) {
        System.out.println("Nome: " + animal.nome);
        System.out.println("Especie: " + animal.especie);
        System.out.println("Local de nascimento: " + animal.localDeNascimento);
        System.out.println("Data de nascimento: " + animal.dataDeNascimento);
        System.out.println("Número de registro: " + animal.numeroDeRegistro);
    }

}
