package DBA;

import administrativo.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.Math;


public class CompraDAO {
    public boolean solicitarProduto(Compra c1) {
        AcessoBD acesso = new AcessoBD();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "INSERT into Compra (codigo, codigoCompra, codigoFornecedor, nomeFornecedor, "
                    + "codigoBarra, nomeProduto, precoProduto, quantidadeSolicitada, precoTotal, status)"
                    + "VALUES("
                    + ""    + c1.getCodigo()   + ""
                    + ","   + c1.getCodigoCompra()   + ""
                    + ",'"  + c1.getCodigoFornecedor()   + "'"    
                    + ",'"  + c1.getNomeFornecedor()   + "'"
                    + ",'"  + c1.getCodigoProduto()   + "'"
                    + ",'"  + c1.getNomeProduto()   + "'"
                    + ","   + c1.getPrecoProduto()   + ""    
                    + ","   + c1.getQuantidadeSolicitada()   + ""
                    + ","   + c1.getPrecoProduto() * c1.getQuantidadeSolicitada()  + ""
                    + ",'"  + c1.getStatus()   + "'"    
                    + ")";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Solicitacao não incluída!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean buscarCompraC (int codigoCompra) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Compra c1 = new Compra();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Compra WHERE codigoCompra=" + codigoCompra + "";
                
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
    
    public Compra buscarCompra (int codigoCompra) {
        
        AcessoBD acesso = new AcessoBD();
        Compra c1 = new Compra();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Compra WHERE codigoCompra=" + codigoCompra + "";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoCompra") != null) {
                        c1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        c1.setCodigoCompra(Integer.parseInt(rs.getString("codigoCompra")));
                        c1.setCodigoFornecedor(rs.getString("codigoFornecedor"));
                        c1.setNomeFornecedor(rs.getString("nomeFornecedor"));
                        c1.setCodigoProduto(rs.getString("codigoBarra"));
                        c1.setNomeProduto(rs.getString("nomeProduto"));
                        c1.setPrecoProduto(Double.parseDouble(rs.getString("precoProduto")));
                        c1.setQuantidadeSolicitada(Integer.parseInt(rs.getString("quantidadeSolicitada")));
                        c1.setPrecoTotal(Double.parseDouble(rs.getString("precoTotal")));
                        c1.setStatus(rs.getString("status"));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Compra não encontrada!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return c1;
    }
    
    public boolean addProduto(Compra c1) {
        AcessoBD acesso = new AcessoBD();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "INSERT into Compra (codigo, codigoCompra, codigoFornecedor, nomeFornecedor, "
                    + "codigoBarra, nomeProduto, precoProduto, quantidadeSolicitada, precoTotal, status)"
                    + "VALUES("
                    + ""    + c1.getCodigo()   + ""
                    + ","   + c1.getCodigoCompra()   + ""
                    + ",'"  + c1.getCodigoFornecedor()   + "'"    
                    + ",'"  + c1.getNomeFornecedor()   + "'"
                    + ",'"  + c1.getCodigoProduto()   + "'"
                    + ",'"  + c1.getNomeProduto()   + "'"
                    + ","   + c1.getPrecoProduto()   + ""    
                    + ","   + c1.getQuantidadeSolicitada()   + ""
                    + ","   + c1.getPrecoProduto() *  c1.getQuantidadeSolicitada()  + ""
                    + ",'"  + c1.getStatus()   + "'"
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
    
    public double finalizarCompra (int codigoCompra) {
        
        double precoTotalCompra=0;
        AcessoBD acesso = new AcessoBD();
        Compra c1 = new Compra();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Compra WHERE codigoCompra=" + codigoCompra + "";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    if (rs.getString("codigoCompra") != null) {
                        c1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        c1.setCodigoCompra(Integer.parseInt(rs.getString("codigoCompra")));
                        c1.setCodigoFornecedor(rs.getString("codigoFornecedor"));
                        c1.setNomeFornecedor(rs.getString("nomeFornecedor"));
                        c1.setCodigoProduto(rs.getString("codigoBarra"));
                        c1.setNomeProduto(rs.getString("nomeProduto"));
                        c1.setPrecoProduto(Double.parseDouble(rs.getString("precoProduto")));
                        c1.setQuantidadeSolicitada(Integer.parseInt(rs.getString("quantidadeSolicitada")));
                        c1.setPrecoTotal(Double.parseDouble(rs.getString("precoTotal")));
                        c1.setStatus("Em andamento");
                        
                        precoTotalCompra = precoTotalCompra + Double.parseDouble(rs.getString("precoTotal"));
                        
                        consulta = "INSERT into HistoricoPedidos (codigo, codigoCompra, codigoFornecedor, nomeFornecedor, "
                            + "codigoBarra, nomeProduto, precoProduto, quantidadeSolicitada, precoTotal, status)"
                            + "VALUES("
                            + ""    + c1.getCodigo()   + ""
                            + ","   + c1.getCodigoCompra()   + ""
                            + ",'"  + c1.getCodigoFornecedor()   + "'"    
                            + ",'"  + c1.getNomeFornecedor()   + "'"
                            + ",'"  + c1.getCodigoProduto()   + "'"
                            + ",'"  + c1.getNomeProduto()   + "'"
                            + ","   + c1.getPrecoProduto()   + ""    
                            + ","   + c1.getQuantidadeSolicitada()   + ""
                            + ","   + c1.getPrecoProduto() *  c1.getQuantidadeSolicitada()  + ""
                            + ",'"  + c1.getStatus()   + "'"
                            + ")";
                
                        Statement st = acesso.con.createStatement();
                        st.executeUpdate(consulta);
                        
                        consulta = "DELETE from Compra WHERE codigoCompra=" + codigoCompra + "";
                        st = acesso.con.createStatement();
                        st.executeUpdate(consulta);
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
        return precoTotalCompra;
    }
    
    public ArrayList<String> listarPedidos() {
    ArrayList<String> pr =null;
    AcessoBD acesso = new AcessoBD();
    Compra c1 = new Compra();
    ResultSet rs;
    
    if (acesso.conectar()) {
        try {
            String consulta = "select * from HistoricoPedidos";
            PreparedStatement stm = acesso.con.prepareStatement(consulta);
            rs = stm.executeQuery();
            
            pr = new ArrayList();
            String linha = String.format("%6s|%13s|%20s|%20s|%20s|%20s|%20s|%21s|%11s|%15s",
                    "Codigo", "Codigo Compra", "Codigo Fornecedor", "Nome Fornecedor", 
                    "Codigo Produto", "Nome Produto", "Preco Produto", "Quantidade Solicitada",
                    "Preco Total", "Status");
            pr.add(linha);
            
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("codigo")) > 0) {
                    c1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                    c1.setCodigoCompra(Integer.parseInt(rs.getString("codigoCompra")));
                    c1.setCodigoFornecedor(rs.getString("codigoFornecedor"));
                    c1.setNomeFornecedor(rs.getString("nomeFornecedor"));
                    c1.setCodigoProduto(rs.getString("codigoBarra"));
                    c1.setNomeProduto(rs.getString("nomeProduto"));
                    c1.setPrecoProduto(Double.parseDouble(rs.getString("precoProduto")));
                    c1.setQuantidadeSolicitada(Integer.parseInt(rs.getString("quantidadeSolicitada")));
                    c1.setPrecoTotal(Double.parseDouble(rs.getString("precoTotal")));
                    c1.setStatus(rs.getString("status"));
                    
                    linha = String.format("%6s|%13s|%20s|%20s|%20s|%20s|%20s|%21s|%11s|%15s",
                            rs.getString("codigo"),
                            rs.getString("codigoCompra"),
                            rs.getString("codigoFornecedor"),
                            rs.getString("nomeFornecedor"),
                            rs.getString("codigoBarra"),
                            rs.getString("nomeProduto"),
                            rs.getString("precoProduto"),
                            rs.getString("quantidadeSolicitada"),
                            rs.getString("precoTotal"),
                            rs.getString("status"));
                    pr.add(linha);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lista não Gerada!");
            return pr;
        }
    }
        acesso.desconectar();
        return pr;
    }
    
    public boolean receberPedido(Compra c1) {
        AcessoBD acesso = new AcessoBD();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE HistoricoPedidos SET status='" + c1.getStatus()
                + "' WHERE codigoCompra=" + c1.getCodigoCompra() + " AND codigoBarra='" + c1.getCodigoProduto() + "'";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Produto não recebido!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
}