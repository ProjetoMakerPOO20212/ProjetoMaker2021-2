package DBA;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

// Classe de Conexão com o Banco de Dados
// Pode ser usado para manipular todas as tabelas do banco
public class AcessoBD {
  // cria o objeto para a conexão

  public Connection con = null;
  // Método para realizar a conexão e retornar se a 
  // operação foi realizada com sucesso

  public boolean conectar() {
    // Tratamento de exceção para classes de arquivo local e SQL
    try {
      // Nome do arquivo a ser aberto, como o arquivo está no diretório
      // base da aplicação, não é necessário indicar o caminho (Path)
      // se o arquivo estiver em outro local, será necessário indicar
      // o caminho antes do nome do arquivo. Caso o arquivo não seja
      // encontrado, será gerada uma exceção.
      String nomeArquivo = "Database1.accdb";
      // Tenta abrir o arquivo.
      File arquivo = new File(nomeArquivo);
      // Verifica se o arquivo não existe e informa caso o arquivo 
      // não seja encontrado.
      if (!arquivo.exists()) {
        // .trim elimina espaços antes e depois do nome do arquivo
        String mensagem = "Arquivo: " + nomeArquivo.trim() + " não encontrado!";
        JOptionPane.showMessageDialog(null, mensagem);
      }
      // Definição do driver de acesso e do arquivo
      String database = "jdbc:ucanaccess://" + nomeArquivo.trim();
      // Executa a conexão com o banco de dados
      // Caso não consiga realizar a conexão, uma exceção será lançada
      con = DriverManager.getConnection(database);
    } catch (Exception e) { // trata a exceção se houver
      e.printStackTrace();
      return false;
    }
    return true;
  }
  // Método para encerrar a conexão e retornar se a 
  // operação foi realizada com sucesso

  public boolean desconectar() {
    con = null;
    if (con == null) {
      return true;
    } else {
      return false;
    }
  }
}