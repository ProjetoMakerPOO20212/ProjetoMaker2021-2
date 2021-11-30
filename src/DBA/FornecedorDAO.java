package DBA;

import pessoas.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedorDAO {
    
    public Fornecedor buscarFornecedor(String codigoFornecedor) {
        
        AcessoBD acesso = new AcessoBD();
        Fornecedor f1 = new Fornecedor();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Fornecedor WHERE codigoFornecedor='" + codigoFornecedor.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoFornecedor") != null) {
                        f1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        f1.setTipo(rs.getString("tipo"));
                        f1.setCodigoFornecedor(rs.getString("codigoFornecedor"));
                        f1.setCnpj(rs.getString("cnpj"));
                        f1.setNome(rs.getString("nome"));
                        f1.getEndereco().setCidade(rs.getString("cidade"));
                        f1.getEndereco().setBairro(rs.getString("bairro"));
                        f1.getEndereco().setRua(rs.getString("rua"));
                        f1.getEndereco().setNumero(Integer.parseInt(rs.getString("numero")));
                        f1.getEndereco().setCep(rs.getString("cep"));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Fornecedor não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return f1;
    }
    
    public boolean buscarFornecedorC (String codigoFornecedor) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Fornecedor f1 = new Fornecedor();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Fornecedor WHERE codigoFornecedor='" + codigoFornecedor.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    resp = true;
                    String mensagem = "Codigo de Fornecedor já cadastrado!";
                    JOptionPane.showMessageDialog(null, mensagem);
                }
            } catch (Exception e) {
                e.printStackTrace();
                resp = false;
            }
        }
        acesso.desconectar();
        return resp;
    }
    
    public boolean buscarFornecedorC1 (String codigoFornecedor) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Fornecedor f1 = new Fornecedor();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Fornecedor WHERE codigoFornecedor='" + codigoFornecedor.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    resp = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                resp = false;
            }
        }
        acesso.desconectar();
        return resp;
    }
    
    public boolean cadastrarFornecedor(Fornecedor f1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "INSERT into Fornecedor (codigo, tipo, codigoFornecedor, cnpj, "
                    + "nome, cidade, bairro, rua, numero, cep)"
                    + "VALUES("
                    + ""    + f1.getCodigo()   + ""
                    + ",'"  + f1.getTipo()     + "'"
                    + ",'"  + f1.getCodigoFornecedor()   + "'"
                    + ",'"  + f1.getCnpj()     + "'"
                    + ",'"  + f1.getNome()     + "'"
                    + ",'"  + f1.getEndereco().getCidade()    + "'"
                    + ",'"  + f1.getEndereco().getBairro()    + "'"
                    + ",'"  + f1.getEndereco().getRua()    + "'"
                    + ","   + f1.getEndereco().getNumero()    + ""
                    + ",'"  + f1.getEndereco().getCep()    + "'"    
                    + ")";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Fornecedor não incluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean editarFornecedor(Fornecedor f1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE Fornecedor SET tipo='" + f1.getTipo() + 
                "', codigoFornecedor='" + f1.getCodigoFornecedor() +
                "', cnpj='" + f1.getCnpj() + "', nome='" + f1.getNome() + 
                "', cidade='" + f1.getEndereco().getCidade() + "', bairro='" + 
                f1.getEndereco().getBairro() + "', rua='" + f1.getEndereco().getRua() + 
                "', numero=" + f1.getEndereco().getNumero() + ", cep='" + f1.getEndereco().getCep() + 
                "' WHERE codigo=" + f1.getCodigo();
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Fornecedor não alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean removerFornecedor (Fornecedor f1) {
        AcessoBD acesso = new AcessoBD();
       
        if (acesso.conectar()) {
            try {
                String consulta = "DELETE from Fornecedor WHERE codigoFornecedor='" 
                + f1.getCodigoFornecedor() + "'";
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Fornecedor não excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public ArrayList<String> listarFornecedor() {
    ArrayList<String> fr =null;
    AcessoBD acesso = new AcessoBD();
    Fornecedor f1 = new Fornecedor();
    ResultSet rs;
    
    if (acesso.conectar()) {
        try {
            String consulta = "select * from Fornecedor";
            PreparedStatement stm = acesso.con.prepareStatement(consulta);
            rs = stm.executeQuery();
            
            fr = new ArrayList();
            String linha = String.format("%6s|%10s|%20s|%20s|%20s|%20s|%20s|%20s|%10s|%15s", 
                    "Codigo", "Tipo", "Codigo Fornecedor", "CNPJ", "Nome", "Cidade", "Bairro", "Rua",
                    "Numero", "CEP");
            fr.add(linha);
            
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("codigo")) > 0) {
                    f1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                    f1.setTipo(rs.getString("tipo"));
                    f1.setCodigoFornecedor(rs.getString("codigoFornecedor"));
                    f1.setCnpj(rs.getString("cnpj"));
                    f1.setNome(rs.getString("nome"));
                    f1.getEndereco().setCidade(rs.getString("cidade"));
                    f1.getEndereco().setBairro(rs.getString("bairro"));
                    f1.getEndereco().setRua(rs.getString("rua"));
                    f1.getEndereco().setNumero(Integer.parseInt(rs.getString("numero")));
                    f1.getEndereco().setCep(rs.getString("cep"));
                    
                    linha = String.format("%6s|%10s|%20s|%20s|%20s|%20s|%20s|%20s|%10s|%15s",
                            rs.getString("codigo"),
                            rs.getString("tipo"),
                            rs.getString("codigoFornecedor"),
                            rs.getString("cnpj"),
                            rs.getString("nome"),
                            rs.getString("cidade"),
                            rs.getString("bairro"),
                            rs.getString("rua"),
                            rs.getString("numero"),
                            rs.getString("cep"));
                    fr.add(linha);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lista não Gerada!");
            return fr;
        }
    }
        acesso.desconectar();
        return fr;
    }
}