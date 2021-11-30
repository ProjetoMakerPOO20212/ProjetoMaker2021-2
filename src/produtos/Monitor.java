package produtos;

public class Monitor extends Produto {
    private int frequencia, polegada, entrada;

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getPolegada() {
        return polegada;
    }

    public void setPolegada(int polegada) {
        this.polegada = polegada;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    
    public Monitor(){
    }
    
    public Monitor(int frequencia, int polegada, int entrada){
        this.frequencia = frequencia;
        this.polegada = polegada;
        this.entrada = entrada;
    }
    
    public Monitor(int codigo, String codigoBarra, String tipo, String nome, 
            String marca, double preco, int quantidadeEstoque, 
            int frequencia, int polegada, int entrada){
        super(codigo, codigoBarra, tipo, nome, marca, preco, quantidadeEstoque);
        this.frequencia = frequencia;
        this.polegada = polegada;
        this.entrada = entrada;
    }
}