package DBA;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AcessoBD {
    
    public Connection con = null;
    
    public boolean conectar() {
        
        try {
            
            String nomeArquivo = "ProjetoMakerDatabase.accdb";
            
            File arquivo = new File(nomeArquivo);
            
            if (!arquivo.exists()) {
                String mensagem = "Arquivo: " + nomeArquivo.trim() + " não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
            }
            
            String database = "jdbc:ucanaccess://" + nomeArquivo.trim();
            con = DriverManager.getConnection(database);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean desconectar() {
        con = null;
        if (con == null) {
            return true;
        } else {
            return false;
        }
    }
}