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

    public void cadrastrarCarro(String cor, String marca, String modelo, String tipoCombustivel, String tipoCarro, int numeroDePortas, int codigoDeFabricacao, int quantidadeDisponivel, Double preco) {
        Carro car = new Carro(cor, marca, modelo, tipoCombustivel, tipoCarro, numeroDePortas, codigoDeFabricacao, quantidadeDisponivel, preco);
    }

    public void alterarCarro(String cor, String marca, String modelo, String tipoCombustivel, String tipoCarro, int numeroDePortas, int codigoDeFabricacao, int quantidadeDisponivel, Double preco) {
        Carro car = new Carro(cor, marca, modelo, tipoCombustivel, tipoCarro, numeroDePortas, codigoDeFabricacao, quantidadeDisponivel, preco);
    }
    
    public void imprimirCarro(Carro carro) {
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Tipo de combustível: " + carro.getTipoCombustivel());
        System.out.println("Tipo de carro: " + carro.getTipoCarro());
        System.out.println("Número de portas: " + carro.getNumeroDePortas());
        System.out.println("Código de fabricação: " + carro.getCodigoDeFabricacao());        
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getTipoCombustivel() {
        return tipoCombustivel;
    }


    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getCodigoDeFabricacao() {
        return codigoDeFabricacao;
    }

    public void setCodigoDeFabricacao(int codigoDeFabricacao) {
        this.codigoDeFabricacao = codigoDeFabricacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}

