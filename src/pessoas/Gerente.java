package pessoas;

public class Gerente {
    private int codigo;
    private String user, senha;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Gerente(){
    }
    
    public Gerente(int codigo, String user, String senha){
        this.codigo = codigo;
        this.user = user;
        this.senha = senha;
    }
}