public class Novo extends Imovel {
    private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public Novo(String endereco, double preco, double adicional) {
        super();
        this.adicional = adicional;
        this.endereco = endereco;
        this.preco = preco * (1 + (this.adicional / 100));
    }
}
