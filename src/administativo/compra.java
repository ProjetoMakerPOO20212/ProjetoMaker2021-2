package administativo;

import java.util.Scanner;

public class compra {
    
    int codigo, codigoProduto, codigoFornecedor;
    private String nome, fornecedor;
    private int qtd;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public compra() {
    }
    
    public compra(String nome, String fornecedor, int qtd) {
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.qtd = qtd;
    }
    
    public void imprimir() {
    System.out.println("\n");
    System.out.println("Codigo: " + getCodigo());
    System.out.println("Codigo Produto: " + getCodigoProduto());
    System.out.println("Codigo Fornecedor: " + getCodigoFornecedor());
    System.out.println("Nome: " + getNome());
    System.out.println("Fornecedor: " + getFornecedor());
    System.out.println("Quantidade: " + getQtd());
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    System.out.println("Codigo: ");
    setCodigo(Integer.parseInt(ent.nextLine()));
    System.out.println("Codigo Produto: ");
    setCodigoProduto(Integer.parseInt(ent.nextLine()));
    System.out.println("Codigo Fornecedor: ");
    setCodigoProduto(Integer.parseInt(ent.nextLine()));
    System.out.println("Nome: ");
    setNome(ent.nextLine());
    System.out.println("Fornecedor: ");
    setFornecedor(ent.nextLine());
    System.out.println("Quantidade: ");
    setQtd(Integer.parseInt(ent.nextLine()));
    }
}