package produtos;

import java.util.Scanner;

public class Monitores extends Produtos {
    private double freq, pol;
    private int entradas;

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public double getPol() {
        return pol;
    }

    public void setPol(double pol) {
        this.pol = pol;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    
    public Monitores() {
    }
    
    public Monitores(double freq, double pol, int entradas) {
        this.freq = freq;
        this.pol = pol;
        this.entradas = entradas;
    }
    
    public Monitores(int codigo, String nome, String marca, double preco,
        int qtdEstoque, double freq, double pol, int entradas) {
        super (codigo, nome, marca, preco, qtdEstoque);
        this.freq = freq;
        this.pol = pol;
        this.entradas = entradas;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Frequencia: " + getFreq());
        System.out.println("Polegadas: " + getPol());
        System.out.println("Entradas: " + getEntradas());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Frequencia: ");
        setFreq(Double.parseDouble(ent.nextLine()));
        System.out.println("Polegadas: ");
        setPol(Double.parseDouble(ent.nextLine()));
        System.out.println("Entradas: ");
        setEntradas(Integer.parseInt(ent.nextLine()));
    }
}