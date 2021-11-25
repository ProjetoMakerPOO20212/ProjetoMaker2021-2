/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administativo;


import java.util.ArrayList;
import java.util.Scanner;
import produtos.Produtos;

/**
 *
 * @author JAVA
 */
public abstract class Financeiro {
    
    private String CodOrdem;
    private String   data;
    private Double frete;
    private ArrayList<Produtos> listaProdutos;
    private Double total;
    
   public abstract ArrayList<Produtos> Carrinho(Produtos p);

    public String getCodOrdem() {
        return CodOrdem;
    }

    public void setCodOrdem(String CodOrdem) {
        this.CodOrdem = CodOrdem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public ArrayList<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produtos> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Financeiro(String CodOrdem, String data, Double frete, 
            ArrayList<Produtos> listaProdutos, Double total) {
        this.CodOrdem = CodOrdem;
        this.data = data;
        this.frete = frete;
        this.listaProdutos = listaProdutos;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Financeiro{" + "CodOrdem=" + CodOrdem + ", data=" + data 
                + ", frete=" + frete + ", listaProdutos=" + listaProdutos 
                + ", Total=" + total + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public void entrada(){
    
        Scanner ent = new Scanner(System.in);
        System.out.print("CodOrdem\t>>");
        this.CodOrdem = ent.nextLine();
        System.out.print("Data\t>>");
        this.data = ent.nextLine();
        System.out.print("Frete\t>>");
        this.frete = Double.parseDouble(ent.nextLine());
        System.out.print("Total\t>>");
        this.total = Double.parseDouble(ent.nextLine());
    
    }
   
   
    
    
    
}
