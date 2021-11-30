package produtos;

public class Teclado extends Produto {
    private String modelo, cor;
    boolean rgb;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    
    public Teclado(){
    }
    
    public Teclado(String modelo, String cor,boolean rgb){
        this.modelo = modelo;
        this.cor = cor;
        this.rgb = rgb;
    }
    
    public Teclado(int codigo, String codigoBarra, String tipo, String nome, 
            String marca, double preco, int quantidadeEstoque, 
            String modelo, String cor,boolean rgb){
        super(codigo, codigoBarra, tipo, nome, marca, preco, quantidadeEstoque);
        this.modelo = modelo;
        this.cor = cor;
        this.rgb = rgb;
    }
}