package projetomaker;

import DBA.UsuarioDAO;
import DBA.VendaDAO;
import administrativo.Venda;
import javax.swing.JOptionPane;
import pessoas.Usuario;

public class TelaDadosCartao extends javax.swing.JFrame {
    
    String codigoVenda, codigoUsuario;
    
    public TelaDadosCartao(String codigoVenda, String codigoUsuario) {
        initComponents();
        
        this.codigoVenda = codigoVenda;
        this.codigoUsuario = codigoUsuario;
        
        Venda v1 = new Venda();
        VendaDAO vd = new VendaDAO();
        Usuario u1 = new Usuario();
        UsuarioDAO ud = new UsuarioDAO();
        
        v1 = vd.buscarVendaC(codigoVenda);
        u1 = ud.buscarUsuario(codigoUsuario);
        
        txtCodigoVenda.setText(v1.getCodigoVenda());
        txtCodigoUsuario.setText(u1.getCodigoUsuario());
        txtNome.setText(u1.getNome());
        txtCpf.setText(u1.getCpf());
        txtTelefone.setText(u1.getTelefone());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoVenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
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
        jLabel2.setText("Numero do Cartao");

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.setText(" ");
        txtCodigo.setAutoscrolls(false);
        txtCodigo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCodigo.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCodigo.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Codigo de seguranca");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("CPF");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Validade");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Nome");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Telefone");

        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefone.setText(" ");
        txtTelefone.setAutoscrolls(false);
        txtTelefone.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtTelefone.setMaximumSize(new java.awt.Dimension(56, 56));
        txtTelefone.setMinimumSize(new java.awt.Dimension(56, 56));

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumero.setText(" ");
        txtNumero.setAutoscrolls(false);
        txtNumero.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNumero.setMaximumSize(new java.awt.Dimension(56, 56));
        txtNumero.setMinimumSize(new java.awt.Dimension(56, 56));

        txtValidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtValidade.setText(" ");
        txtValidade.setAutoscrolls(false);
        txtValidade.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtValidade.setMaximumSize(new java.awt.Dimension(56, 56));
        txtValidade.setMinimumSize(new java.awt.Dimension(56, 56));

        txtCpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCpf.setText(" ");
        txtCpf.setAutoscrolls(false);
        txtCpf.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCpf.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCpf.setMinimumSize(new java.awt.Dimension(56, 56));

        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setText(" ");
        txtNome.setAutoscrolls(false);
        txtNome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNome.setMaximumSize(new java.awt.Dimension(56, 56));
        txtNome.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Codigo Venda");

        txtCodigoVenda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoVenda.setText(" ");
        txtCodigoVenda.setAutoscrolls(false);
        txtCodigoVenda.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCodigoVenda.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCodigoVenda.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Codigo Usuario");

        txtCodigoUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoUsuario.setText(" ");
        txtCodigoUsuario.setAutoscrolls(false);
        txtCodigoUsuario.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCodigoUsuario.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCodigoUsuario.setMinimumSize(new java.awt.Dimension(56, 56));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
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
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/cartao.png"))); // NOI18N
        Titulo.setText("Cartão de Credito");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(181, 181, 181)
                .addComponent(Confirma)
                .addGap(160, 160, 160)
                .addComponent(Volta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(124, 124, 124))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaActionPerformed
        Venda v1 = new Venda();
        VendaDAO vd = new VendaDAO();
        
        Usuario u1 = new Usuario();
        UsuarioDAO ud = new UsuarioDAO();
        
        v1.setCodigoVenda(txtCodigoVenda.getText().trim());
        u1.setCodigoUsuario(txtCodigoUsuario.getText().trim());
        
        
        v1 = vd.buscarVendaC(v1.getCodigoVenda());
        u1 = ud.buscarUsuario(u1.getCodigoUsuario());
        
        v1.setNumeroCartao(txtNumero.getText().trim());
        v1.setCpf(txtCpf.getText().trim());
        v1.setTelefone(txtTelefone.getText().trim());
        
        if (vd.finalizarCarrinho(v1, u1)){
            String mensagem = "Pedido realizado!";
            JOptionPane.showMessageDialog(null, mensagem);
            this.dispose();
        }
    }//GEN-LAST:event_ConfirmaActionPerformed

    private void VoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltaActionPerformed

    public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDadosCartao(null,null).setVisible(true);
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
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtCodigoVenda;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}