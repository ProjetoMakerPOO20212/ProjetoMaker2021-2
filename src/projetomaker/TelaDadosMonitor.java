package projetomaker;

import produtos.Monitor;
import DBA.ProdutoDAO;
import javax.swing.JOptionPane;

public class TelaDadosMonitor extends javax.swing.JFrame {
    
    int operacao;
    String codigoBarra;
    
    public TelaDadosMonitor(int operacao, String codigoBarra) {
        initComponents();
        
        this.operacao = operacao;
        this.codigoBarra = codigoBarra;
        
        if (operacao == 1) {
            Titulo.setText("Cadastrar Monitor");
        }
        
        if (operacao == 2) {
            Titulo.setText("Editar Monitor");
            
            Monitor m1 = new Monitor();
            ProdutoDAO pd = new ProdutoDAO();
            
            m1 = pd.buscarMonitor(codigoBarra);
            
            txtCodigoBarra.setText(m1.getCodigoBarra());
            txtNome.setText(m1.getNome());
            txtMarca.setText(m1.getMarca());
            txtPreco.setText(String.valueOf(m1.getPreco()));
            txtFreq.setText(String.valueOf(m1.getFrequencia()));
            txtPol.setText(String.valueOf(m1.getPolegada()));
            txtQtdEnt.setText(String.valueOf(m1.getEntrada()));
            txtCodigoBarra.setEditable(false);
        }
        
        if (operacao == 3) {
            Titulo.setText("Remover Monitor");
            
            Monitor m1 = new Monitor();
            ProdutoDAO pd = new ProdutoDAO();
            
            m1 = pd.buscarMonitor(codigoBarra);
            
            txtCodigoBarra.setText(String.valueOf(m1.getCodigoBarra()));
            txtNome.setText(m1.getNome());
            txtMarca.setText(m1.getMarca());
            txtPreco.setText(String.valueOf(m1.getPreco()));
            txtFreq.setText(String.valueOf(m1.getFrequencia()));
            txtPol.setText(String.valueOf(m1.getPolegada()));
            txtQtdEnt.setText(String.valueOf(m1.getEntrada()));
            txtCodigoBarra.setEditable(false);
            txtNome.setEditable(false);
            txtMarca.setEditable(false);
            txtPreco.setEditable(false);
            txtFreq.setEditable(false);
            txtPol.setEditable(false);
            txtQtdEnt.setEditable(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPol = new javax.swing.JTextField();
        txtCodigoBarra = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtFreq = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQtdEnt = new javax.swing.JTextField();
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
        jLabel2.setText("Codigo de Barras");

        txtMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMarca.setText(" ");
        txtMarca.setAutoscrolls(false);
        txtMarca.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtMarca.setMaximumSize(new java.awt.Dimension(56, 56));
        txtMarca.setMinimumSize(new java.awt.Dimension(56, 56));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Frequencia");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Preco");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Polegadas");

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Quantidade de Entradas");

        txtPol.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPol.setText(" ");
        txtPol.setAutoscrolls(false);
        txtPol.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtPol.setMaximumSize(new java.awt.Dimension(56, 56));
        txtPol.setMinimumSize(new java.awt.Dimension(56, 56));

        txtCodigoBarra.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigoBarra.setText(" ");
        txtCodigoBarra.setAutoscrolls(false);
        txtCodigoBarra.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCodigoBarra.setMaximumSize(new java.awt.Dimension(56, 56));
        txtCodigoBarra.setMinimumSize(new java.awt.Dimension(56, 56));

        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setText(" ");
        txtNome.setAutoscrolls(false);
        txtNome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNome.setMaximumSize(new java.awt.Dimension(56, 56));
        txtNome.setMinimumSize(new java.awt.Dimension(56, 56));

        txtFreq.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFreq.setText(" ");
        txtFreq.setAutoscrolls(false);
        txtFreq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtFreq.setMaximumSize(new java.awt.Dimension(56, 56));
        txtFreq.setMinimumSize(new java.awt.Dimension(56, 56));

        txtPreco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPreco.setText(" ");
        txtPreco.setAutoscrolls(false);
        txtPreco.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtPreco.setMaximumSize(new java.awt.Dimension(56, 56));
        txtPreco.setMinimumSize(new java.awt.Dimension(56, 56));

        txtQtdEnt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtQtdEnt.setText(" ");
        txtQtdEnt.setAutoscrolls(false);
        txtQtdEnt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtQtdEnt.setMaximumSize(new java.awt.Dimension(56, 56));
        txtQtdEnt.setMinimumSize(new java.awt.Dimension(56, 56));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtFreq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQtdEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtQtdEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
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
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/monitor_icon-icons.com_64979.png"))); // NOI18N
        Titulo.setText("Cadastrar Monitor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
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
                .addContainerGap(171, Short.MAX_VALUE))
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
        Monitor m1 = new Monitor();
        ProdutoDAO pd = new ProdutoDAO();
        m1 = pd.buscarMonitor(codigoBarra);
        
        Monitor m2 = new Monitor();
        m2.setCodigo(m1.getCodigo());
        
        m2.setCodigoBarra (                           txtCodigoBarra.getText().trim());
        
        if (operacao == 1 && pd.buscarMonitorCB(m2.getCodigoBarra()) == false) {
            m2.setTipo        (                       "Monitor");
            m2.setNome        (                       txtNome.getText().trim());
            m2.setMarca       (                       txtMarca.getText().trim());
            m2.setPreco       (Double.parseDouble (   txtPreco.getText().trim()));
            m2.getEstoque().setQuantidadeEstoque(0);
            m2.setFrequencia  (Integer.parseInt   (   txtFreq.getText().trim()));
            m2.setPolegada    (Integer.parseInt   (   txtPol.getText().trim()));
            m2.setEntrada     (Integer.parseInt   (   txtQtdEnt.getText().trim()));
            
            if (pd.cadastrarMonitor(m2)) {
                String mensagem = "Monitor cadastrado!";
                JOptionPane.showMessageDialog(null, mensagem);
                this.dispose();
            }
        } else if (operacao == 2) {
            m2.setTipo        (                       "Monitor");
            m2.setNome        (                       txtNome.getText().trim());
            m2.setMarca       (                       txtMarca.getText().trim());
            m2.setPreco       (Double.parseDouble (   txtPreco.getText().trim()));
            m2.getEstoque().setQuantidadeEstoque(0);
            m2.setFrequencia  (Integer.parseInt   (   txtFreq.getText().trim()));
            m2.setPolegada    (Integer.parseInt   (   txtPol.getText().trim()));
            m2.setEntrada     (Integer.parseInt   (   txtQtdEnt.getText().trim()));
            
            if (pd.editarMonitor(m2)) {
                String mensagem = "Monitor alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
                this.dispose();
            }
        } else if (operacao == 3) {
            m2.setTipo        (                       "Monitor");
            m2.setNome        (                       txtNome.getText().trim());
            m2.setMarca       (                       txtMarca.getText().trim());
            m2.setPreco       (Double.parseDouble (   txtPreco.getText().trim()));
            m2.getEstoque().setQuantidadeEstoque(0);
            m2.setFrequencia  (Integer.parseInt   (   txtFreq.getText().trim()));
            m2.setPolegada    (Integer.parseInt   (   txtPol.getText().trim()));
            m2.setEntrada     (Integer.parseInt   (   txtQtdEnt.getText().trim()));
            
            if (pd.removerMonitor(m2)) {
                String mensagem = "Monitor excluído!";
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
                new TelaDadosMonitor(0,"0").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirma;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volta;
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
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtFreq;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPol;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdEnt;
    // End of variables declaration//GEN-END:variables
}