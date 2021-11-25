package produtos;

import java.util.Scanner;
import administativo.Estoque;

public class Produtos {
    private int codigo;
    private String nome, marca;
    private double preco;
    
    private Estoque estoque = new Estoque();
    
    public Estoque getEstoque(){
        return estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    public Produtos() {
    }
    
    public Produtos(int codigo, String nome, String marca, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
    
    public Produtos(int codigo, String nome, String marca, double preco,
        int qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        estoque.setQtdEstoque(qtdEstoque);
    }
    
    public void imprimir() {
    System.out.println("\n");
    System.out.println("Codigo: " + getCodigo());
    System.out.println("Nome: " + getNome());
    System.out.println("Marca: " + getMarca());
    System.out.println("Preco: " + getPreco());
    estoque.imprimir();
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    System.out.println("Codigo: ");
    setCodigo(Integer.parseInt(ent.nextLine()));
    System.out.println("Nome: ");
    setNome(ent.nextLine());
    System.out.println("Marca: ");
    setMarca(ent.nextLine());
    System.out.println("Preço: ");
    setPreco(Double.parseDouble(ent.nextLine()));
    estoque.entrada();
    }
}