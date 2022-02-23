public class Velho extends Imovel {
    private double desconto;

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public Velho(String endereco, double preco, double desconto) {
        super();
        this.desconto = desconto;
        this.endereco = endereco;
        this.preco = preco * (1 - (this.desconto / 100));
    }    
}
