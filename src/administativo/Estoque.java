package administativo;

import java.util.Scanner;

public class Estoque {
    private int qtdEstoque;

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public Estoque() {
    }
    
    public Estoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public void imprimir() {
    System.out.println("\n");
    System.out.println("Quantidade em estoque: " + getQtdEstoque());
    }
    
    public void entrada() {
    Scanner ent = new Scanner(System.in);
    System.out.println("Quantidade em estoque: ");
    setQtdEstoque(Integer.parseInt(ent.nextLine()));
    }
}