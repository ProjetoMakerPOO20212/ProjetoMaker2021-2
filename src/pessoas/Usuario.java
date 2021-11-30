package pessoas;

public class Usuario extends Pessoa {
    private String codigoUsuario, email, senha, cpf, opcional, telefone;
    
    Endereco endereco = new Endereco();

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getOpcional() {
        return opcional;
    }

    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public pessoas.Endereco getEndereco() {
        return endereco;
    }
    
    public Usuario(){
    }
    
    public Usuario(String codigoUsuario, String email, String senha, String cpf, 
            String opcional, String telefone){
        this.codigoUsuario = codigoUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.opcional = opcional;
        this.telefone = telefone;
    }
    
    public Usuario(int codigo, String nome, String tipo, String cidade, String bairro, 
            String rua, String cep, int numero, String codigoUsuario, 
            String email, String senha, String cpf, String opcional,
            String telefone){
        super(codigo, nome, tipo, cidade, bairro, rua, cep, numero);
        this.codigoUsuario = codigoUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.opcional = opcional;
        this.telefone = telefone;
    }
}