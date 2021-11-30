package administrativo;

public class Estoque {
    private int quantidadeEstoque;

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public Estoque(){
    }
    
    public Estoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
}