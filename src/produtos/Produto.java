package produtos;

import administrativo.Estoque;

public class Produto {
    private int codigo;
    private String codigoBarra, tipo, nome, marca;
    private double preco;
    
    Estoque estoque = new Estoque();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Estoque getEstoque() {
        return estoque;
    }
    
    public Produto(){
    }
    
    public Produto(int codigo, String codigoBarra, String tipo, String nome, 
            String marca, double preco){
        this.codigo = codigo;
        this.codigoBarra = codigoBarra;
        this.tipo = tipo;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
    
    public Produto(int codigo, String codigoBarra, String tipo, String nome, 
            String marca, double preco, int quantidadeEstoque){
        this.codigo = codigo;
        this.codigoBarra = codigoBarra;
        this.tipo = tipo;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        estoque.setQuantidadeEstoque(quantidadeEstoque);
    }
}