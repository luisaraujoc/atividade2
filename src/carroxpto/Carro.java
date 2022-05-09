package carroxpto;
public class Carro {
    private String cor, marca, modelo, tipoCombustivel, tipoCarro;
    private int numeroDePortas, anoDeFabricacao, quantidadeDisponivel;
    private int codigoDeFabricacao = 0;
    private double preco;
    
    public Carro(String cor, String marca, String modelo, String tipoCombustivel, String tipoCarro, int numeroDePortas, int codigoDeFabricacao, int quantidadeDisponivel, Double preco){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoCarro = tipoCarro;
        this.numeroDePortas = numeroDePortas;
        this.codigoDeFabricacao = codigoDeFabricacao++;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
    }
    
 
    public static void main() {
        // irra
    }

    public void cadrastrarCarro(Carro carro) {
        this.cor = carro.cor;
        this.marca = carro.marca;
        this.modelo = carro.modelo;
        this.tipoCombustivel = carro.tipoCombustivel;
        this.tipoCarro = carro.tipoCarro;
        this.numeroDePortas = carro.numeroDePortas;
        this.codigoDeFabricacao = carro.codigoDeFabricacao;
        this.quantidadeDisponivel = carro.quantidadeDisponivel;
        this.preco = carro.preco;
    }

    public void alterarCarro(Carro carro) {
        this.cor = carro.cor;
        this.marca = carro.marca;
        this.modelo = carro.modelo;
        this.tipoCombustivel = carro.tipoCombustivel;
        this.tipoCarro = carro.tipoCarro;
        this.numeroDePortas = carro.numeroDePortas;
        this.codigoDeFabricacao = carro.codigoDeFabricacao;
        this.quantidadeDisponivel = carro.quantidadeDisponivel;
        this.preco = carro.preco;
    }
    
    public void imprimirCarro(Carro carro) {
        System.out.println("Cor: " + carro.cor);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Tipo de combustível: " + carro.tipoCombustivel);
        System.out.println("Tipo de carro: " + carro.tipoCarro);
        System.out.println("Número de portas: " + carro.numeroDePortas);
        System.out.println("Código de fabricação: " + carro.codigoDeFabricacao);
    }

}

