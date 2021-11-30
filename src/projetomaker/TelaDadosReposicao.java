package projetomaker;

import DBA.CompraDAO;
import DBA.ProdutoDAO;
import javax.swing.JOptionPane;
import administrativo.Compra;
import pessoas.Fornecedor;
import produtos.*;

public class TelaDadosReposicao extends javax.swing.JFrame {
    
    int operacao;
    int codigoCompra;
    Fornecedor f1 = new Fornecedor();
    Produto p1 = new Produto();
    
    public TelaDadosReposicao(int operacao, int codigoCompra, Fornecedor f1, Produto p1) {
        
        initComponents();
        
        this.operacao = operacao;
        this.codigoCompra = codigoCompra;
        this.f1 = f1;
        this.p1 = p1;
        
        if (operacao == 1) {
            lb1.setText("Solicitar Produto");
            txtCodigoProduto.setText(p1.getCodigoBarra());
            txtProduto.setText(p1.getNome());
            txtCodigoFornecedor.setText(f1.getCodigoFornecedor());
            txtFornecedor.setText(f1.getNome());
            txtCodigoProduto.setEditable(false);
            txtProduto.setEditable(false);
            txtCodigoFornecedor.setEditable(false);
            txtFornecedor.setEditable(false);
        }
        
        if (operacao == 2) {
            lb1.setText("Adicionar Produto");
            txtCodigoProduto.setText(p1.getCodigoBarra());
            txtProduto.setText(p1.getNome());
            txtCodigoFornecedor.setText(f1.getCodigoFornecedor());
            txtFornecedor.setText(f1.getNome());
            txtCodigoProduto.setEditable(false);
            txtProduto.setEditable(false);
            txtCodigoFornecedor.setEditable(false);
            txtFornecedor.setEditable(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoFornecedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(108, 100, 139));

        jPanel2.setBackground(new java.awt.Color(107, 186, 167));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Codigo Produto");

        txtProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtProduto.setText(" ");
        txtProduto.setAutoscrolls(false);
        txtProduto.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtProduto.setMaximumSize(new java.awt.Dimension(56, 56));
        txtProduto.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Codigo Fornecedor");

        txtCodigoFornecedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoFornecedor.setText(" ");
        txtCodigoFornecedor.setAutoscrolls(false);
        txtCodigoFornecedor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCodigoFornecedor.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCodigoFornecedor.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Preco");

        txtQuantidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtQuantidade.setText(" ");
        txtQuantidade.setAutoscrolls(false);
        txtQuantidade.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtQuantidade.setMaximumSize(new java.awt.Dimension(56, 56));
        txtQuantidade.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Produto");

        txtCodigoProduto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoProduto.setText(" ");
        txtCodigoProduto.setAutoscrolls(false);
        txtCodigoProduto.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCodigoProduto.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCodigoProduto.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Fornecedor");

        txtFornecedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFornecedor.setText(" ");
        txtFornecedor.setAutoscrolls(false);
        txtFornecedor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtFornecedor.setMaximumSize(new java.awt.Dimension(56, 56));
        txtFornecedor.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Quantidade");

        txtPreco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPreco.setText(" ");
        txtPreco.setAutoscrolls(false);
        txtPreco.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtPreco.setMaximumSize(new java.awt.Dimension(56, 56));
        txtPreco.setMinimumSize(new java.awt.Dimension(56, 56));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(22, Short.MAX_VALUE))
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
        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/reposicao.png"))); // NOI18N
        lb1.setText("Solicitar Produto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lb1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
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
                .addGap(50, 50, 50))
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

        Voltar.setBackground(java.awt.Color.orange);
        Voltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Voltar.setForeground(new java.awt.Color(153, 153, 255));
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Confirmar.setBackground(java.awt.Color.orange);
        Confirmar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(153, 153, 255));
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
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
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Confirmar)
                        .addGap(89, 89, 89)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar)
                    .addComponent(Voltar))
                .addGap(156, 156, 156))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        if (operacao == 1) {
            Compra c1 = new Compra();
            CompraDAO cd = new CompraDAO();
            
            c1.setCodigoCompra         (                    codigoCompra);
            c1.setCodigoFornecedor     (                    txtCodigoFornecedor.getText().trim());
            c1.setNomeFornecedor       (                    txtFornecedor.getText().trim());
            c1.setCodigoProduto        (                    txtCodigoProduto.getText().trim());
            c1.setNomeProduto          (                    txtProduto.getText().trim());
            c1.setPrecoProduto         (Double.parseDouble (txtPreco.getText().trim()));
            c1.setQuantidadeSolicitada (Integer.parseInt   (txtQuantidade.getText().trim()));
            c1.setStatus               (                   "Aberto");
            
            if (cd.solicitarProduto(c1)) {
                String mensagem = "Requisição de compra enviada!\nCodigo de compra: "+c1.getCodigoCompra()+"";
                JOptionPane.showMessageDialog(null, mensagem);
                this.dispose();
            }
        }
        
        if (operacao == 2) {
            Compra c1 = new Compra();
            CompraDAO cd = new CompraDAO();
            
            c1.setCodigoCompra         (                    codigoCompra);
            c1.setCodigoFornecedor     (                    txtCodigoFornecedor.getText().trim());
            c1.setNomeFornecedor       (                    txtFornecedor.getText().trim());
            c1.setCodigoProduto        (                    txtCodigoProduto.getText().trim());
            c1.setNomeProduto          (                    txtProduto.getText().trim());
            c1.setPrecoProduto         (Double.parseDouble (txtPreco.getText().trim()));
            c1.setQuantidadeSolicitada (Integer.parseInt   (txtQuantidade.getText().trim()));
            c1.setStatus               (                   "Aberto");
            
            if (cd.addProduto(c1)) {
                String mensagem = "Produto Adicionado!";
                JOptionPane.showMessageDialog(null, mensagem);
                this.dispose();
            }
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDadosReposicao(0,0, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb1;
    private javax.swing.JTextField txtCodigoFornecedor;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
