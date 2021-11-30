package produtos;

public class Mouse extends Produto {
    private int dpi;
    private double peso;

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public Mouse(){
    }
    
    public Mouse(int dpi, double peso){
        this.dpi = dpi;
        this.peso = peso;
    }
    
    public Mouse(int codigo, String codigoBarra, String tipo, String nome, 
            String marca, double preco, int quantidadeEstoque,
            int dpi, double peso){
        super(codigo, codigoBarra, tipo, nome, marca, preco, quantidadeEstoque);
        this.dpi = dpi;
        this.peso = peso;
    }
}