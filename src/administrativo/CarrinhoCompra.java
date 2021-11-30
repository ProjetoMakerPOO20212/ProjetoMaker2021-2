package administrativo;

public class CarrinhoCompra {
    private int codigo, quantidadeComprada;
    private String codigoVenda, codigoUsuario, codigoProduto, nomeProduto;
    private double precoProduto, precoTotal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(String codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public CarrinhoCompra(){
    }
    
    public CarrinhoCompra(int codigo, String codigoVenda, String codigoUsuario, 
            String codigoProduto, int quantidadeComprada, String nomeProduto, 
            double precoProduto, double precoTotal){
        this.codigo = codigo;
        this.codigoVenda = codigoVenda;
        this.codigoUsuario = codigoUsuario;
        this.codigoProduto = codigoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.precoTotal = precoTotal;
    }
}