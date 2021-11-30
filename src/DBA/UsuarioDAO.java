package DBA;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pessoas.Usuario;

public class UsuarioDAO {
    public Usuario buscarUsuario(String codigoUsuario) {
        
        AcessoBD acesso = new AcessoBD();
        Usuario u1 = new Usuario();
        ResultSet rs;
        
        if (acesso.conectar()) {
            
            try {
                String consulta = "select * from Usuario WHERE codigoUsuario='" + codigoUsuario.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    if (rs.getString("codigoUsuario") != null) {
                        u1.setCodigo(Integer.parseInt(rs.getString("codigo")));
                        u1.setTipo(rs.getString("tipo"));
                        u1.setCodigoUsuario(rs.getString("codigoUsuario"));
                        u1.setEmail(rs.getString("email"));
                        u1.setSenha(rs.getString("senha"));
                        u1.setCpf(rs.getString("cpf"));
                        u1.setNome(rs.getString("nome"));
                        u1.getEndereco().setCidade(rs.getString("cidade"));
                        u1.getEndereco().setBairro(rs.getString("bairro"));
                        u1.getEndereco().setRua(rs.getString("rua"));
                        u1.getEndereco().setNumero(Integer.parseInt(rs.getString("numero")));
                        u1.setOpcional(rs.getString("opcional"));
                        u1.getEndereco().setCep(rs.getString("cep"));
                        u1.setTelefone(rs.getString("telefone"));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                String mensagem = "Usuario não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return null;
            }
        }
        acesso.desconectar();
        return u1;
    }
    
    public boolean buscarUsuarioC (String codigoUsuario) {
        boolean resp = false;
        AcessoBD acesso = new AcessoBD();
        Usuario u1 = new Usuario();
        ResultSet rs;
        
        if (acesso.conectar()) {
            try {
                String consulta = "select * from Usuario WHERE codigoUsuario='" + codigoUsuario.trim() + "'";
                
                PreparedStatement stm = acesso.con.prepareStatement(consulta);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    resp = true;
                    String mensagem = "Usuario já cadastrado!";
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
}