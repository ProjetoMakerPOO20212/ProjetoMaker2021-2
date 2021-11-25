package projetomaker;

import DBA.FornecedorDAO;
import javax.swing.JOptionPane;
import pessoas.fornecedor;

public class TelaDadosFornecedor extends javax.swing.JFrame {

  // Atributos da clsses para ficarem disponíveis para todos os métodos
  int operacao;
  int codigo;
  
  // Construtor da janela alterado para receber o tipo de operação (1, 2 ou 3)
 // e o codigo do registro no banco, se codigo = 0 é uma inclusão 
  public TelaDadosFornecedor(int operacao, int codigo) {
      
    initComponents();
    // repassa os dados recebidos para os atributos da classe
    this.operacao = operacao;
    this.codigo = codigo;
    if (operacao == 1) {
      // Determina o título da janela para uma inclusão
      lb1.setText("Cadastrar");
        }
    if (operacao == 2) {
      // Determina o título da janela para uma alteração
      lb1.setText("Editar");
      // Cria um objeto fornecedor para receber os dados da consulta
      fornecedor fl = new fornecedor();
      // Cria um objeto FornecedorDAO para uso dos métodos de acesso
      // ao banco para os fornecedores
      FornecedorDAO fd = new FornecedorDAO();
      // Realiza a busca no Banco os dados do registro do fornecedor
      // através do codigo
      fl = fd.buscarFornecedor(codigo);
      // Preenche as caixas de texto com os dados do fornecedor
      txtNome.setText(fl.getNome());
      txtCidade.setText(fl.getEndereco().getCidade());
      txtBairro.setText(fl.getEndereco().getBairro());
      txtCep.setText(fl.getEndereco().getCep());
      txtRua.setText(fl.getEndereco().getRua());
      txtCnpj.setText(fl.getCnpj());
    }
    if (operacao == 3) {
      // Determina o título da janela para uma exclusão
      lb1.setText("Excluir");
      // Cria um objeto fornecedor para receber os dados da consulta
      fornecedor fl = new fornecedor();
      // Cria um objeto FornecedorDAO para uso dos métodos de acesso
      // ao banco para os fornecedores
      FornecedorDAO fd = new FornecedorDAO();
      // Realiza a busca no Banco os dados do registro do fornecedor
      // através do codigo
      fl = fd.buscarFornecedor(codigo);
      // Preenche as caixas de texto com os dados do fornecedor
      txtNome.setText(fl.getNome());
      txtCidade.setText(fl.getEndereco().getCidade());
      txtBairro.setText(fl.getEndereco().getBairro());
      txtCep.setText(fl.getEndereco().getCep());
      txtRua.setText(fl.getEndereco().getRua());
      txtCnpj.setText(fl.getCnpj());
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(108, 100, 139));

        jPanel2.setBackground(new java.awt.Color(107, 186, 167));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Cidade");

        txtCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCidade.setText(" ");
        txtCidade.setAutoscrolls(false);
        txtCidade.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCidade.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCidade.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nome");

        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setText(" ");
        txtNome.setAutoscrolls(false);
        txtNome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNome.setMaximumSize(new java.awt.Dimension(56, 56));
        txtNome.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Bairro");

        txtBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBairro.setText(" ");
        txtBairro.setAutoscrolls(false);
        txtBairro.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtBairro.setMaximumSize(new java.awt.Dimension(56, 56));
        txtBairro.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Rua");

        txtRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRua.setText(" ");
        txtRua.setAutoscrolls(false);
        txtRua.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtRua.setMaximumSize(new java.awt.Dimension(56, 56));
        txtRua.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Cep");

        txtCep.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCep.setText(" ");
        txtCep.setAutoscrolls(false);
        txtCep.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCep.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCep.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("CNPJ");

        txtCnpj.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCnpj.setText(" ");
        txtCnpj.setAutoscrolls(false);
        txtCnpj.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCnpj.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCnpj.setMinimumSize(new java.awt.Dimension(56, 56));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(182, 161, 158));
        jPanel3.setMaximumSize(new java.awt.Dimension(358, 46));
        jPanel3.setMinimumSize(new java.awt.Dimension(358, 46));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/Pete Linforth.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(251, 161, 0));

        lb1.setBackground(new java.awt.Color(251, 161, 0));
        lb1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/user.png"))); // NOI18N
        lb1.setText("INCLUIR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lb1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(141, 141, 141))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // TODO add your handling code here:
       if (operacao == 1) { // Inclusão
        // Cria um objeto fornecedor para receber os dados da do preenchimento 
        // da tela
        fornecedor f1 = new fornecedor();
        // Cria um objeto FornecedorDAO para uso dos métodos de acesso
        // ao banco para os fornecedores
        FornecedorDAO fd = new FornecedorDAO();
        // Determina os valores dos atributos do objeto fornecedor, com os dados
        // preenchidos na tela
        // o codigo é gerado automaticamente pelo Access
        f1.setNome                     (         txtNome.getText().trim());
        f1.getEndereco().setCidade     (         txtCidade.getText().trim());
        f1.getEndereco().setBairro     (         txtBairro.getText().trim());
        f1.getEndereco().setCep        (         txtCep.getText().trim());
        f1.getEndereco().setRua        (         txtRua.getText().trim());
        f1.setCnpj                     (         txtCnpj.getText().trim());
        // Verifica se a operação de inserção obteve sucesso
        if (fd.cadastrarFornecedor(f1)) {
          String mensagem = "Fornecedor Inserido!";
          JOptionPane.showMessageDialog(null, mensagem);
          this.dispose();
        }
      } else if (operacao == 2) { // Alteração
        // Cria um objeto fornecedor para receber os dados da do preenchimento 
        // da tela
        fornecedor fl = new fornecedor();
        // Cria um objeto FornecedorDAO para uso dos métodos de acesso
        // ao banco para os fornecedores
        FornecedorDAO fd = new FornecedorDAO();
        // Determina os valores dos atributos do objeto fornecedor, com os dados
        // preenchidos na tela
        // o codigo irá ser usado para determinar o registro a ser alterado
        fl.setCodigo                   (                           codigo);
        fl.setNome                     (         txtNome.getText().trim());
        fl.getEndereco().setCidade     (         txtCidade.getText().trim());
        fl.getEndereco().setBairro     (         txtBairro.getText().trim());
        fl.getEndereco().setCep        (         txtCep.getText().trim());
        fl.getEndereco().setRua        (         txtRua.getText().trim());
        fl.setCnpj                     (         txtCnpj.getText().trim());
        // Verifica se a operação de alteração obteve sucesso
        if (fd.alterarFornecedor(fl)) {
          String mensagem = "Fornecedor alterado!";
          JOptionPane.showMessageDialog(null, mensagem);
          this.dispose();
        }
      } else if (operacao == 3) { // Exclusão
        // Cria um objeto fornecedor para receber os dados da do preenchimento 
        // da tela
        fornecedor fl = new fornecedor();
        // Cria um objeto FornecedorDAO para uso dos métodos de acesso
        // ao banco para os fornecedores
        FornecedorDAO fd = new FornecedorDAO();
        // Determina os valores dos atributos do objeto fornecedor, com os dados
        // preenchidos na tela
        // o codigo irá ser usado para determinar o registro a ser alterado
        fl.setCodigo                   (                           codigo);
        fl.setNome                     (         txtNome.getText().trim());
        fl.getEndereco().setCidade     (         txtCidade.getText().trim());
        fl.getEndereco().setBairro     (         txtBairro.getText().trim());
        fl.getEndereco().setCep        (         txtCep.getText().trim());
        fl.getEndereco().setRua        (         txtRua.getText().trim());
        fl.setCnpj                     (         txtCnpj.getText().trim());
        // Verifica se a operação de exclusão obteve sucesso
        if (fd.excluirFornecedor(fl)) {
          String mensagem = "Fornecedor excluído!";
          JOptionPane.showMessageDialog(null, mensagem);
        }
        this.dispose();
      }   
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDadosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDadosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDadosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDadosFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDadosFornecedor(0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
