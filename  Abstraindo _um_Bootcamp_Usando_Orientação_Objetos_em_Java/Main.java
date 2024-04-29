// Classe Produto
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

// Herança de Produto:
class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}

class Vestuario extends Produto {
    private String tamanho;

    public Vestuario(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }
}

class Loja {
    public void vender(Produto produto) {
        System.out.println("Vendido: " + produto.getNome() + " por R$" + produto.getPreco());
    }
}

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Notebook", 3500.0);
        Eletronico produto2 = new Eletronico("Smartphone", 2000.0, "Samsung");
        Vestuario produto3 = new Vestuario("Camiseta", 50.0, "M");

        Loja loja = new Loja();

        loja.vender(produto1);
        loja.vender(produto2);
        loja.vender(produto3);
    }
}