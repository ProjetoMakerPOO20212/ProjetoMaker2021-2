package administrativo;

public class Compra {
    private int codigo, codigoCompra, quantidadeSolicitada;
    private String codigoFornecedor, codigoProduto, 
            nomeFornecedor, nomeProduto, status;
    private double precoProduto, precoTotal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(int quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Compra(){
    }
    
    public Compra(int codigo, int codigoCompra, String codigoFornecedor, 
            String codigoProduto, int quantidadeSolicitada, String nomeFornecedor, 
            String nomeProduto, double precoProduto, double precoTotal, String status){
        
        this.codigo = codigo;
        this.codigoCompra = codigoCompra;
        this.codigoFornecedor = codigoFornecedor;
        this.codigoProduto = codigoProduto;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.precoTotal = precoTotal;
        this.status = status;
    }
}