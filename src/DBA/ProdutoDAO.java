package DBA;

import produtos.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    // Método para realizar a inclusão de um no registro na Tabela MONITOR
  public boolean inserirMonitor(Monitores monitor) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela MONITOR 
        String consulta = "INSERT into MONITOR (CODIGO, NOME, MARCA, PRECO, "
                + "FREQUENCIA, POLEGADAS, ENTRADAS, QTD)"
                + "VALUES("
                + ""    + monitor.getCodigo()   + ""
                + ",' " + monitor.getNome()     + "'"
                + ",' " + monitor.getMarca()    + "'"
                + ","   + monitor.getPreco()    + ""
                + ","   + monitor.getFreq()     + ""
                + ","   + monitor.getPol()     + ""
                + ","   + monitor.getEntradas() + ""
                + ","   + monitor.getEstoque().getQtdEstoque() + ""
                + ")";
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Monitor não incluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        // Informa que a operação NÃO obteve sucesso
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }
  
public Monitores buscarMonitor(int codigo) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Monitores para retornar os dados do registro
    Monitores m1 = new Monitores();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela MONITOR através do CODIGO
        String consulta = "select * from MONITOR where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Monitor
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            m1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            m1.setNome(rs.getString("NOME"));
            m1.setMarca(rs.getString("MARCA"));
            m1.setPreco(Double.parseDouble(rs.getString("PRECO")));
            m1.setFreq(Double.parseDouble(rs.getString("FREQUENCIA")));
            m1.setPol(Double.parseDouble(rs.getString("POLEGADAS")));
            m1.setEntradas(Integer.parseInt(rs.getString("ENTRADAS")));
            m1.getEstoque().setQtdEstoque(Integer.parseInt(rs.getString("QTD")));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Monitor não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto Monitor com os dados do registro da tabela
    return m1;
  }

public boolean buscarMonitorCodigo(int codigo) {
    boolean resp=false;
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Monitores para retornar os dados do registro
    Monitores m1 = new Monitores();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela MONITOR através do CODIGO
        String consulta = "select * from MONITOR where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado retorna verdadeiro
        if (rs.next()) {
          resp = true;
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Monitor não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        resp = false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna verdadeiro
    return resp;
  }

public boolean alterarMonitor(Monitores m1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();    
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela MONITOR 
        String consulta = "UPDATE MONITOR SET NOME='" + m1.getNome() + 
        "', MARCA='" + m1.getMarca() + "', PRECO=" + m1.getPreco() + 
        ", FREQUENCIA=" + m1.getFreq() + ", POLEGADAS=" + m1.getPol() + 
        ", ENTRADAS=" + m1.getEntradas() + " WHERE CODIGO=" + m1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Monitor não alterado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean excluirMonitor (Monitores m1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela MONITOR 
        String consulta = "DELETE from MONITOR WHERE CODIGO=" + m1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Monitor não excluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean inserirTeclado(Teclados teclado) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela TECLADO 
        String consulta = "INSERT into TECLADO (CODIGO, NOME, MARCA, PRECO, "
                + "TIPO, COR, RGB, QTD)"
                + "VALUES("
                + ""    + teclado.getCodigo()   + ""
                + ",' " + teclado.getNome()     + "'"
                + ",' " + teclado.getMarca()    + "'"
                + ","   + teclado.getPreco()    + ""
                + ","   + teclado.getTipo()     + ""
                + ","   + teclado.getCor()     + ""
                + ","   + teclado.getRgb() + ""
                + ","   + teclado.getEstoque().getQtdEstoque() + ""
                + ")";
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Teclado não incluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        // Informa que a operação NÃO obteve sucesso
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
}

public Teclados buscarTeclado(int codigo) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Teclados para retornar os dados do registro
    Teclados t1 = new Teclados();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela TECLADO através do CODIGO
        String consulta = "select * from TECLADO where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Teclados
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            t1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            t1.setNome(rs.getString("NOME"));
            t1.setMarca(rs.getString("MARCA"));
            t1.setPreco(Double.parseDouble(rs.getString("PRECO")));
            t1.setTipo(rs.getString("TIPO"));
            t1.setCor(rs.getString("COR"));
            t1.setRgb(Boolean.parseBoolean(rs.getString("RGB")));
            t1.getEstoque().setQtdEstoque(Integer.parseInt(rs.getString("QTD")));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Teclado não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto Teclados com os dados do registro da tabela
    return t1;
  }

public boolean buscarTecladoCodigo(int codigo) {
    boolean resp=false;
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Teclados para retornar os dados do registro
    Teclados t1 = new Teclados();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela TECLADO através do CODIGO
        String consulta = "select * from TECLADO where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado retorna verdadeiro
        if (rs.next()) {
          resp = true;
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Teclado não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        resp = false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna verdadeiro
    return resp;
  }

public boolean alterarTeclado(Teclados t1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();    
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela TECLADO 
        String consulta = "UPDATE TECLADO SET NOME='" + t1.getNome() + 
        "', MARCA='" + t1.getMarca() + "', PRECO=" + t1.getPreco() + 
        ", TIPO='" + t1.getTipo() + "', COR='" + t1.getCor() + 
        "', RGB=" + t1.getRgb() + " WHERE CODIGO=" + t1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Teclado não alterado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean excluirTeclado (Teclados t1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela TECLADO 
        String consulta = "DELETE from TECLADO WHERE CODIGO=" + t1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Teclado não excluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean inserirMouse(Mouses mouse){
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela MOUSE 
        String consulta = "INSERT into MOUSE (CODIGO, NOME, MARCA, PRECO, "
                + "DPI, PESO, QTD)"
                + "VALUES("
                + ""    + mouse.getCodigo()   + ""
                + ",' " + mouse.getNome()     + "'"
                + ",' " + mouse.getMarca()    + "'"
                + ","   + mouse.getPreco()    + ""
                + ","   + mouse.getDpi()     + ""
                + ","   + mouse.getPeso()     + ""
                + ","   + mouse.getEstoque().getQtdEstoque() + ""
                + ")";
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Mouse não incluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        // Informa que a operação NÃO obteve sucesso
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
}

public Mouses buscarMouse(int codigo) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Mouses para retornar os dados do registro
    Mouses mo1 = new Mouses();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela MOUSE através do id
        String consulta = "select * from MOUSE where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Mouses
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            mo1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            mo1.setNome(rs.getString("NOME"));
            mo1.setMarca(rs.getString("MARCA"));
            mo1.setPreco(Double.parseDouble(rs.getString("PRECO")));
            mo1.setDpi(Integer.parseInt(rs.getString("DPI")));
            mo1.setPeso(Double.parseDouble(rs.getString("PESO")));
            mo1.getEstoque().setQtdEstoque(Integer.parseInt(rs.getString("QTD")));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Mouse não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto Mouses com os dados do registro da tabela
    return mo1;
  }

public boolean buscarMouseCodigo(int codigo) {
    boolean resp=false;
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Mouses para retornar os dados do registro
    Mouses mo1 = new Mouses();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela MOUSE através do CODIGO
        String consulta = "select * from MOUSE where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado retorna verdadeiro
        if (rs.next()) {
          resp = true;
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Mouse não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        resp = false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna verdadeiro
    return resp;
  }

public boolean alterarMouse(Mouses mo1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();    
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela MOUSE 
        String consulta = "UPDATE MOUSE SET NOME='" + mo1.getNome() + 
        "', MARCA='" + mo1.getMarca() + "', PRECO=" + mo1.getPreco() + 
        ", DPI=" + mo1.getDpi() + ", PESO=" + mo1.getPeso() + 
        " WHERE CODIGO=" + mo1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Mouse não alterado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean excluirMouse (Mouses mo1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela MOUSE 
        String consulta = "DELETE from MOUSE WHERE CODIGO=" + mo1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Mouse não excluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

  public ArrayList<String> listarMonitores() {
    ArrayList<String> ar =null;
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Monitor armazenar os dados de cada registro da tabela
    Monitores m1 = new Monitores();
    // Cria um ResultaSet para armazenar os registros resultantes da consulta
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de busca dos registros na tabela MONITOR 
        String consulta = "select * from MONITOR";
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta ao Banco e armazena o resultado no ResultSet
        rs = stm.executeQuery();
        
        /* Cria um ArrayList para receber os registros da consulta e
        preencher a lista*/
        ar = new ArrayList();
        
        // Formata o título do relatório
        String linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                "CODIGO", "NOME", "MARCA", "PRECO", "FREQUENCIA", "POLEGADAS", 
                "ENTRADAS", "QTD");                
        // Exibe o título do relatório
        System.out.println(linha);
        // Enquanto houver registros, o objeto Monitor recebe os dados 
        // de cada registro da tabela
        while (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            m1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            m1.setNome(rs.getString("NOME"));
            m1.setMarca(rs.getString("MARCA"));
            m1.setPreco(Double.parseDouble(rs.getString("PRECO")));
            m1.setFreq(Double.parseDouble(rs.getString("FREQUENCIA")));
            m1.setPol(Double.parseDouble(rs.getString("POLEGADAS")));
            m1.setEntradas(Integer.parseInt(rs.getString("ENTRADAS")));
            m1.getEstoque().setQtdEstoque(Integer.parseInt(rs.getString("QTD")));
            // Formata a linha de conteúdo do relatório
            linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                    rs.getString("CODIGO"),
                    rs.getString("NOME"),
                    rs.getString("MARCA"),
                    rs.getString("PRECO"),
                    rs.getString("FREQUENCIA"),
                    rs.getString("POLEGADAS"),
                    rs.getString("ENTRADAS"),
                    rs.getString("QTD"));
            // Exibe cada registro
            System.out.println(linha);
            // Adiciona a linha ao ArrayList
                ar.add(linha);
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        System.out.println("Lista não Gerada!");
        return ar;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return ar;
  }
  
  public ArrayList<String> listarTeclados() {
    ArrayList<String> tr =null;
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Teclado armazenar os dados de cada registro da tabela
    Teclados t1 = new Teclados();
    // Cria um ResultaSet para armazenar os registros resultantes da consulta
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de busca dos registros na tabela TECLADO 
        String consulta = "select * from TECLADO";
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta ao Banco e armazena o resultado no ResultSet
        rs = stm.executeQuery();
        
        /* Cria um ArrayList para receber os registros da consulta e
        preencher a lista*/
        tr = new ArrayList();
        
        // Formata o título do relatório
        String linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                "CODIGO", "NOME", "MARCA", "PRECO", "TIPO", "COR", 
                "RGB", "QTD");                
        // Exibe o título do relatório
        System.out.println(linha);
        // Enquanto houver registros, o objeto Teclados recebe os dados 
        // de cada registro da tabela
        while (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            t1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            t1.setNome(rs.getString("NOME"));
            t1.setMarca(rs.getString("MARCA"));
            t1.setPreco(Double.parseDouble(rs.getString("PRECO")));
            t1.setTipo(rs.getString("TIPO"));
            t1.setCor(rs.getString("COR"));
            t1.setRgb(Boolean.parseBoolean(rs.getString("RGB")));
            t1.getEstoque().setQtdEstoque(Integer.parseInt(rs.getString("QTD")));
            // Formata a linha de conteúdo do relatório
            linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                    rs.getString("CODIGO"),
                    rs.getString("NOME"),
                    rs.getString("MARCA"),
                    rs.getString("PRECO"),
                    rs.getString("TIPO"),
                    rs.getString("COR"),
                    rs.getString("RGB"),
                    rs.getString("QTD"));
            // Exibe cada registro
            System.out.println(linha);
            // Adiciona a linha ao ArrayList
                tr.add(linha);
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        System.out.println("Lista não Gerada!");
        return tr;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return tr;
  }
  
  public ArrayList<String> listarMouses() {
    ArrayList<String> mr =null;
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Mouse armazenar os dados de cada registro da tabela
    Mouses mo1 = new Mouses();
    // Cria um ResultaSet para armazenar os registros resultantes da consulta
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de busca dos registros na tabela MOUSE 
        String consulta = "select * from MOUSE";
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta ao Banco e armazena o resultado no ResultSet
        rs = stm.executeQuery();
        
        /* Cria um ArrayList para receber os registros da consulta e
        preencher a lista*/
        mr = new ArrayList();
        
        // Formata o título do relatório
        String linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                "CODIGO", "NOME", "MARCA", "PRECO", "DPI", "PESO", "QTD");                
        // Exibe o título do relatório
        System.out.println(linha);
        // Enquanto houver registros, o objeto Mouses recebe os dados 
        // de cada registro da tabela
        while (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            mo1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            mo1.setNome(rs.getString("NOME"));
            mo1.setMarca(rs.getString("MARCA"));
            mo1.setPreco(Double.parseDouble(rs.getString("PRECO")));
            mo1.setDpi(Integer.parseInt(rs.getString("DPI")));
            mo1.setPeso(Double.parseDouble(rs.getString("PESO")));
            mo1.getEstoque().setQtdEstoque(Integer.parseInt(rs.getString("QTD")));
            // Formata a linha de conteúdo do relatório
            linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                    rs.getString("CODIGO"),
                    rs.getString("NOME"),
                    rs.getString("MARCA"),
                    rs.getString("PRECO"),
                    rs.getString("DPI"),
                    rs.getString("PESO"),
                    rs.getString("QTD"));
            // Exibe cada registro
            System.out.println(linha);
            // Adiciona a linha ao ArrayList
                mr.add(linha);
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        System.out.println("Lista não Gerada!");
        return mr;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return mr;
  }
}