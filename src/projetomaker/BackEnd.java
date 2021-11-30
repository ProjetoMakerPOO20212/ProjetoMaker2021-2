package projetomaker;

import DBA.*;
import administrativo.Compra;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pessoas.Fornecedor;
import produtos.Produto;

public class BackEnd extends javax.swing.JFrame {
    
    AcessoBD acesso = new AcessoBD();
    ResultSet rs;
    
    public BackEnd() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();
        lblTitulo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuMonitor = new javax.swing.JMenu();
        CadastrarMonitor = new javax.swing.JMenuItem();
        EditarMonitor = new javax.swing.JMenuItem();
        RemoverMonitor = new javax.swing.JMenuItem();
        ListarMonitor = new javax.swing.JMenuItem();
        MenuMouse = new javax.swing.JMenu();
        CadastrarMouse = new javax.swing.JMenuItem();
        EditarMouse = new javax.swing.JMenuItem();
        RemoverMouse = new javax.swing.JMenuItem();
        ListarMouse = new javax.swing.JMenuItem();
        MenuTeclado = new javax.swing.JMenu();
        CadastrarTeclado = new javax.swing.JMenuItem();
        EditarTeclado = new javax.swing.JMenuItem();
        RemoverTeclado = new javax.swing.JMenuItem();
        ListarTeclado = new javax.swing.JMenuItem();
        MenuFornecedor = new javax.swing.JMenu();
        CadastrarFornecedor = new javax.swing.JMenuItem();
        EditarFornecedor = new javax.swing.JMenuItem();
        RemoverFornecedor = new javax.swing.JMenuItem();
        ListarFornecedor = new javax.swing.JMenuItem();
        MenuPedido = new javax.swing.JMenu();
        ComecarPedido = new javax.swing.JMenuItem();
        AddProduto = new javax.swing.JMenuItem();
        FinalizaPedido = new javax.swing.JMenuItem();
        ReceberProduto = new javax.swing.JMenuItem();
        HistoricoPedido = new javax.swing.JMenuItem();
        Menu = new javax.swing.JMenu();
        ListaProduto = new javax.swing.JMenuItem();
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
                .addContainerGap(165, Short.MAX_VALUE)
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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 255, 255)));

        jLista.setBackground(new java.awt.Color(220, 235, 243));
        jLista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 11, 38), 1, true));
        jLista.setFont(jLista.getFont().deriveFont((float)18));
        jLista.setForeground(new java.awt.Color(2, 31, 49));
        jLista.setAlignmentX(0.0F);
        jLista.setAlignmentY(0.0F);
        jScrollPane1.setViewportView(jLista);

        lblTitulo.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
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

        MenuMonitor.setBackground(new java.awt.Color(255, 51, 51));
        MenuMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/monitor.png"))); // NOI18N
        MenuMonitor.setText("Monitor");
        MenuMonitor.setAlignmentX(2.0F);
        MenuMonitor.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        CadastrarMonitor.setText("Cadastrar Monitor");
        CadastrarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarMonitorActionPerformed(evt);
            }
        });
        MenuMonitor.add(CadastrarMonitor);

        EditarMonitor.setText("Editar Monitor");
        EditarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarMonitorActionPerformed(evt);
            }
        });
        MenuMonitor.add(EditarMonitor);

        RemoverMonitor.setText("Remover Monitor");
        RemoverMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverMonitorActionPerformed(evt);
            }
        });
        MenuMonitor.add(RemoverMonitor);

        ListarMonitor.setText("Listar Monitores");
        ListarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarMonitorActionPerformed(evt);
            }
        });
        MenuMonitor.add(ListarMonitor);

        jMenuBar1.add(MenuMonitor);

        MenuMouse.setBackground(new java.awt.Color(255, 51, 51));
        MenuMouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/mouse.png"))); // NOI18N
        MenuMouse.setText("Mouse");
        MenuMouse.setAlignmentX(2.0F);
        MenuMouse.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        CadastrarMouse.setText("Cadastrar Mouse");
        CadastrarMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarMouseActionPerformed(evt);
            }
        });
        MenuMouse.add(CadastrarMouse);

        EditarMouse.setText("Editar Mouse");
        EditarMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarMouseActionPerformed(evt);
            }
        });
        MenuMouse.add(EditarMouse);

        RemoverMouse.setText("Remover Mouse");
        RemoverMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverMouseActionPerformed(evt);
            }
        });
        MenuMouse.add(RemoverMouse);

        ListarMouse.setText("Listar Mouses");
        ListarMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarMouseActionPerformed(evt);
            }
        });
        MenuMouse.add(ListarMouse);

        jMenuBar1.add(MenuMouse);

        MenuTeclado.setBackground(new java.awt.Color(255, 51, 51));
        MenuTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/teclado.png"))); // NOI18N
        MenuTeclado.setText("Teclado");
        MenuTeclado.setAlignmentX(2.0F);
        MenuTeclado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        CadastrarTeclado.setText("Cadastrar Teclado");
        CadastrarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarTecladoActionPerformed(evt);
            }
        });
        MenuTeclado.add(CadastrarTeclado);

        EditarTeclado.setText("Editar Teclado");
        EditarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarTecladoActionPerformed(evt);
            }
        });
        MenuTeclado.add(EditarTeclado);

        RemoverTeclado.setText("Remover Teclado");
        RemoverTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverTecladoActionPerformed(evt);
            }
        });
        MenuTeclado.add(RemoverTeclado);

        ListarTeclado.setText("Listar Teclados");
        ListarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarTecladoActionPerformed(evt);
            }
        });
        MenuTeclado.add(ListarTeclado);

        jMenuBar1.add(MenuTeclado);

        MenuFornecedor.setBackground(new java.awt.Color(255, 51, 51));
        MenuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/fornecedor.png"))); // NOI18N
        MenuFornecedor.setText("Fornecedor");
        MenuFornecedor.setAlignmentX(2.0F);
        MenuFornecedor.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        CadastrarFornecedor.setText("Cadastrar Fornecedor");
        CadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFornecedorActionPerformed(evt);
            }
        });
        MenuFornecedor.add(CadastrarFornecedor);

        EditarFornecedor.setText("Editar Fornecedor");
        EditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarFornecedorActionPerformed(evt);
            }
        });
        MenuFornecedor.add(EditarFornecedor);

        RemoverFornecedor.setText("Remover Fornecedor");
        RemoverFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverFornecedorActionPerformed(evt);
            }
        });
        MenuFornecedor.add(RemoverFornecedor);

        ListarFornecedor.setText("Listar Fornecedores");
        ListarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarFornecedorActionPerformed(evt);
            }
        });
        MenuFornecedor.add(ListarFornecedor);

        jMenuBar1.add(MenuFornecedor);

        MenuPedido.setBackground(new java.awt.Color(255, 51, 51));
        MenuPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/reposicao.png"))); // NOI18N
        MenuPedido.setText("Pedidos");
        MenuPedido.setAlignmentX(2.0F);
        MenuPedido.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        ComecarPedido.setText("Comecar Pedido");
        ComecarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComecarPedidoActionPerformed(evt);
            }
        });
        MenuPedido.add(ComecarPedido);

        AddProduto.setText("Adicionar produto ao pedido");
        AddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProdutoActionPerformed(evt);
            }
        });
        MenuPedido.add(AddProduto);

        FinalizaPedido.setText("Finalizar pedido");
        FinalizaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizaPedidoActionPerformed(evt);
            }
        });
        MenuPedido.add(FinalizaPedido);

        ReceberProduto.setText("Receber Produtos");
        ReceberProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberProdutoActionPerformed(evt);
            }
        });
        MenuPedido.add(ReceberProduto);

        HistoricoPedido.setText("Historico de Pedidos");
        HistoricoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoPedidoActionPerformed(evt);
            }
        });
        MenuPedido.add(HistoricoPedido);

        jMenuBar1.add(MenuPedido);

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomaker/user.png"))); // NOI18N

        ListaProduto.setText("Lista de Produtos");
        ListaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaProdutoActionPerformed(evt);
            }
        });
        Menu.add(ListaProduto);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        Menu.add(Voltar);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ListaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaProdutoActionPerformed
        preencherLista();
    }//GEN-LAST:event_ListaProdutoActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void CadastrarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarMonitorActionPerformed
        TelaDadosMonitor tela = new TelaDadosMonitor(1,"0");
        tela.setVisible(true);
    }//GEN-LAST:event_CadastrarMonitorActionPerformed

    private void EditarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarMonitorActionPerformed
        String tipo = jLista.getSelectedValue().substring(24, 31);
        String codigoBarra = jLista.getSelectedValue().substring(7, 23);
        if (tipo.trim().equals("Monitor")) {
            TelaDadosMonitor tela = new TelaDadosMonitor(2, codigoBarra.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_EditarMonitorActionPerformed

    private void RemoverMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverMonitorActionPerformed
        String tipo = jLista.getSelectedValue().substring(24, 31);
        String codigoBarra = jLista.getSelectedValue().substring(7, 23);
        if (tipo.trim().equals("Monitor")) {
            TelaDadosMonitor tela = new TelaDadosMonitor(3, codigoBarra.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_RemoverMonitorActionPerformed

    private void ListarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarMonitorActionPerformed
        ProdutoDAO pd = new ProdutoDAO();
        ArrayList<String> mr = pd.listarMonitor();
        
        if (mr.size() == 1) {
            String mensagem = "Nenhum monitor cadastrado!";
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
    }//GEN-LAST:event_ListarMonitorActionPerformed

    private void CadastrarMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarMouseActionPerformed
        TelaDadosMouse tela = new TelaDadosMouse(1,"0");
        tela.setVisible(true);
    }//GEN-LAST:event_CadastrarMouseActionPerformed

    private void EditarMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarMouseActionPerformed
        String tipo = jLista.getSelectedValue().substring(24, 31);
        String codigoBarra = jLista.getSelectedValue().substring(7, 23);
        if (tipo.trim().equals("Mouse")) {
            TelaDadosMouse tela = new TelaDadosMouse(2, codigoBarra.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_EditarMouseActionPerformed

    private void RemoverMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverMouseActionPerformed
        String tipo = jLista.getSelectedValue().substring(24, 31);
        String codigoBarra = jLista.getSelectedValue().substring(7, 23);
        if (tipo.trim().equals("Mouse")) {
            TelaDadosMouse tela = new TelaDadosMouse(3, codigoBarra.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_RemoverMouseActionPerformed

    private void ListarMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarMouseActionPerformed
        ProdutoDAO pd = new ProdutoDAO();
        ArrayList<String> mor = pd.listarMouse();
        
        if (mor.size() == 1) {
            String mensagem = "Nenhum mouse cadastrado!";
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
    }//GEN-LAST:event_ListarMouseActionPerformed

    private void CadastrarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarTecladoActionPerformed
        TelaDadosTeclado tela = new TelaDadosTeclado(1,"0");
        tela.setVisible(true);
    }//GEN-LAST:event_CadastrarTecladoActionPerformed

    private void EditarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarTecladoActionPerformed
        String tipo = jLista.getSelectedValue().substring(24, 31);
        String codigoBarra = jLista.getSelectedValue().substring(7, 23);
        if (tipo.trim().equals("Teclado")) {
            TelaDadosTeclado tela = new TelaDadosTeclado(2, codigoBarra.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_EditarTecladoActionPerformed

    private void RemoverTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverTecladoActionPerformed
        String tipo = jLista.getSelectedValue().substring(24, 31);
        String codigoBarra = jLista.getSelectedValue().substring(7, 23);
        if (tipo.trim().equals("Teclado")) {
            TelaDadosTeclado tela = new TelaDadosTeclado(3, codigoBarra.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_RemoverTecladoActionPerformed

    private void ListarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarTecladoActionPerformed
        ProdutoDAO pd = new ProdutoDAO();
        ArrayList<String> tr = pd.listarTeclado();
        
        if (tr.size() == 1) {
            String mensagem = "Nenhum teclado cadastrado!";
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
    }//GEN-LAST:event_ListarTecladoActionPerformed

    private void CadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFornecedorActionPerformed
        TelaDadosFornecedor tela = new TelaDadosFornecedor(1,"0");
        tela.setVisible(true);
    }//GEN-LAST:event_CadastrarFornecedorActionPerformed

    private void EditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarFornecedorActionPerformed
        String tipo = jLista.getSelectedValue().substring(7, 17);
        String codigoFornecedor = jLista.getSelectedValue().substring(23, 38);
        if (tipo.trim().equals("Fornecedor")) {
            TelaDadosFornecedor tela = new TelaDadosFornecedor(2, codigoFornecedor.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_EditarFornecedorActionPerformed

    private void RemoverFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverFornecedorActionPerformed
        String tipo = jLista.getSelectedValue().substring(7, 17);
        String codigoFornecedor = jLista.getSelectedValue().substring(23, 38);
        if (tipo.trim().equals("Fornecedor")) {
            TelaDadosFornecedor tela = new TelaDadosFornecedor(3, codigoFornecedor.trim());
            tela.setVisible(true);
        } else {
            String mensagem = "Opção inválida!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_RemoverFornecedorActionPerformed

    private void ListarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarFornecedorActionPerformed
        FornecedorDAO fd = new FornecedorDAO();
        ArrayList<String> fr = fd.listarFornecedor();
        
        if (fr.size() == 1) {
            String mensagem = "Nenhum fornecedor cadastrado!";
            JOptionPane.showMessageDialog(null, mensagem);
        }else{
            String linha = String.format("%6s|%10s|%20s|%20s|%20s|%20s|%20s|%20s|%10s|%15s", 
                    "Codigo", "Tipo", "Codigo Fornecedor", "CNPJ", "Nome", "Cidade", "Bairro", "Rua",
                    "Numero", "CEP");
            
            String vet[] = new String[fr.size()];
            
            for (int i = 0; i < fr.size(); i++) {
                vet[i] = fr.get(i);
            }
            
            jLista.setFont(new Font("Courier New", Font.PLAIN, 11));
            jLista.setListData(vet);
            jLista.setSelectedIndex(1);
        }
    }//GEN-LAST:event_ListarFornecedorActionPerformed

    private void ComecarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComecarPedidoActionPerformed
        int continuar;
        int codigoCompra=1;
        
        Produto p1 = new Produto();
        ProdutoDAO pd = new ProdutoDAO();
        
        Fornecedor f1 = new Fornecedor();
        FornecedorDAO fd = new FornecedorDAO();
        
        String codigoFornecedor = JOptionPane.showInputDialog("Digite o codigo do fornecedor");
        
        if (fd.buscarFornecedorC1(codigoFornecedor)) {
            f1 = fd.buscarFornecedor(codigoFornecedor);
            
            String codigoBarra = JOptionPane.showInputDialog("Digite o codigo de barra do produto");
            if (pd.buscarProdutoCB(codigoBarra)) {
                p1 = pd.buscarProduto(codigoBarra);
                try {
                    acesso.conectar();
                    String consulta = "select codigoCompra from Compra";
                    PreparedStatement stm = acesso.con.prepareStatement(consulta);
                    rs = stm.executeQuery();
                    
                    while(rs.next()) {
                        rs.getString("codigoCompra");
                        codigoCompra = Math.addExact(Integer.parseInt(rs.getString("codigoCompra")), 1);
                    }
                    
                    TelaDadosReposicao tela = new TelaDadosReposicao(1, codigoCompra, f1, p1);
                    tela.setVisible(true);
                
                } catch (Exception e) {
                    e.printStackTrace();
                    String mensagem = "Solicitacao não incluída!";
                    JOptionPane.showMessageDialog(null, mensagem);
                }
            } else {
                String mensagem = "Produto não encontrado!";
                JOptionPane.showMessageDialog(null, mensagem);
            }
        } else {
            String mensagem = "Fornecedor não encontrado!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_ComecarPedidoActionPerformed

    private void ReceberProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberProdutoActionPerformed
        int quantidade, quantidadeRecebida, codigoCompra;
        Produto p1 = new Produto();
        ProdutoDAO pd = new ProdutoDAO();
        Compra c1 = new Compra();
        CompraDAO cd = new CompraDAO();
        
        String status = jLista.getSelectedValue().substring(160, 175);
        
        if (status.trim().equals("Recebido")) {
            String mensagem = "Pedido já recebido!";
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            
            String codigoBarra = jLista.getSelectedValue().substring(63, 83);
        
            if (pd.buscarProdutoCB(codigoBarra.trim())) {
                p1 = pd.buscarProduto(codigoBarra.trim());
                switch (p1.getTipo()) {
                    case "Monitor":
                        quantidade = Integer.parseInt(jLista.getSelectedValue().substring(126, 147).trim());

                        quantidadeRecebida = Integer.parseInt(JOptionPane.showInputDialog("Chegaram " + quantidade + " monitores?"));

                        p1.getEstoque().setQuantidadeEstoque(p1.getEstoque().getQuantidadeEstoque() + quantidadeRecebida);

                        codigoCompra = Integer.parseInt(jLista.getSelectedValue().substring(7, 20).trim());

                        c1.setCodigoCompra(codigoCompra);
                        c1.setCodigoProduto(codigoBarra.trim());
                        c1.setStatus("Recebido");

                        if (pd.receberMonitor(p1) && cd.receberPedido(c1)) {
                            String mensagem = "Monitor recebido!";
                            JOptionPane.showMessageDialog(null, mensagem);
                        }

                        break;

                    case "Mouse":
                        quantidade = Integer.parseInt(jLista.getSelectedValue().substring(126, 147).trim());

                        quantidadeRecebida = Integer.parseInt(JOptionPane.showInputDialog("Chegaram " + quantidade + " mouses?"));

                        p1.getEstoque().setQuantidadeEstoque(p1.getEstoque().getQuantidadeEstoque() + quantidadeRecebida);

                        codigoCompra = Integer.parseInt(jLista.getSelectedValue().substring(7, 20).trim());

                        c1.setCodigoCompra(codigoCompra);
                        c1.setCodigoProduto(codigoBarra.trim());
                        c1.setStatus("Recebido");

                        if (pd.receberMouse(p1) && cd.receberPedido(c1)) {
                            String mensagem = "Mouse recebido!";
                            JOptionPane.showMessageDialog(null, mensagem);
                        }

                        break;

                    case "Teclado":
                        quantidade = Integer.parseInt(jLista.getSelectedValue().substring(126, 147).trim());

                        quantidadeRecebida = Integer.parseInt(JOptionPane.showInputDialog("Chegaram " + quantidade + " teclados?"));

                        p1.getEstoque().setQuantidadeEstoque(p1.getEstoque().getQuantidadeEstoque() + quantidadeRecebida);

                        codigoCompra = Integer.parseInt(jLista.getSelectedValue().substring(7, 20).trim());

                        c1.setCodigoCompra(codigoCompra);
                        c1.setCodigoProduto(codigoBarra.trim());
                        c1.setStatus("Recebido");

                        if (pd.receberTeclado(p1) && cd.receberPedido(c1)) {
                            String mensagem = "Teclado recebido!";
                            JOptionPane.showMessageDialog(null, mensagem);
                        }

                        break;
                }
            }
        }
    }//GEN-LAST:event_ReceberProdutoActionPerformed

    private void HistoricoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoPedidoActionPerformed
        CompraDAO cd = new CompraDAO();
        ArrayList<String> pr = cd.listarPedidos();
        
        if (pr.size() == 1) {
            String mensagem = "Nenhum pedido registrado!";
            JOptionPane.showMessageDialog(null, mensagem);
        } else{
            String linha = String.format("%6s|%13s|%20s|%20s|%20s|%20s|%20s|%21s|%11s|%15s", 
                    "Codigo", "Codigo Compra", "Codigo Fornecedor", "Nome Fornecedor", 
                    "Codigo Produto", "Nome Produto", "Preco Produto", "Quantidade Solicitada",
                    "Preco Total", "Status");
            
            String vet[] = new String[pr.size()];
            
            for (int i = 0; i < pr.size(); i++) {
                vet[i] = pr.get(i);
            }
            
            jLista.setFont(new Font("Courier New", Font.PLAIN, 11));
            jLista.setListData(vet);
            jLista.setSelectedIndex(1);
        }
    }//GEN-LAST:event_HistoricoPedidoActionPerformed

    private void AddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProdutoActionPerformed
        Compra c1 = new Compra();
        CompraDAO cd = new CompraDAO();
        
        Produto p1 = new Produto();
        ProdutoDAO pd = new ProdutoDAO();
        
        Fornecedor f1 = new Fornecedor();
        FornecedorDAO fd = new FornecedorDAO();
        
        String codigoCompra = JOptionPane.showInputDialog("Digite o codigo de compra");
        
        if (cd.buscarCompraC(Integer.parseInt(codigoCompra))) {
            c1 = cd.buscarCompra(Integer.parseInt(codigoCompra));
            
            f1 = fd.buscarFornecedor(c1.getCodigoFornecedor());
            
            String codigoBarra = JOptionPane.showInputDialog("Digite o codigo de barra do produto");
            if (pd.buscarProdutoCB(codigoBarra)) {
                p1 = pd.buscarProduto(codigoBarra);
                
                TelaDadosReposicao tela = new TelaDadosReposicao(2, Integer.parseInt(codigoCompra), f1, p1);
                tela.setVisible(true);
            }
        }
    }//GEN-LAST:event_AddProdutoActionPerformed

    private void FinalizaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizaPedidoActionPerformed
        Compra c1 = new Compra();
        CompraDAO cd = new CompraDAO();
        
        String codigoCompra = JOptionPane.showInputDialog("Digite o codigo de compra");
        
        if (cd.buscarCompraC(Integer.parseInt(codigoCompra))) {
            c1.setCodigoCompra(Integer.parseInt(codigoCompra));
            
            double precoTotalCompra = cd.finalizarCompra(c1.getCodigoCompra());
            
            String mensagem = "Valor total do pedido R$ "+precoTotalCompra+"";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_FinalizaPedidoActionPerformed
    
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
                new BackEnd().setVisible(true);
            }
        });   
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddProduto;
    private javax.swing.JMenuItem CadastrarFornecedor;
    private javax.swing.JMenuItem CadastrarMonitor;
    private javax.swing.JMenuItem CadastrarMouse;
    private javax.swing.JMenuItem CadastrarTeclado;
    private javax.swing.JMenuItem ComecarPedido;
    private javax.swing.JMenuItem EditarFornecedor;
    private javax.swing.JMenuItem EditarMonitor;
    private javax.swing.JMenuItem EditarMouse;
    private javax.swing.JMenuItem EditarTeclado;
    private javax.swing.JMenuItem FinalizaPedido;
    private javax.swing.JMenuItem HistoricoPedido;
    private javax.swing.JMenuItem ListaProduto;
    private javax.swing.JMenuItem ListarFornecedor;
    private javax.swing.JMenuItem ListarMonitor;
    private javax.swing.JMenuItem ListarMouse;
    private javax.swing.JMenuItem ListarTeclado;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu MenuFornecedor;
    private javax.swing.JMenu MenuMonitor;
    private javax.swing.JMenu MenuMouse;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenu MenuTeclado;
    private javax.swing.JMenuItem ReceberProduto;
    private javax.swing.JMenuItem RemoverFornecedor;
    private javax.swing.JMenuItem RemoverMonitor;
    private javax.swing.JMenuItem RemoverMouse;
    private javax.swing.JMenuItem RemoverTeclado;
    private javax.swing.JMenuItem Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLista;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
