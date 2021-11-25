package DBA;

import pessoas.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedorDAO {
    
    // Método para realizar a inclusão de um no registro na Tabela FORNECEDOR
  public boolean cadastrarFornecedor(fornecedor fornecedor) {
    // Cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de inclusão na tabela FORNECEDOR 
        String consulta = "INSERT into FORNECEDOR (CODIGO, NOME, CIDADE, BAIRRO, "
                + "RUA, CEP, CNPJ)"
                + "VALUES("
                + ""    + fornecedor.getCodigo()   + ""
                + ",' " + fornecedor.getNome()     + "'"
                + ",' " + fornecedor.getEndereco().getCidade()    + "'"
                + ","   + fornecedor.getEndereco().getBairro()    + ""
                + ","   + fornecedor.getEndereco().getRua()     + ""
                + ",' " + fornecedor.getEndereco().getCep()     + "'"
                + ",' " + fornecedor.getCnpj() + "')";
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não incluído!";
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
  
public fornecedor buscarFornecedor(int codigo) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Fornecedor para retornar os dados do registro
    fornecedor f1 = new fornecedor();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela FORNECEDOR através do CODIGO
        String consulta = "select * from FORNECEDOR where CODIGO="
                + String.valueOf(codigo).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Fornecedor
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            f1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            f1.setNome(rs.getString("NOME"));
            f1.getEndereco().setCidade(rs.getString("CIDADE"));
            f1.getEndereco().setBairro(rs.getString("BAIRRO"));
            f1.getEndereco().setRua(rs.getString("RUA"));
            f1.getEndereco().setCep(rs.getString("CEP"));
            f1.setCnpj(rs.getString("CNPJ"));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto Fornecedor com os dados do registro da tabela
    return f1;
  }

public fornecedor buscarFornecedor(String nome) {
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Fornecedor para retornar os dados do registro
    fornecedor f1 = new fornecedor();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela FORNECEDOR através do NOME
        String consulta = "select * from FORNECEDOR where NOME="
                + String.valueOf(nome).trim();
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta
        rs = stm.executeQuery();
        // Existindo resultado os valores dos campos são transferidos
        // para o objeto Fornecedor
        if (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            f1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            f1.setNome(rs.getString("NOME"));
            f1.getEndereco().setCidade(rs.getString("CIDADE"));
            f1.getEndereco().setBairro(rs.getString("BAIRRO"));
            f1.getEndereco().setRua(rs.getString("RUA"));
            f1.getEndereco().setCep(rs.getString("CEP"));
            f1.setCnpj(rs.getString("CNPJ"));
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return null;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna um objeto Fornecedor com os dados do registro da tabela
    return f1;
  }

public boolean buscarFornecedorCodigo(int codigo) {
    boolean resp=false;
    // Cria um objeto de Conexão com o Banco de Dados
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Fornecedor para retornar os dados do registro
    fornecedor f1 = new fornecedor();
    // Cria um ResultSet para armazenar o resultado da pesquisa
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta na tabela FORNECEDOR através do NOME
        String consulta = "select * from FORNECEDOR where CODIGO="
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
        String mensagem = "Fornecedor não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
        resp = false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Retorna verdadeiro
    return resp;
  }

public boolean alterarFornecedor(fornecedor f1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();    
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de alteração na tabela FORNECEDOR 
        String consulta = "UPDATE FORNECEDOR SET NOME='" + f1.getNome() + "', "
        + "CIDADE='" + f1.getEndereco().getCidade() + "', "
        + "BAIRRO='" + f1.getEndereco().getBairro() + "', "
        + "RUA='" + f1.getEndereco().getRua() + "', "
        + "CEP='" + f1.getEndereco().getCep() + "', CNPJ='" + f1.getCnpj() + "' "
        + "WHERE CODIGO=" + f1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não alterado!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }    
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

public boolean excluirFornecedor (fornecedor f1) {
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de exclusão na tabela FORNECEDOR 
        String consulta = "DELETE from FORNECEDOR WHERE CODIGO=" + f1.getCodigo();
        // Cria um objeto para realizar a consulta
        Statement st = acesso.con.createStatement();
        // Executa a consulta
        st.executeUpdate(consulta);
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        String mensagem = "Fornecedor não excluído!";
        JOptionPane.showMessageDialog(null, mensagem);
        return false;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return true;
  }

 public ArrayList<String> listarFornecedor() {
    ArrayList<String> fr =null;
    // cria o objeto para a conexão
    AcessoBD acesso = new AcessoBD();
    // Cria um objeto Fornecedor armazenar os dados de cada registro da tabela
    fornecedor f1 = new fornecedor();
    // Cria um ResultaSet para armazenar os registros resultantes da consulta
    ResultSet rs;
    // Tenta realizar a conexão com o banco de Dados para realizar a operação
    if (acesso.conectar()) {
      // Tramento de exceções
      try {
        // Define a consulta de busca dos registros na tabela FORNECEDOR 
        String consulta = "select * from FORNECEDOR";
        // Cria um objeto para realizar a consulta
        PreparedStatement stm = acesso.con.prepareStatement(consulta);
        // Executa a consulta ao Banco e armazena o resultado no ResultSet
        rs = stm.executeQuery();
        
        /* Cria um ArrayList para receber os registros da consulta e
        preencher a lista*/
        fr = new ArrayList();
        
        // Formata o título do relatório
        String linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                "CODIGO", "NOME", "CIDADE", "BAIRRO", "RUA", "CEP", 
                "CNPJ");                
        // Exibe o título do relatório
        System.out.println(linha);
        // Enquanto houver registros, o objeto Fornecedor recebe os dados 
        // de cada registro da tabela
        while (rs.next()) {
          if (Integer.parseInt(rs.getString("CODIGO")) > 0) {
            f1.setCodigo(Integer.parseInt(rs.getString("CODIGO")));
            f1.setNome(rs.getString("NOME"));
            f1.getEndereco().setCidade(rs.getString("CIDADE"));
            f1.getEndereco().setBairro(rs.getString("BAIRRO"));
            f1.getEndereco().setRua(rs.getString("RUA"));
            f1.getEndereco().setCep(rs.getString("CEP"));
            f1.setCnpj(rs.getString("CNPJ"));
            // Formata a linha de conteúdo do relatório
            linha = String.format("%10s|%10s|%10s|%10s|%10s|%10s|%10s",
                    rs.getString("CODIGO"),
                    rs.getString("NOME"),
                    rs.getString("CIDADE"),
                    rs.getString("BAIRRO"),
                    rs.getString("RUA"),
                    rs.getString("CEP"),
                    rs.getString("CNPJ"));
            // Exibe cada registro
            System.out.println(linha);
            // Adiciona a linha ao ArrayList
                fr.add(linha);
          }
        }
      } catch (Exception e) {
        // Informa caso a operação não tenha obtido sucesso
        e.printStackTrace();
        System.out.println("Lista não Gerada!");
        return fr;
      }
    }
    // Desconecta com o Banco após realizar a operação
    acesso.desconectar();
    // Informa que a operação obteve sucesso
    return fr;
  }
}