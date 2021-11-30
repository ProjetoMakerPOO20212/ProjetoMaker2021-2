package projetomaker;

import DBA.*;
import administrativo.Venda;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import pessoas.Usuario;
import produtos.Produto;

public class FrontEnd extends javax.swing.JFrame {
    
    AcessoBD acesso = new AcessoBD();
    ResultSet rs;
    
    public FrontEnd() {
        initComponents();
        preencherLista();
        RemoverProduto.setVisible(false);
        LimparCarrinho.setVisible(false);
        FinalizarCompra.setVisible(false);
        PrecoTotal.setVisible(false);
        PrecoTotalCarrinho.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();
        Todos = new javax.swing.JButton();
        Mouse = new javax.swing.JButton();
        Teclado = new javax.swing.JButton();
        Monitor = new javax.swing.JButton();
        PrecoTotal = new javax.swing.JLabel();
        PrecoTotalCarrinho = new javax.swing.JTextField();
        RemoverProduto = new javax.swing.JButton();
        LimparCarrinho = new javax.swing.JButton();
        FinalizarCompra = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Voltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(2, 11, 38));

        jPanel2.setBackground(new java.awt.Color(2, 11, 38));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 3, true));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/banner.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(4, 24, 64), 2, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(154, 154, 154))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(220, 235, 243));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));
        jPanel3.setForeground(new java.awt.Color(153, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 255, 255)));

        jLista.setBackground(new java.awt.Color(220, 235, 243));
        jLista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 11, 38), 1, true));
        jLista.setFont(jLista.getFont().deriveFont((float)18));
        jLista.setForeground(new java.awt.Color(2, 31, 49));
        jLista.setAlignmentX(0.0F);
        jLista.setAlignmentY(0.0F);
        jLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLista);

        Todos.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Todos.setText("Todos os produtos");
        Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosActionPerformed(evt);
            }
        });

        Mouse.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/mouse.png"))); // NOI18N
        Mouse.setText("Mouse");
        Mouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MouseActionPerformed(evt);
            }
        });

        Teclado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Teclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/teclado.png"))); // NOI18N
        Teclado.setText("Teclado");
        Teclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecladoActionPerformed(evt);
            }
        });

        Monitor.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Monitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/monitor.png"))); // NOI18N
        Monitor.setText("Monitor");
        Monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonitorActionPerformed(evt);
            }
        });

        PrecoTotal.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        PrecoTotal.setText("Preco Total:");

        PrecoTotalCarrinho.setBackground(new java.awt.Color(220, 235, 243));
        PrecoTotalCarrinho.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        PrecoTotalCarrinho.setBorder(null);

        RemoverProduto.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        RemoverProduto.setText("Remover Produto");
        RemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverProdutoActionPerformed(evt);
            }
        });

        LimparCarrinho.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        LimparCarrinho.setText("Limpar Carrinho");
        LimparCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCarrinhoActionPerformed(evt);
            }
        });

        FinalizarCompra.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        FinalizarCompra.setText("Finalizar Compra");
        FinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Todos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitulo)
                        .addGap(88, 88, 88)
                        .addComponent(Monitor)
                        .addGap(107, 107, 107)
                        .addComponent(Mouse)
                        .addGap(113, 113, 113)
                        .addComponent(Teclado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(RemoverProduto)
                        .addGap(49, 49, 49)
                        .addComponent(LimparCarrinho)
                        .addGap(54, 54, 54)
                        .addComponent(FinalizarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrecoTotal)
                        .addGap(18, 18, 18)
                        .addComponent(PrecoTotalCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Monitor)
                            .addComponent(Todos)
                            .addComponent(Mouse)
                            .addComponent(Teclado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrecoTotalCarrinho)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrecoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RemoverProduto)
                        .addComponent(LimparCarrinho)
                        .addComponent(FinalizarCompra)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jMenuBar1.setBackground(new java.awt.Color(164, 205, 224));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(4, 24, 64), new java.awt.Color(204, 255, 255)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(2.0F);
        jMenuBar1.setAlignmentY(2.0F);
        jMenuBar1.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(398, 50));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(398, 50));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/kart50x50.png"))); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu4.setBackground(new java.awt.Color(255, 51, 0));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/user.png"))); // NOI18N
        jMenu4.setAlignmentX(2.0F);
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jMenu4.add(Voltar);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("usuario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void MonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonitorActionPerformed
        RemoverProduto.setVisible(false);
        LimparCarrinho.setVisible(false);
        FinalizarCompra.setVisible(false);
        PrecoTotal.setVisible(false);
        PrecoTotalCarrinho.setVisible(false);
        
        ProdutoDAO pd = new ProdutoDAO();
        ArrayList<String> mr = pd.listarMonitor();
        
        if (mr==null) {
            String mensagem = "Listagem Não Gerada!";
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            String linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s|%10s", 
                    "Codigo", "Codigo de Barras", "Tipo", "Nome", 
                    "Marca", "Preco", "Quantidade em estoque", "Frequencia",
                    "Polegadas", "Entradas");
            
            String vet[] = new String[mr.size()];
            
            for (int i = 0; i < mr.size(); i++) {
                vet[i] = mr.get(i);
            }
            
            jLista.setFont(new Font("Courier New", Font.PLAIN, 11));
            jLista.setListData(vet);
            jLista.setSelectedIndex(1);
        }
    }//GEN-LAST:event_MonitorActionPerformed

    private void MouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MouseActionPerformed
        RemoverProduto.setVisible(false);
        LimparCarrinho.setVisible(false);
        FinalizarCompra.setVisible(false);
        PrecoTotal.setVisible(false);
        PrecoTotalCarrinho.setVisible(false);
        
        ProdutoDAO pd = new ProdutoDAO();
        ArrayList<String> mor = pd.listarMouse();
        
        if (mor==null) {
            String mensagem = "Listagem Não Gerada!";
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            String linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s", 
                    "Codigo", "Codigo de Barras", "Tipo", "Nome", 
                    "Marca", "Preco", "Quantidade em estoque", "DPI",
                    "Peso");
            
            String vet[] = new String[mor.size()];
            
            for (int i = 0; i < mor.size(); i++) {
                vet[i] = mor.get(i);
            }
            
            jLista.setFont(new Font("Courier New", Font.PLAIN, 11));
            jLista.setListData(vet);
            jLista.setSelectedIndex(1);
        }
    }//GEN-LAST:event_MouseActionPerformed

    private void TecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecladoActionPerformed
        RemoverProduto.setVisible(false);
        LimparCarrinho.setVisible(false);
        FinalizarCompra.setVisible(false);
        PrecoTotal.setVisible(false);
        PrecoTotalCarrinho.setVisible(false);
        
        ProdutoDAO pd = new ProdutoDAO();
        ArrayList<String> tr = pd.listarTeclado();
        
        if (tr==null) {
            String mensagem = "Listagem Não Gerada!";
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            String linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s|%10s|%10s|%10s", 
                    "Codigo", "Codigo de Barras", "Tipo", "Nome", 
                    "Marca", "Preco", "Quantidade em estoque", "Modelo",
                    "Cor", "RGB");
            
            String vet[] = new String[tr.size()];
            
            for (int i = 0; i < tr.size(); i++) {
                vet[i] = tr.get(i);
            }
            
            jLista.setFont(new Font("Courier New", Font.PLAIN, 11));
            jLista.setListData(vet);
            jLista.setSelectedIndex(1);
        }
    }//GEN-LAST:event_TecladoActionPerformed

    private void TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosActionPerformed
        RemoverProduto.setVisible(false);
        LimparCarrinho.setVisible(false);
        FinalizarCompra.setVisible(false);
        PrecoTotal.setVisible(false);
        PrecoTotalCarrinho.setVisible(false);
        preencherLista();
    }//GEN-LAST:event_TodosActionPerformed

    private void jListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            Usuario u1 = new Usuario();
            String codigoUsuario = JOptionPane.showInputDialog("Codigo de usuario");
            UsuarioDAO ud = new UsuarioDAO();
            
            if (ud.buscarUsuarioC(codigoUsuario.trim())) {
                u1 = ud.buscarUsuario(codigoUsuario.trim());
                Produto p1 = new Produto();
                ProdutoDAO pd = new ProdutoDAO();

                Venda v1 = new Venda();
                VendaDAO vd = new VendaDAO();

                String codigoBarra = jLista.getSelectedValue().substring(7, 23);

                if (pd.buscarProdutoCB(codigoBarra.trim())) {
                    p1 = pd.buscarProduto(codigoBarra.trim());
                    switch (p1.getTipo()) {
                        case "Monitor":
                            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

                            if(quantidade>p1.getEstoque().getQuantidadeEstoque() || quantidade<=0) {
                                String mensagem = "Quantidade indisponivel!";
                                JOptionPane.showMessageDialog(null, mensagem);
                                break;
                            }

                            v1.setCodigoVenda("1");

                            if (vd.buscarVendaC(v1.getCodigoVenda(), p1.getCodigoBarra())) {

                                v1 = vd.buscarVenda("1", p1.getCodigoBarra());

                                v1.setQuantidadeComprada(Math.addExact(v1.getQuantidadeComprada(), quantidade));

                                if (vd.atualizarCarrinho(v1)){
                                    String mensagem = "Produto adiconado ao carrinho!";
                                    JOptionPane.showMessageDialog(null, mensagem);
                                    break;
                                }
                            }

                            v1.setCodigoUsuario(u1.getCodigoUsuario());
                            v1.setCodigoProduto(p1.getCodigoBarra());
                            v1.setNomeProduto(p1.getNome());
                            v1.setPrecoProduto(p1.getPreco());
                            v1.setQuantidadeComprada(quantidade);

                            if (vd.addProduto(v1)){
                                String mensagem = "Produto adiconado ao carrinho!";
                                JOptionPane.showMessageDialog(null, mensagem);
                                break;
                            }

                        case "Mouse":
                            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

                            if(quantidade>p1.getEstoque().getQuantidadeEstoque()) {
                                String mensagem = "Quantidade indisponivel!";
                                JOptionPane.showMessageDialog(null, mensagem);
                                break;
                            }

                            v1.setCodigoVenda("1");

                            if (vd.buscarVendaC(v1.getCodigoVenda(), p1.getCodigoBarra())) {
                                v1 = vd.buscarVenda("1", p1.getCodigoBarra());

                                v1.setQuantidadeComprada(Math.addExact(v1.getQuantidadeComprada(), quantidade));

                                if (vd.atualizarCarrinho(v1)){
                                    String mensagem = "Produto adiconado ao carrinho!";
                                    JOptionPane.showMessageDialog(null, mensagem);
                                    break;
                                }
                            }

                            v1.setCodigoUsuario(u1.getCodigoUsuario());
                            v1.setCodigoProduto(p1.getCodigoBarra());
                            v1.setNomeProduto(p1.getNome());
                            v1.setPrecoProduto(p1.getPreco());
                            v1.setQuantidadeComprada(quantidade);

                            if (vd.addProduto(v1)){
                                String mensagem = "Produto adiconado ao carrinho!";
                                JOptionPane.showMessageDialog(null, mensagem);
                                break;
                            }

                        case "Teclado":
                            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

                            if(quantidade>p1.getEstoque().getQuantidadeEstoque()) {
                                String mensagem = "Quantidade indisponivel!";
                                JOptionPane.showMessageDialog(null, mensagem);
                                break;
                            }

                            v1.setCodigoVenda("1");

                            if (vd.buscarVendaC(v1.getCodigoVenda(), p1.getCodigoBarra())) {
                                v1 = vd.buscarVenda("1", p1.getCodigoBarra());
                                v1.setQuantidadeComprada(Math.addExact(v1.getQuantidadeComprada(), quantidade));

                                if (vd.atualizarCarrinho(v1)){
                                    String mensagem = "Produto adiconado ao carrinho!";
                                    JOptionPane.showMessageDialog(null, mensagem);
                                    break;
                                }
                            }

                            v1.setCodigoUsuario(u1.getCodigoUsuario());
                            v1.setCodigoProduto(p1.getCodigoBarra());
                            v1.setNomeProduto(p1.getNome());
                            v1.setPrecoProduto(p1.getPreco());
                            v1.setQuantidadeComprada(quantidade);

                            if (vd.addProduto(v1)){
                                String mensagem = "Produto adiconado ao carrinho!";
                                JOptionPane.showMessageDialog(null, mensagem);
                                break;
                            }
                    }
                }
            } else {
                String mensagem = "Usuario não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
            }  
        }
    }//GEN-LAST:event_jListaMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        VendaDAO vd = new VendaDAO();
        double precoTotalVenda = 0;
        ArrayList<String> cr = vd.verCarrinho();
        
        if (cr.size() == 1) {
            String mensagem = "Carrinho vazio!";
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            String linha = String.format("%6s|%15s|%17s|%20s|%20s|%13s|%10s|%11s", 
                    "Codigo", "Codigo de Venda", "Codigo de Usuario", "Codigo de Barra", 
                    "Nome Produto", "Preco Produto", "Quantidade", "Preco Total");
            
            String vet[] = new String[cr.size()];
            
            for (int i = 0; i < cr.size(); i++) {
                vet[i] = cr.get(i);
            }
            
            jLista.setFont(new Font("Courier New", Font.PLAIN, 11));
            jLista.setListData(vet);
            jLista.setSelectedIndex(1);
            
            String codigoVenda = jLista.getSelectedValue().substring(7, 22);
            
            precoTotalVenda = vd.checaPreco(Integer.parseInt(codigoVenda.trim()));
            
            RemoverProduto.setVisible(true);
            LimparCarrinho.setVisible(true);
            FinalizarCompra.setVisible(true);
            PrecoTotal.setVisible(true);
            PrecoTotalCarrinho.setVisible(true);
            PrecoTotalCarrinho.setText("R$ "+String.valueOf(precoTotalVenda));
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void RemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverProdutoActionPerformed
        Venda v1 = new Venda();
        VendaDAO vd = new VendaDAO();
        
        String codigoVenda = jLista.getSelectedValue().substring(7, 22);
        String codigoBarra = jLista.getSelectedValue().substring(42, 61);
        
        if(vd.buscarVendaC(codigoVenda.trim(), codigoBarra.trim())){
            v1 = vd.buscarVenda(codigoVenda.trim(), codigoBarra.trim());
            
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
            
            if(quantidade>v1.getQuantidadeComprada()) {
                String mensagem = "Quantidade indisponivel!";
                JOptionPane.showMessageDialog(null, mensagem);
            } else {
                v1.setQuantidadeComprada(Math.subtractExact(v1.getQuantidadeComprada(), quantidade));
            
                if (vd.removerProduto(v1)){
                    String mensagem = "Quantidade removida do carrinho!";
                    JOptionPane.showMessageDialog(null, mensagem);
                }
            }
        }
    }//GEN-LAST:event_RemoverProdutoActionPerformed

    private void LimparCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCarrinhoActionPerformed
        int continuar;
        Venda v1 = new Venda();
        VendaDAO vd = new VendaDAO();
        
        String codigoVenda = jLista.getSelectedValue().substring(7, 22);
        if (vd.buscarVendaCV(codigoVenda.trim())){
            continuar = JOptionPane.showConfirmDialog(null, "Deseja esvaziar o carrinho?");
            if (continuar == 0){
                if (vd.limparCarrinho(codigoVenda.trim())){
                    String mensagem = "Carrinho esvaziado!";
                    preencherLista();
                    RemoverProduto.setVisible(false);
                    LimparCarrinho.setVisible(false);
                    FinalizarCompra.setVisible(false);
                    PrecoTotal.setVisible(false);
                    PrecoTotalCarrinho.setVisible(false);
                    JOptionPane.showMessageDialog(null, mensagem);
                }
            } 
        } else {
            String mensagem = "Pedido não encontrado!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_LimparCarrinhoActionPerformed

    private void FinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarCompraActionPerformed
        String formaPagamento;
        
        Usuario u1 = new Usuario();
        Venda v1 = new Venda();
        
        UsuarioDAO ud = new UsuarioDAO();
        VendaDAO vd = new VendaDAO();
        
        String codigoVenda = jLista.getSelectedValue().substring(7, 22);
        String codigoUsuario = jLista.getSelectedValue().substring(24, 40);
        
        if (vd.buscarVendaCV(codigoVenda.trim())){
            do {
                formaPagamento = JOptionPane.showInputDialog("Qual a forma de pagamento?\n1 - Cartão de Credito\n2 - Boleto\n3 - Pix");
                
                v1 = vd.buscarVendaC(codigoVenda.trim());
                u1 = ud.buscarUsuario(codigoUsuario.trim());
                
                if (formaPagamento == null) {
                    break;
                }
                
                switch (Integer.parseInt(formaPagamento)){
                    case 1:
                        TelaDadosCartao tela = new TelaDadosCartao(codigoVenda.trim(), codigoUsuario.trim());
                        tela.setVisible(true);
                        break;
                    case 2:
                        vd.finalizarCarrinho(v1, u1);
                        String mensagem = "Pedido enviado!";
                        JOptionPane.showMessageDialog(null, mensagem);
                        break;
                    case 3:
                        vd.finalizarCarrinho(v1, u1);
                        mensagem = "Pedido enviado!";
                        JOptionPane.showMessageDialog(null, mensagem);
                        break;
                    default:
                    case 0:
                        mensagem = "Opcao invalida!";
                        JOptionPane.showMessageDialog(null, mensagem);
                        break;
                }
            } while(Integer.parseInt(formaPagamento) > 3 || Integer.parseInt(formaPagamento) <= 0);
        } else {
            String mensagem = "Pedido não encontrado!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_FinalizarCompraActionPerformed
    
    public boolean preencherLista() {
        try {
            acesso.conectar();
            String consulta = "select * from Produto";
            PreparedStatement stm = acesso.con.prepareStatement(consulta);
            rs = stm.executeQuery();
            
            ArrayList<String> ar = new ArrayList();
            String linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s", 
                    "Codigo", "Codigo de Barras", "Tipo", "Nome", 
                    "Marca", "Preco", "Quantidade em estoque");
            ar.add(linha);
            
            while (rs.next()) {
                linha = String.format("%6s|%16s|%7s|%20s|%20s|%10s|%21s", 
                        rs.getString("codigo"), rs.getString("codigoBarra"), 
                        rs.getString("tipo"), rs.getString("nome"), 
                        rs.getString("marca"), rs.getString("preco"),
                        rs.getString("quantidadeEstoque"));
                ar.add(linha);
            }
            
            String vet[] = new String[ar.size()];
            for (int i = 0; i < ar.size(); i++) {
                vet[i] = ar.get(i);
            }
            
            jLista.setFont(new Font("Courier New", Font.PLAIN, 11));
            jLista.setListData(vet);
            jLista.setSelectedIndex(1);
            return true;
            
        } catch (Exception e) {
            String mensagem = "Exceção! Lista não preenchida!";
            System.out.println(e.getMessage());
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, mensagem);
            return false;
        } finally {
            acesso.desconectar();
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontEnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinalizarCompra;
    private javax.swing.JButton LimparCarrinho;
    private javax.swing.JButton Monitor;
    private javax.swing.JButton Mouse;
    private javax.swing.JLabel PrecoTotal;
    private javax.swing.JTextField PrecoTotalCarrinho;
    private javax.swing.JButton RemoverProduto;
    private javax.swing.JButton Teclado;
    private javax.swing.JButton Todos;
    private javax.swing.JMenuItem Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLista;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
