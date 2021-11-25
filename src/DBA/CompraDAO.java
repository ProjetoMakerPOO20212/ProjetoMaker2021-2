package DBA;

import pessoas.*;
import produtos.*;
import DBA.*;
import administativo.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.Math;

public class CompraDAO {
    
    public compra buscarCompra(int codigo) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Compra para retornar os dados do registro
    compra c1 = new compra();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela COMPRA através do CODIGO
        String consulta = "select * from COMPRA where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Compra
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            c1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            c1.setCodigoProduto(Integer.parseInt(rs.getString("CODIGOPRODUTO")));
            c1.setNome(rs.getString("NOME"));
            c1.setCodigoFornecedor(Integer.parseInt(rs.getString("CODIGOFORNECEDOR")));
            c1.setFornecedor(rs.getString("FORNECEDOR"));
            c1.setQtd(Integer.parseInt(rs.getString("QTD")));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Compra não encontrada!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto Compra com os dados do registro da tabela
    return c1;
  }    

public ArrayList<String> listarCompras() {
    ArrayList<String> cr =null;
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Compra armazenar os dados de cada registro da tabela
    compra c1 = new compra();
    // Cria um ResultaSet para armazenar os registros resultantes da consulta
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de busca dos registros na tabela COMPRA 
        String consulta = "select * from COMPRA";
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta ao Banco e armazena o resultado no ResultSet
        rs = stm.executeQuery();
        
        /* Cria um ArrayList para receber os registros da consulta e
        preencher a lista*/
        cr = new ArrayList();
        
        // Formata o título do relatório
        String linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s",
                "CODIGO","CODIGOPRODUTO", "NOME","CODIGOFORNECEDOR", "FORNECEDOR", "QTD");                
        // Exibe o título do relatório
        System.out.println(linha);
        // Enquanto houver registros, o objeto Compra recebe os dados 
        // de cada registro da tabela
        while (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            c1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            c1.setCodigoProduto(Integer.parseInt(rs.getString("CODIGOPRODUTO")));
            c1.setNome(rs.getString("NOME"));
            c1.setCodigoFornecedor(Integer.parseInt(rs.getString("CODIGOFORNECEDOR")));
            c1.setFornecedor(rs.getString("FORNECEDOR"));
            c1.setQtd(Integer.parseInt(rs.getString("QTD")));
            // Formata a linha de conteúdo do relatório
            linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s",
                    rs.getString("CODIGO"),
                    rs.getString("CODIGOPRODUTO"),
                    rs.getString("NOME"),
                    rs.getString("CODIGOFORNECEDOR"),
                    rs.getString("FORNECEDOR"),
                    rs.getString("QTD"));
            // Exibe cada registro
            System.out.println(linha);
            // Adiciona a linha ao ArrayList
                cr.add(linha);
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        System.out.println("Lista não Gerada!");
        return cr;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return cr;
  }    
    
public boolean solicitarMonitor (compra c1) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela COMPRA se existir um monitor e fornecedor com o nome fornecido
        ProdutoDAO pd = new ProdutoDAO();
        FornecedorDAO fd = new FornecedorDAO();
        if (pd.buscarMonitorCodigo(c1.getCodigoProduto()) && fd.buscarFornecedorCodigo(c1.getCodigoFornecedor())){
            String consulta = "INSERT into COMPRA (CODIGO,CODIGOPRODUTO, NOME, CODIGOFORNECEDOR, FORNECEDOR, QTD) "
                + "VALUES("
                + ""    + c1.getCodigo()   + ""
                + "," + c1.getCodigoProduto()     + ""
                + ",' " + c1.getNome()     + "'"
                + "," + c1.getCodigoFornecedor()     + ""
                + ",' " + c1.getFornecedor()    + "'"
                + ","   + c1.getQtd()    + ""
                + ")";
            // Cria um objeto para realizar a consulta
            Statement st = acesso.con.createStatement();
            // Executa a consulta
            st.executeUpdate(consulta);
        }
        else {
            String mensagem = "Monitor ou Fornecedor não existente!";
            JOptionPane.showMessageDialog(null, mensagem);
            return false;
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Compra não enviada!";
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

public boolean solicitarMouse (compra c1) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela COMPRA se existir um mouse e fornecedor com o nome fornecido
        ProdutoDAO pd = new ProdutoDAO();
        FornecedorDAO fd = new FornecedorDAO();
        if (pd.buscarMouseCodigo(c1.getCodigoProduto()) && fd.buscarFornecedorCodigo(c1.getCodigoFornecedor())){
            String consulta = "INSERT into COMPRA (CODIGO,CODIGOPRODUTO, NOME, CODIGOFORNECEDOR, FORNECEDOR, QTD) "
                + "VALUES("
                + ""    + c1.getCodigo()   + ""
                + "," + c1.getCodigoProduto()     + ""
                + ",' " + c1.getNome()     + "'"
                + "," + c1.getCodigoFornecedor()     + ""
                + ",' " + c1.getFornecedor()    + "'"
                + ","   + c1.getQtd()    + ""
                + ")";
            // Cria um objeto para realizar a consulta
            Statement st = acesso.con.createStatement();
            // Executa a consulta
            st.executeUpdate(consulta);
        }
        else {
            String mensagem = "Mouse ou Fornecedor não existente!";
            JOptionPane.showMessageDialog(null, mensagem);
            return false;
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Compra não enviada!";
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

public boolean solicitarTeclado (compra c1) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela COMPRA se existir um teclado e fornecedor com o nome fornecido
        ProdutoDAO pd = new ProdutoDAO();
        FornecedorDAO fd = new FornecedorDAO();
        if (pd.buscarTecladoCodigo(c1.getCodigoProduto()) && fd.buscarFornecedorCodigo(c1.getCodigoFornecedor())){
            String consulta = "INSERT into COMPRA (CODIGO,CODIGOPRODUTO, NOME, CODIGOFORNECEDOR, FORNECEDOR, QTD) "
                + "VALUES("
                + ""    + c1.getCodigo()   + ""
                + "," + c1.getCodigoProduto()     + ""
                + ",' " + c1.getNome()     + "'"
                + "," + c1.getCodigoFornecedor()     + ""
                + ",' " + c1.getFornecedor()    + "'"
                + ","   + c1.getQtd()    + ""
                + ")";
            // Cria um objeto para realizar a consulta
            Statement st = acesso.con.createStatement();
            // Executa a consulta
            st.executeUpdate(consulta);
        }
        else {
            String mensagem = "Teclado ou Fornecedor não existente!";
            JOptionPane.showMessageDialog(null, mensagem);
            return false;
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Compra não enviada!";
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

public boolean receberMonitor(compra c1, Monitores m1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela MONITOR 
        String consulta = "UPDATE MONITOR SET QTD=" + 
        Math.addExact(m1.getEstoque().getQtdEstoque(), c1.getQtd()) + " "
        + "WHERE CODIGO=" + c1.getCodigoProduto();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
        String consulta2 = "DELETE from COMPRA WHERE CODIGO=" + c1.getCodigo();
        Statement st2 = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta2);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Monitor não atualizado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean receberMouse(compra c1, Mouses mo1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela MOUSE
        String consulta = "UPDATE MOUSE SET QTD=" + 
        Math.addExact(mo1.getEstoque().getQtdEstoque(), c1.getQtd()) + " "
        + "WHERE CODIGO=" + c1.getCodigoProduto();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
        String consulta2 = "DELETE from COMPRA WHERE CODIGO=" + c1.getCodigo();
        Statement st2 = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta2);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Mouse não atualizado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean receberTeclado(compra c1, Teclados t1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela TECLADO 
        String consulta = "UPDATE TECLADO SET QTD=" + 
        Math.addExact(t1.getEstoque().getQtdEstoque(), c1.getQtd()) + " "
            + "WHERE CODIGO=" + c1.getCodigoProduto();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
        String consulta2 = "DELETE from COMPRA WHERE CODIGO=" + c1.getCodigo();
        Statement st2 = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta2);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Teclado não atualizado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }
}