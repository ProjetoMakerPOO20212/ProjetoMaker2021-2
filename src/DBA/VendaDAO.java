package DBA;

import administrativo.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.Math;
import pessoas.Usuario;
import produtos.Produto;


public class VendaDAO {
    public boolean addProduto(Venda v1) {
        AcessoBD acesso = new AcessoBD();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "INSERT into carrinhoCompra (codigo, codigoVenda, codigoUsuario, codigoBarra, "
                    + "nomeProduto, precoProduto, quantidadeComprada, precoTotal)"
                    + "VALUES("
                    + ""    + v1.getCodigo()   + ""
                    + ",'"  + v1.getCodigoVenda()   + "'"
                    + ",'"  + v1.getCodigoUsuario()   + "'"
                    + ",'"  + v1.getCodigoProduto()   + "'"    
                    + ",'"  + v1.getNomeProduto()   + "'"
                    + ","   + v1.getPrecoProduto()   + ""
                    + ","   + v1.getQuantidadeComprada()   + ""
                    + ","   + v1.getPrecoProduto() * v1.getQuantidadeComprada()   + ""
                    + ")";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Produto não adicionado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public Venda buscarVenda (String codigoVenda, String codigoBarra) {
        AcessoBD acesso = new AcessoBD();
        Venda v1 = new Venda();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from carrinhoCompra WHERE codigoVenda='" + codigoVenda.trim() + "' AND codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoBarra") != null) {
                        v1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        v1.setCodigoVenda(rs.getString("codigoVenda"));
                        v1.setCodigoUsuario(rs.getString("codigoUsuario"));
                        v1.setCodigoProduto(rs.getString("codigoBarra"));
                        v1.setNomeProduto(rs.getString("nomeProduto"));
                        v1.setPrecoProduto(Double.parseDouble(rs.getString("precoProduto")));
                        v1.setQuantidadeComprada(Integer.parseInt(rs.getString("quantidadeComprada")));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Venda não encontrada!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return v1;
    }
    
    public Venda buscarVendaC (String codigoVenda) {
        AcessoBD acesso = new AcessoBD();
        Venda v1 = new Venda();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from carrinhoCompra WHERE codigoVenda='" + codigoVenda.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoBarra") != null) {
                        v1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        v1.setCodigoVenda(rs.getString("codigoVenda"));
                        v1.setCodigoUsuario(rs.getString("codigoUsuario"));
                        v1.setCodigoProduto(rs.getString("codigoBarra"));
                        v1.setNomeProduto(rs.getString("nomeProduto"));
                        v1.setPrecoProduto(Double.parseDouble(rs.getString("precoProduto")));
                        v1.setQuantidadeComprada(Integer.parseInt(rs.getString("quantidadeComprada")));
                        v1.setPrecoTotal(Double.parseDouble(rs.getString("precoTotal")));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Venda não encontrada!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return v1;
    }
    
    public boolean buscarVendaCV (String codigoVenda) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Venda v1 = new Venda();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from carrinhoCompra WHERE codigoVenda='" + codigoVenda.trim() + "'";
                
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
    
    public boolean buscarVendaC (String codigoVenda, String codigoBarra) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Venda v1 = new Venda();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from carrinhoCompra WHERE codigoVenda='" + codigoVenda.trim() + "' AND codigoBarra='" + codigoBarra.trim() + "'";
                
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
    
    public boolean atualizarCarrinho(Venda v1) {
        AcessoBD acesso = new AcessoBD();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE carrinhoCompra SET codigoVenda='" + v1.getCodigoVenda() + 
                "', codigoUsuario='" + v1.getCodigoUsuario() + "', codigoBarra='" + v1.getCodigoProduto() + 
                "', nomeProduto='" + v1.getNomeProduto() + "', precoProduto=" + v1.getPrecoProduto() + 
                ", quantidadeComprada=" + v1.getQuantidadeComprada() + ", precoTotal=" + v1.getPrecoProduto() * v1.getQuantidadeComprada() + 
                " WHERE codigo=" + v1.getCodigo();
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Produto não adicionado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean removerProduto (Venda v1) {
        AcessoBD acesso = new AcessoBD();
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE carrinhoCompra SET codigoVenda='" + v1.getCodigoVenda() + 
                "', codigoUsuario='" + v1.getCodigoUsuario() + "', codigoBarra='" + v1.getCodigoProduto() + 
                "', nomeProduto='" + v1.getNomeProduto() + "', precoProduto=" + v1.getPrecoProduto() + 
                ", quantidadeComprada=" + v1.getQuantidadeComprada() + ", precoTotal=" + v1.getPrecoProduto() * v1.getQuantidadeComprada() + 
                " WHERE codigo=" + v1.getCodigo();
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                if (v1.getQuantidadeComprada() == 0) {
                    consulta = "DELETE from carrinhoCompra WHERE codigoVenda='" + v1.getCodigoVenda() + 
                    "' AND codigoBarra='" + v1.getCodigoProduto() + "'";
                    st = acesso.con.createStatement();
                    st.executeUpdate(consulta);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Produto não removido!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean limparCarrinho (String codigoVenda) {
        AcessoBD acesso = new AcessoBD();
        if (acesso.conectar()) {
            try {
                String consulta = "DELETE from carrinhoCompra WHERE codigoVenda='" + codigoVenda.trim() + "'";
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Carrinho não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public ArrayList<String> verCarrinho() {
    ArrayList<String> cr =null;
    AcessoBD acesso = new AcessoBD();
    Venda v1 = new Venda();
    ResultSet rs;
    
    if (acesso.conectar()) {
        try {
            String consulta = "select * from carrinhoCompra";
            PreparedStatement stm = acesso.con.prepareStatement(consulta);
            rs = stm.executeQuery();
            
            cr = new ArrayList();
            String linha = String.format("%6s|%15s|%17s|%20s|%20s|%13s|%10s|%11s", 
                    "Codigo", "Codigo de Venda", "Codigo de Usuario", "Codigo de Barra", 
                    "Nome Produto", "Preco Produto", "Quantidade", "Preco Total");
            cr.add(linha);
            
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("codigo")) > 0) {
                    v1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                    v1.setCodigoVenda(rs.getString("codigoVenda"));
                    v1.setCodigoUsuario(rs.getString("codigoUsuario"));
                    v1.setCodigoProduto(rs.getString("codigoBarra"));
                    v1.setNomeProduto(rs.getString("nomeProduto"));
                    v1.setPrecoProduto(Double.parseDouble(rs.getString("precoProduto")));
                    v1.setQuantidadeComprada(Integer.parseInt(rs.getString("quantidadeComprada")));
                    v1.setPrecoTotal(Double.parseDouble(rs.getString("precoTotal")));
                    
                    linha = String.format("%6s|%15s|%17s|%20s|%20s|%13s|%10s|%11s",
                            rs.getString("codigo"),
                            rs.getString("codigoVenda"),
                            rs.getString("codigoUsuario"),
                            rs.getString("codigoBarra"),
                            rs.getString("nomeProduto"),
                            rs.getString("precoProduto"),
                            rs.getString("quantidadeComprada"),
                            rs.getString("precoTotal"));
                    cr.add(linha);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lista não Gerada!");
            return cr;
        }
    }
        acesso.desconectar();
        return cr;
    }
    
    public double checaPreco (int codigoVenda) {
        
        double precoTotalVenda=0;
        AcessoBD acesso = new AcessoBD();
        Venda v1 = new Venda();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from carrinhoCompra WHERE codigoVenda=" + codigoVenda + "";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    if (rs.getString("codigoVenda") != null) {
                        v1.setPrecoTotal(Double.parseDouble(rs.getString("precoTotal")));
                        precoTotalVenda = precoTotalVenda + Double.parseDouble(rs.getString("precoTotal"));
                    }
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Compra não encontrada!";
                JOptionPane.showMessageDialog(null, mensagem);
                return 0;
            }
        }
        acesso.desconectar();
        return precoTotalVenda;
    }
    
    public boolean finalizarCarrinho (Venda v1, Usuario u1) {
        
        AcessoBD acesso = new AcessoBD();
        Produto p1 = new Produto();
        ProdutoDAO pd = new ProdutoDAO();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from carrinhoCompra WHERE codigoVenda='" + v1.getCodigoVenda() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    consulta = "INSERT into Venda (codigo, codigoVenda, codigoUsuario, codigoBarra, "
                            + "nomeProduto, precoProduto, quantidadeComprada, precoTotal, cidade, bairro,"
                            + "rua, numero, opcional, cep, cpf, numeroCartao, telefone)"
                            + "VALUES("
                            + ""    + rs.getString("codigo")   + ""
                            + ",'"   + rs.getString("codigoVenda")   + "'"
                            + ",'"  + rs.getString("codigoUsuario")   + "'"    
                            + ",'"  + rs.getString("codigoBarra")   + "'"
                            + ",'"  + rs.getString("nomeProduto")   + "'"
                            + ","  + rs.getString("precoProduto")   + ""
                            + ","   + rs.getString("quantidadeComprada")   + ""    
                            + ","   + rs.getString("precoTotal")   + ""
                            + ",'"   + u1.getEndereco().getCidade()  + "'"
                            + ",'"   + u1.getEndereco().getBairro()  + "'"
                            + ",'"   + u1.getEndereco().getRua()  + "'"
                            + ","   + u1.getEndereco().getNumero()  + ""
                            + ",'"   + u1.getOpcional()  + "'"
                            + ",'"   + u1.getEndereco().getCep()  + "'"
                            + ",'"   + u1.getCpf()  + "'"
                            + ",'"   + v1.getNumeroCartao()  + "'"
                            + ",'"   + v1.getTelefone()  + "'"
                            + ")";
                
                        Statement st = acesso.con.createStatement();
                        st.executeUpdate(consulta);
                        
                        p1 = pd.buscarProduto(rs.getString("codigoBarra"));
                        
                        consulta = "UPDATE Produto SET quantidadeEstoque= quantidadeEstoque - " +  rs.getString("quantidadeComprada")  + 
                        " WHERE codigoBarra='" + rs.getString("codigoBarra") + "'";
                        
                        st = acesso.con.createStatement();
                        st.executeUpdate(consulta);
                        
                        consulta = "UPDATE " + p1.getTipo() +  " SET quantidadeEstoque= quantidadeEstoque - " +  rs.getString("quantidadeComprada")  + 
                        " WHERE codigoBarra='" + rs.getString("codigoBarra") + "'";
                        
                        st = acesso.con.createStatement();
                        st.executeUpdate(consulta);
                }
                
                consulta = "DELETE FROM carrinhoCompra";

                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                v1.setCodigo(0);
                v1.setCodigoVenda("0");
                v1.setCodigoUsuario("0");
                v1.setCodigoProduto("0");
                v1.setNomeProduto("0");
                v1.setPrecoProduto(0);
                v1.setQuantidadeComprada(0);
                v1.setPrecoTotal(0);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Compra não encontrada!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
}