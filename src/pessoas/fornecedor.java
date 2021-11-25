package pessoas;

import java.util.Scanner;

public class fornecedor extends pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public fornecedor(){
    }
    
    public fornecedor(String cnpj){
        this.cnpj = cnpj;
    }
    
    public fornecedor(int codigo, String nome, String cidade, String bairro, 
            String rua, String cep, String cnpj){
        super(codigo, nome, cidade, bairro, rua, cep);
        this.cnpj = cnpj;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("CNPJ: " + getCnpj());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("CNPJ: ");
        setCnpj(ent.nextLine());
    }
}