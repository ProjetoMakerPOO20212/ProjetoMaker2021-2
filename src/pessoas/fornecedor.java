package pessoas;

import produtos.Produto;

public class Fornecedor extends Pessoa {
    private String codigoFornecedor, cnpj;

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Fornecedor(){
    }
    
    public Fornecedor(String codigoFornecedor, String cnpj){
        this.codigoFornecedor = codigoFornecedor;
        this.cnpj = cnpj;
    }
    
    public Fornecedor(int codigo, String nome, String tipo, String cidade, 
            String bairro, String rua, String cep, int numero, 
            String codigoFornecedor, String cnpj){
        super(codigo, nome, tipo, cidade, bairro, rua, cep, numero);
        this.codigoFornecedor = codigoFornecedor;
        this.cnpj = cnpj;
    }
}