public class Imovel {
    protected String endereco;
    protected double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setEndereco(String end) {
        this.endereco = end;
    }

    public String getEndereco() {
        return endereco;
    }
    public double getPreco() {
        return preco;
    }

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public Imovel() {
    }
}