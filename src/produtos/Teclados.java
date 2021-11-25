package produtos;

import java.util.Scanner;

public class Teclados extends Produtos {
    private String tipo, cor;
    private boolean rgb;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    
    public Teclados(){
    }
    
    public Teclados(String tipo, String cor, boolean rgb){
        this.tipo = tipo;
        this.cor = cor;
        this.rgb = rgb;
    }
    
    public Teclados(int codigo, String nome, String marca, double preco,
        int qtdEstoque, String tipo, String cor, boolean rgb) {
        super (codigo, nome, marca, preco, qtdEstoque);
        this.tipo = tipo;
        this.cor = cor;
        this.rgb = rgb;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + getTipo());
        System.out.println("Cor: " + getCor());
        System.out.println("RGB? " + getRgb());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Tipo: ");
        setTipo(ent.nextLine());
        System.out.println("Cor: ");
        setCor(ent.nextLine());
        System.out.println("RGB? ");
        setRgb(Boolean.parseBoolean(ent.nextLine()));
    }
}