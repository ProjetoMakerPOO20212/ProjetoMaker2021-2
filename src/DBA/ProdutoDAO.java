package DBA;

import produtos.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    public Monitor buscarMonitor(String codigoBarra) {
        
        AcessoBD acesso = new AcessoBD();
        Monitor m1 = new Monitor();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Monitor WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoBarra") != null) {
                        m1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        m1.setCodigoBarra(rs.getString("codigoBarra"));
                        m1.setTipo(rs.getString("tipo"));
                        m1.setNome(rs.getString("nome"));
                        m1.setMarca(rs.getString("marca"));
                        m1.setPreco(Double.parseDouble(rs.getString("preco")));
                        m1.setFrequencia(Integer.parseInt(rs.getString("frequencia")));
                        m1.setPolegada(Integer.parseInt(rs.getString("polegada")));
                        m1.setEntrada(Integer.parseInt(rs.getString("entrada")));
                        m1.getEstoque().setQuantidadeEstoque(Integer.parseInt(rs.getString("quantidadeEstoque")));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Monitor não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return m1;
    }
    
    public boolean buscarMonitorCB (String codigoBarra) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Monitor m1 = new Monitor();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Monitor WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    resp = true;
                    String mensagem = "Codigo de barras já cadastrado!";
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
    
    public boolean cadastrarMonitor(Monitor m1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "INSERT into Monitor (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque, frequencia, polegada, entrada)"
                    + "VALUES("
                    + ""    + m1.getCodigo()   + ""
                    + ",'"   + m1.getCodigoBarra()   + "'"
                    + ",'"  + m1.getTipo()     + "'"
                    + ",'"  + m1.getNome()     + "'"
                    + ",'"  + m1.getMarca()    + "'"
                    + ","   + m1.getPreco()    + ""
                    + ","   + m1.getEstoque().getQuantidadeEstoque() + ""
                    + ","   + m1.getFrequencia()     + ""
                    + ","   + m1.getPolegada()     + ""
                    + ","   + m1.getEntrada() + ""
                    + ")";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "INSERT into Produto (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque)"
                    + "VALUES("
                    + ""    + m1.getCodigo()   + ""
                    + ",'"   + m1.getCodigoBarra()   + "'"
                    + ",'"  + m1.getTipo()     + "'"
                    + ",'"  + m1.getNome()     + "'"
                    + ",'"  + m1.getMarca()    + "'"
                    + ","   + m1.getPreco()    + ""
                    + ","   + m1.getEstoque().getQuantidadeEstoque() + ""
                    + ")";
                
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Monitor não incluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean editarMonitor(Monitor m1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE Monitor SET codigoBarra='" + m1.getCodigoBarra() + 
                "', Tipo='" + m1.getTipo() + "', Nome='" + m1.getNome() + 
                "', Marca='" + m1.getMarca() + "', preco=" + m1.getPreco() + 
                ", frequencia=" + m1.getFrequencia() + ", polegada=" + m1.getPolegada() + 
                ", entrada=" + m1.getEntrada() + " WHERE codigo=" + m1.getCodigo();
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "DELETE from Produto WHERE codigoBarra='" + m1.getCodigoBarra() + "'";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "INSERT into Produto (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque)"
                    + "VALUES("
                    + ""    + m1.getCodigo()   + ""
                    + ",'"  + m1.getCodigoBarra()   + "'"
                    + ",'"  + m1.getTipo()     + "'"
                    + ",'"  + m1.getNome()     + "'"
                    + ",'"  + m1.getMarca()    + "'"
                    + ","   + m1.getPreco()    + ""
                    + ","   + m1.getEstoque().getQuantidadeEstoque() + ""
                    + ")";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Monitor não alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean receberMonitor(Produto p1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE Monitor SET quantidadeEstoque=" + p1.getEstoque().getQuantidadeEstoque() 
                + " WHERE codigoBarra='" + p1.getCodigoBarra() + "'";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "UPDATE Produto SET quantidadeEstoque=" + p1.getEstoque().getQuantidadeEstoque() 
                + " WHERE codigoBarra='" + p1.getCodigoBarra() + "'";
                
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Monitor não atualizado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean removerMonitor (Monitor m1) {
        AcessoBD acesso = new AcessoBD();
        if (acesso.conectar()) {
            try {
                String consulta = "DELETE from Monitor WHERE codigoBarra='" + m1.getCodigoBarra() + "'";
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "DELETE from Produto WHERE codigoBarra='" + m1.getCodigoBarra() + "'";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Monitor não excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public ArrayList<String> listarMonitor() {
    ArrayList<String> mr =null;
    AcessoBD acesso = new AcessoBD();
    Monitor m1 = new Monitor();
    ResultSet rs;
    
    if (acesso.conectar()) {
        try {
            String consulta = "select * from Monitor";
            PreparedStatement stm = acesso.con.prepareStatement(consulta);
            rs = stm.executeQuery();
            
            mr = new ArrayList();
            String linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s|%10s", 
                    "Codigo", "Codigo de Barras", "Tipo", "Nome", 
                    "Marca", "Preco", "Quantidade em estoque", "Frequencia",
                    "Polegadas", "Entradas");
            mr.add(linha);
            
            while (rs.next()) {
                if (Integer.parseInt(rs.getString("codigo")) > 0) {
                    m1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                    m1.setCodigoBarra(rs.getString("codigoBarra"));
                    m1.setTipo(rs.getString("tipo"));
                    m1.setNome(rs.getString("nome"));
                    m1.setMarca(rs.getString("marca"));
                    m1.setPreco(Double.parseDouble(rs.getString("preco")));
                    m1.getEstoque().setQuantidadeEstoque(Integer.parseInt(rs.getString("quantidadeEstoque")));
                    m1.setFrequencia(Integer.parseInt(rs.getString("frequencia")));
                    m1.setPolegada(Integer.parseInt(rs.getString("polegada")));
                    m1.setEntrada(Integer.parseInt(rs.getString("entrada")));
                    
                    linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s|%10s",
                            rs.getString("codigo"),
                            rs.getString("codigoBarra"),
                            rs.getString("tipo"),
                            rs.getString("nome"),
                            rs.getString("marca"),
                            rs.getString("preco"),
                            rs.getString("quantidadeEstoque"),
                            rs.getString("frequencia"),
                            rs.getString("polegada"),
                            rs.getString("entrada"));
                    mr.add(linha);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lista não Gerada!");
            return mr;
        }
    }
        acesso.desconectar();
        return mr;
    }
    
    public Mouse buscarMouse(String codigoBarra) {
        
        AcessoBD acesso = new AcessoBD();
        Mouse mo1 = new Mouse();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Mouse WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoBarra") != null) {
                        mo1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        mo1.setCodigoBarra(rs.getString("codigoBarra"));
                        mo1.setTipo(rs.getString("tipo"));
                        mo1.setNome(rs.getString("nome"));
                        mo1.setMarca(rs.getString("marca"));
                        mo1.setPreco(Double.parseDouble(rs.getString("preco")));
                        mo1.setDpi(Integer.parseInt(rs.getString("dpi")));
                        mo1.setPeso(Double.parseDouble(rs.getString("peso")));
                        mo1.getEstoque().setQuantidadeEstoque(Integer.parseInt(rs.getString("quantidadeEstoque")));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Mouse não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return mo1;
    }
    
    public boolean buscarMouseCB (String codigoBarra) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Mouse mo1 = new Mouse();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Mouse WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    resp = true;
                    String mensagem = "Codigo de barras já cadastrado!";
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
    
    public boolean cadastrarMouse(Mouse mo1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "INSERT into Mouse (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque, dpi, peso)"
                    + "VALUES("
                    + ""    + mo1.getCodigo()   + ""
                    + ",'"  + mo1.getCodigoBarra()   + "'"
                    + ",'"  + mo1.getTipo()     + "'"
                    + ",'"  + mo1.getNome()     + "'"
                    + ",'"  + mo1.getMarca()    + "'"
                    + ","   + mo1.getPreco()    + ""
                    + ","   + mo1.getEstoque().getQuantidadeEstoque() + ""
                    + ","   + mo1.getDpi()      + ""
                    + ","   + mo1.getPeso()     + ""
                    + ")";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "INSERT into Produto (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque)"
                    + "VALUES("
                    + ""    + mo1.getCodigo()   + ""
                    + ",'"  + mo1.getCodigoBarra()   + "'"
                    + ",'"  + mo1.getTipo()     + "'"
                    + ",'"  + mo1.getNome()     + "'"
                    + ",'"  + mo1.getMarca()    + "'"
                    + ","   + mo1.getPreco()    + ""
                    + ","   + mo1.getEstoque().getQuantidadeEstoque() + ""
                    + ")";
                
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Mouse não incluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean editarMouse(Mouse mo1) {
        AcessoBD acesso = new AcessoBD();
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE Mouse SET codigoBarra='" + mo1.getCodigoBarra() + 
                "', Tipo='" + mo1.getTipo() + "', Nome='" + mo1.getNome() + 
                "', Marca='" + mo1.getMarca() + "', preco=" + mo1.getPreco() + 
                ", dpi=" + mo1.getDpi() + ", peso=" + mo1.getPeso() + 
                " WHERE codigo=" + mo1.getCodigo();
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "DELETE from Produto WHERE codigoBarra='" + mo1.getCodigoBarra() + "'";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "INSERT into Produto (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque)"
                    + "VALUES("
                    + ""    + mo1.getCodigo()   + ""
                    + ",'"  + mo1.getCodigoBarra()   + "'"
                    + ",'"  + mo1.getTipo()     + "'"
                    + ",'"  + mo1.getNome()     + "'"
                    + ",'"  + mo1.getMarca()    + "'"
                    + ","   + mo1.getPreco()    + ""
                    + ","   + mo1.getEstoque().getQuantidadeEstoque() + ""
                    + ")";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Mouse não alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean receberMouse(Produto p1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE Mouse SET quantidadeEstoque=" + p1.getEstoque().getQuantidadeEstoque() 
                + " WHERE codigoBarra='" + p1.getCodigoBarra() + "'";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "UPDATE Produto SET quantidadeEstoque=" + p1.getEstoque().getQuantidadeEstoque() 
                + " WHERE codigoBarra='" + p1.getCodigoBarra() + "'";
                
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Mouse não atualizado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean removerMouse (Mouse mo1) {
        AcessoBD acesso = new AcessoBD();
        if (acesso.conectar()) {
            try {
                String consulta = "DELETE from Mouse WHERE codigoBarra='" + mo1.getCodigoBarra() + "'";
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "DELETE from Produto WHERE codigoBarra='" + mo1.getCodigoBarra() + "'";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Mouse não excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public ArrayList<String> listarMouse() {
        ArrayList<String> mor =null;
        AcessoBD acesso = new AcessoBD();
        Mouse mo1 = new Mouse();
        ResultSet rs;

        if (acesso.conectar()) {
            try {
                String consulta = "select * from Mouse";
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();

                mor = new ArrayList();
                String linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s", 
                        "Codigo", "Codigo de Barras", "Tipo", "Nome", 
                        "Marca", "Preco", "Quantidade em estoque", "DPI",
                        "Peso");
                mor.add(linha);

                while (rs.next()) {
                    if (Integer.parseInt(rs.getString("codigo")) > 0) {
                        mo1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        mo1.setCodigoBarra(rs.getString("codigoBarra"));
                        mo1.setTipo(rs.getString("tipo"));
                        mo1.setNome(rs.getString("nome"));
                        mo1.setMarca(rs.getString("marca"));
                        mo1.setPreco(Double.parseDouble(rs.getString("preco")));
                        mo1.getEstoque().setQuantidadeEstoque(Integer.parseInt(rs.getString("quantidadeEstoque")));
                        mo1.setDpi(Integer.parseInt(rs.getString("dpi")));
                        mo1.setPeso(Double.parseDouble(rs.getString("peso")));

                        linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s",
                                rs.getString("codigo"),
                                rs.getString("codigoBarra"),
                                rs.getString("tipo"),
                                rs.getString("nome"),
                                rs.getString("marca"),
                                rs.getString("preco"),
                                rs.getString("quantidadeEstoque"),
                                rs.getString("dpi"),
                                rs.getString("peso"));
                        mor.add(linha);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Lista não Gerada!");
                return mor;
            }
        }
        acesso.desconectar();
        return mor;
    }
    
    public Teclado buscarTeclado(String codigoBarra) {
        
        AcessoBD acesso = new AcessoBD();
        Teclado t1 = new Teclado();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Teclado WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoBarra") != null) {
                        t1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        t1.setCodigoBarra(rs.getString("codigoBarra"));
                        t1.setTipo(rs.getString("tipo"));
                        t1.setNome(rs.getString("nome"));
                        t1.setMarca(rs.getString("marca"));
                        t1.setPreco(Double.parseDouble(rs.getString("preco")));
                        t1.setModelo(rs.getString("modelo"));
                        t1.setCor(rs.getString("cor"));
                        t1.setRgb(Boolean.parseBoolean(rs.getString("rgb")));
                        t1.getEstoque().setQuantidadeEstoque(Integer.parseInt(rs.getString("quantidadeEstoque")));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Teclado não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return t1;
    }
    
    public boolean buscarTecladoCB (String codigoBarra) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Teclado t1 = new Teclado();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Teclado WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    resp = true;
                    String mensagem = "Codigo de barras já cadastrado!";
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
    
    public boolean cadastrarTeclado(Teclado t1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "INSERT into Teclado (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque, modelo, cor, rgb)"
                    + "VALUES("
                    + ""     + t1.getCodigo()   + ""
                    + ",'"   + t1.getCodigoBarra()   + "'"
                    + ",'"   + t1.getTipo()     + "'"
                    + ",'"   + t1.getNome()     + "'"
                    + ",'"   + t1.getMarca()    + "'"
                    + ","    + t1.getPreco()    + ""
                    + ","    + t1.getEstoque().getQuantidadeEstoque() + ""
                    + ",'"   + t1.getModelo()      + "'"
                    + ",'"   + t1.getCor()     + "'"
                    + ",'"   + t1.isRgb()     + "'"
                    + ")";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "INSERT into Produto (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque)"
                    + "VALUES("
                    + ""    + t1.getCodigo()   + ""
                    + ",'"  + t1.getCodigoBarra()   + "'"
                    + ",'"  + t1.getTipo()     + "'"
                    + ",'"  + t1.getNome()     + "'"
                    + ",'"  + t1.getMarca()    + "'"
                    + ","   + t1.getPreco()    + ""
                    + ","   + t1.getEstoque().getQuantidadeEstoque() + ""
                    + ")";
                
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Teclado não incluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean editarTeclado(Teclado t1) {
        AcessoBD acesso = new AcessoBD();
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE Teclado SET codigoBarra='" + t1.getCodigoBarra() + 
                "', Tipo='" + t1.getTipo() + "', Nome='" + t1.getNome() + 
                "', Marca='" + t1.getMarca() + "', preco=" + t1.getPreco() + 
                ", modelo='" + t1.getModelo() + "', cor='" + t1.getCor() + 
                "', rgb='" + t1.isRgb() + "' WHERE codigo=" + t1.getCodigo();
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "DELETE from Produto WHERE codigoBarra='" + t1.getCodigoBarra() + "'";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "INSERT into Produto (codigo, codigoBarra, tipo, nome, "
                    + "marca, preco, quantidadeEstoque)"
                    + "VALUES("
                    + ""    + t1.getCodigo()   + ""
                    + ",'"  + t1.getCodigoBarra()   + "'"
                    + ",'"  + t1.getTipo()     + "'"
                    + ",'"  + t1.getNome()     + "'"
                    + ",'"  + t1.getMarca()    + "'"
                    + ","   + t1.getPreco()    + ""
                    + ","   + t1.getEstoque().getQuantidadeEstoque() + ""
                    + ")";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Teclado não alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean receberTeclado(Produto p1) {
        AcessoBD acesso = new AcessoBD();
        
        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE Teclado SET quantidadeEstoque=" + p1.getEstoque().getQuantidadeEstoque() 
                + " WHERE codigoBarra='" + p1.getCodigoBarra() + "'";
                
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "UPDATE Produto SET quantidadeEstoque=" + p1.getEstoque().getQuantidadeEstoque() 
                + " WHERE codigoBarra='" + p1.getCodigoBarra() + "'";
                
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Teclado não atualizado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public boolean removerTeclado (Teclado t1) {
        AcessoBD acesso = new AcessoBD();
        if (acesso.conectar()) {
            try {
                String consulta = "DELETE from Teclado WHERE codigoBarra='" + t1.getCodigoBarra() + "'";
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                
                consulta = "DELETE from Produto WHERE codigoBarra='" + t1.getCodigoBarra() + "'";
                st = acesso.con.createStatement();
                st.executeUpdate(consulta);
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Teclado não excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }
        acesso.desconectar();
        return true;
    }
    
    public ArrayList<String> listarTeclado() {
        ArrayList<String> tr =null;
        AcessoBD acesso = new AcessoBD();
        Teclado t1 = new Teclado();
        ResultSet rs;

        if (acesso.conectar()) {
            try {
                String consulta = "select * from Teclado";
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();

                tr = new ArrayList();
                String linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s|%10s",
                        "Codigo", "Codigo de Barras", "Tipo", "Nome", 
                        "Marca", "Preco", "Quantidade em estoque", "Modelo",
                        "Cor", "RGB");
                tr.add(linha);

                while (rs.next()) {
                    if (Integer.parseInt(rs.getString("codigo")) > 0) {
                        t1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        t1.setCodigoBarra(rs.getString("codigoBarra"));
                        t1.setTipo(rs.getString("tipo"));
                        t1.setNome(rs.getString("nome"));
                        t1.setMarca(rs.getString("marca"));
                        t1.setPreco(Double.parseDouble(rs.getString("preco")));
                        t1.getEstoque().setQuantidadeEstoque(Integer.parseInt(rs.getString("quantidadeEstoque")));
                        t1.setModelo(rs.getString("modelo"));
                        t1.setCor(rs.getString("cor"));
                        if (rs.getString("rgb").equals(true)) t1.setRgb(true);

                        linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s|%10s",
                                rs.getString("codigo"),
                                rs.getString("codigoBarra"),
                                rs.getString("tipo"),
                                rs.getString("nome"),
                                rs.getString("marca"),
                                rs.getString("preco"),
                                rs.getString("quantidadeEstoque"),
                                rs.getString("modelo"),
                                rs.getString("cor"),
                                rs.getString("rgb"));
                        tr.add(linha);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Lista não Gerada!");
                return tr;
            }
        }
        acesso.desconectar();
        return tr;
    }
    
    public Produto buscarProduto(String codigoBarra) {
        
        AcessoBD acesso = new AcessoBD();
        Produto p1 = new Produto();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Produto WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoBarra") != null) {
                        p1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        p1.setCodigoBarra(rs.getString("codigoBarra"));
                        p1.setTipo(rs.getString("tipo"));
                        p1.setNome(rs.getString("nome"));
                        p1.setMarca(rs.getString("marca"));
                        p1.setPreco(Double.parseDouble(rs.getString("preco")));
                        p1.getEstoque().setQuantidadeEstoque(Integer.parseInt(rs.getString("quantidadeEstoque")));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Produto não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return p1;
    }
    
    public boolean buscarProdutoCB (String codigoBarra) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Produto p1 = new Produto();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Produto WHERE codigoBarra='" + codigoBarra.trim() + "'";
                
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
}