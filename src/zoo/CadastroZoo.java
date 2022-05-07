package zoo;

public class CadastroZoo {
    String nome, especie, localDeNascimento, dataDeNascimento;
    int numeroDeRegistro = 0;


    public CadastroZoo(String nome, String especie, String localDeNascimento, String dataDeNascimento, int numeroDeRegistro) {
        this.nome = nome;
        this.especie = especie;
        this.localDeNascimento = localDeNascimento;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDeRegistro = numeroDeRegistro++;
    }

    public void cadatrarAnimal(String nome, String especie, String localDeNascimento, String dataDeNascimento, int numeroDeRegistro) {
        CadastroZoo animal = new CadastroZoo(nome, especie, localDeNascimento, dataDeNascimento, numeroDeRegistro);        
    }

    public void alterarCadastro(String nome, String especie, String localDeNascimento, String dataDeNascimento, int numeroDeRegistro) {
        CadastroZoo animal = new CadastroZoo(nome, especie, localDeNascimento, dataDeNascimento, numeroDeRegistro);
    }

    public static void imprimirCadastro(CadastroZoo animal) {
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Especie: " + animal.getEspecie());
        System.out.println("Local de nascimento: " + animal.getLocalDeNascimento());
        System.out.println("Data de nascimento: " + animal.getDataDeNascimento());
        System.out.println("Número de registro: " + animal.getNumeroDeRegistro());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getLocalDeNascimento() {
        return localDeNascimento;
    }

    public void setLocalDeNascimento(String localDeNascimento) {
        this.localDeNascimento = localDeNascimento;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public static void main(String[] args) {
        //irra
    }


}
