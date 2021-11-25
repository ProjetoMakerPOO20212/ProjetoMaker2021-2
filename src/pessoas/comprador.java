package pessoas;

import java.util.Scanner;

public class comprador extends pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public comprador(){
    }
    
    public comprador(int cnpj){
        this.cpf = cpf;
    }
    
    public comprador(int codigo, String nome, String cidade, String bairro, 
            String rua, String cep, String cpf){
        super(codigo, nome, cidade, bairro, rua, cep);
        this.cpf = cpf;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF: " + getCpf());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("CPF: ");
        setCpf(ent.nextLine());
    }
}