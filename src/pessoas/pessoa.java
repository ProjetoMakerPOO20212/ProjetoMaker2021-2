package pessoas;

public class Pessoa {
    private int codigo;
    private String nome, tipo;
    
    Endereco endereco = new Endereco();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public Pessoa(){
    }
    
    public Pessoa(int codigo, String nome, String tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public Pessoa(int codigo, String nome, String tipo, String cidade, 
            String bairro, String rua, String cep, int numero){
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setCep(cep);
        endereco.setNumero(numero);
    }
}