package administrativo;

import pessoas.Endereco;

public class Venda extends CarrinhoCompra {
    Endereco endereco = new Endereco();
    String cpf, numeroCartao, telefone;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public Venda() {
    }
    
    public Venda(String cidade, String bairro, String rua, String cep, 
            int numero, String cpf, String numeroCartao, String telefone) {
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setCep(cep);
        endereco.setNumero(numero);
        this.cpf = cpf;
        this.numeroCartao = numeroCartao;
        this.telefone = telefone;
    }
    
    public Venda(int codigo, String codigoVenda, String codigoUsuario, 
            String codigoProduto, int quantidadeComprada, String nomeProduto, 
            double precoProduto, double precoTotal, double precoTotalCarrinho, 
            String cidade, String bairro, String rua, String cep, int numero,
            String cpf, String numeroCartao) {
        super(codigo, codigoVenda, codigoUsuario, codigoProduto, 
              quantidadeComprada, nomeProduto, precoProduto, precoTotal);
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setCep(cep);
        endereco.setNumero(numero);
        this.cpf = cpf;
        this.numeroCartao = numeroCartao;
        this.telefone = telefone;
    }
}