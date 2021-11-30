package projetomaker;

import pessoas.Fornecedor;
import DBA.FornecedorDAO;
import javax.swing.JOptionPane;

public class TelaDadosFornecedor extends javax.swing.JFrame {
    
    int operacao;
    String codigoFornecedor;
    
    public TelaDadosFornecedor(int operacao, String codigoFornecedor) {
        initComponents();
        
        this.operacao = operacao;
        this.codigoFornecedor = codigoFornecedor;
        
        if (operacao == 1) {
            Titulo.setText("Cadastrar Fornecedor");
        }
        
        if (operacao == 2) {
            Titulo.setText("Editar Fornecedor");
            
            Fornecedor f1 = new Fornecedor();
            FornecedorDAO fd = new FornecedorDAO();
            
            f1 = fd.buscarFornecedor(codigoFornecedor);
            
            txtCodigoFornecedor.setText(f1.getCodigoFornecedor());
            txtCnpj.setText(f1.getCnpj());
            txtNome.setText(f1.getNome());
            txtCidade.setText(f1.getEndereco().getCidade());
            txtBairro.setText(f1.getEndereco().getBairro());
            txtRua.setText(f1.getEndereco().getRua());
            txtNumero.setText(String.valueOf(f1.getEndereco().getNumero()));
            txtCep.setText(f1.getEndereco().getCep());
            txtCodigoFornecedor.setEditable(false);
        }
        
        if (operacao == 3) {
            Titulo.setText("Remover Fornecedor");
            
            Fornecedor f1 = new Fornecedor();
            FornecedorDAO fd = new FornecedorDAO();
            
            f1 = fd.buscarFornecedor(codigoFornecedor);
            
            txtCodigoFornecedor.setText(f1.getCodigoFornecedor());
            txtCnpj.setText(f1.getCnpj());
            txtNome.setText(f1.getNome());
            txtCidade.setText(f1.getEndereco().getCidade());
            txtBairro.setText(f1.getEndereco().getBairro());
            txtRua.setText(f1.getEndereco().getRua());
            txtNumero.setText(String.valueOf(f1.getEndereco().getNumero()));
            txtCep.setText(f1.getEndereco().getCep());
            txtCodigoFornecedor.setEditable(false);
            txtCnpj.setEditable(false);
            txtNome.setEditable(false);
            txtCidade.setEditable(false);
            txtBairro.setEditable(false);
            txtRua.setEditable(false);
            txtNumero.setEditable(false);
            txtCep.setEditable(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtCodigoFornecedor = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Confirma = new javax.swing.JButton();
        Volta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(108, 100, 139));

        jPanel2.setBackground(new java.awt.Color(107, 186, 167));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Codigo Fornecedor");

        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setText(" ");
        txtNome.setAutoscrolls(false);
        txtNome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNome.setMaximumSize(new java.awt.Dimension(56, 56));
        txtNome.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Bairro");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("CNPJ");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Cidade");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Rua");

        txtRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRua.setText(" ");
        txtRua.setAutoscrolls(false);
        txtRua.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtRua.setMaximumSize(new java.awt.Dimension(56, 56));
        txtRua.setMinimumSize(new java.awt.Dimension(56, 56));

        txtCodigoFornecedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoFornecedor.setText(" ");
        txtCodigoFornecedor.setAutoscrolls(false);
        txtCodigoFornecedor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCodigoFornecedor.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCodigoFornecedor.setMinimumSize(new java.awt.Dimension(56, 56));

        txtCnpj.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCnpj.setText(" ");
        txtCnpj.setAutoscrolls(false);
        txtCnpj.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCnpj.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCnpj.setMinimumSize(new java.awt.Dimension(56, 56));

        txtBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBairro.setText(" ");
        txtBairro.setAutoscrolls(false);
        txtBairro.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtBairro.setMaximumSize(new java.awt.Dimension(56, 56));
        txtBairro.setMinimumSize(new java.awt.Dimension(56, 56));

        txtCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCidade.setText(" ");
        txtCidade.setAutoscrolls(false);
        txtCidade.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCidade.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCidade.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Numero");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumero.setText(" ");
        txtNumero.setAutoscrolls(false);
        txtNumero.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNumero.setMaximumSize(new java.awt.Dimension(56, 56));
        txtNumero.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("CEP");

        txtCep.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCep.setText(" ");
        txtCep.setAutoscrolls(false);
        txtCep.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCep.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCep.setMinimumSize(new java.awt.Dimension(56, 56));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(182, 161, 158));
        jPanel3.setMaximumSize(new java.awt.Dimension(358, 46));
        jPanel3.setMinimumSize(new java.awt.Dimension(358, 46));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/Pete Linforth.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(251, 161, 0));

        Titulo.setBackground(new java.awt.Color(251, 161, 0));
        Titulo.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/fornecedor.png"))); // NOI18N
        Titulo.setText("Cadastrar Fornecedor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel7)
                .addContainerGap(183, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        Confirma.setBackground(java.awt.Color.orange);
        Confirma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Confirma.setForeground(new java.awt.Color(153, 153, 255));
        Confirma.setText("Confirmar");
        Confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaActionPerformed(evt);
            }
        });

        Volta.setBackground(java.awt.Color.orange);
        Volta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Volta.setForeground(new java.awt.Color(153, 153, 255));
        Volta.setText("Voltar");
        Volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltaActionPerformed(evt);
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
                        .addGap(160, 160, 160)
                        .addComponent(Confirma)
                        .addGap(172, 172, 172)
                        .addComponent(Volta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirma)
                    .addComponent(Volta))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaActionPerformed
        Fornecedor f1 = new Fornecedor();
        FornecedorDAO fd = new FornecedorDAO();
        f1 = fd.buscarFornecedor(codigoFornecedor);
        
        Fornecedor f2 = new Fornecedor();
        f2.setCodigo(f1.getCodigo());
        
        f2.setCodigoFornecedor (          txtCodigoFornecedor.getText().trim());
        
        if (operacao == 1 && fd.buscarFornecedorC(f2.getCodigoFornecedor()) == false) {
            f2.setTipo        (                       "Fornecedor");
            f2.setCnpj                       (                      txtCnpj.getText().trim());
            f2.setNome                       (                      txtNome.getText().trim());
            f2.getEndereco().setCidade       (                      txtCidade.getText().trim());
            f2.getEndereco().setBairro       (                      txtBairro.getText().trim());
            f2.getEndereco().setRua          (                      txtRua.getText().trim());
            f2.getEndereco().setNumero       (Integer.parseInt     (txtNumero.getText().trim()));
            f2.getEndereco().setCep          (                      txtCep.getText().trim());
            
            if (fd.cadastrarFornecedor(f2)) {
                String mensagem = "Fornecedor cadastrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                this.dispose();
            }
        } else if (operacao == 2) {
            f2.setTipo        (                       "Fornecedor");
            f2.setCnpj                       (                      txtCnpj.getText().trim());
            f2.setNome                       (                      txtNome.getText().trim());
            f2.getEndereco().setCidade       (                      txtCidade.getText().trim());
            f2.getEndereco().setBairro       (                      txtBairro.getText().trim());
            f2.getEndereco().setRua          (                      txtRua.getText().trim());
            f2.getEndereco().setNumero       (Integer.parseInt     (txtNumero.getText().trim()));
            f2.getEndereco().setCep          (                      txtCep.getText().trim());
            
            if (fd.editarFornecedor(f2)) {
                String mensagem = "Fornecedor alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
                this.dispose();
            }
        } else if (operacao == 3) {
            f2.setTipo        (                       "Fornecedor");
            f2.setCnpj                       (                      txtCnpj.getText().trim());
            f2.setNome                       (                      txtNome.getText().trim());
            f2.getEndereco().setCidade       (                      txtCidade.getText().trim());
            f2.getEndereco().setBairro       (                      txtBairro.getText().trim());
            f2.getEndereco().setRua          (                      txtRua.getText().trim());
            f2.getEndereco().setNumero       (Integer.parseInt     (txtNumero.getText().trim()));
            f2.getEndereco().setCep          (                      txtCep.getText().trim());
            
            if (fd.removerFornecedor(f2)) {
                String mensagem = "Fornecedor excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                this.dispose();
            }
        } 
    }//GEN-LAST:event_ConfirmaActionPerformed

    private void VoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltaActionPerformed

    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDadosFornecedor(0,"0").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirma;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtCodigoFornecedor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}