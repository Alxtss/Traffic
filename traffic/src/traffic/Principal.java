package traffic;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Principal(int aInt, String string, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addRutas = new javax.swing.JMenuItem();
        verRutas = new javax.swing.JMenuItem();
        editarRutas = new javax.swing.JMenuItem();
        eliminarRutas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        addDestinos = new javax.swing.JMenuItem();
        verDestinos = new javax.swing.JMenuItem();
        EditarDestinos = new javax.swing.JMenuItem();
        eliminarDestinos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a Traffic!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jMenuBar1.setInheritsPopupMenu(true);

        Inicio.setText("INICIO");

        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Inicio.add(jMenuItem1);

        jMenuBar1.add(Inicio);

        jMenu2.setText("Administrar Rutas");

        addRutas.setText("Agregar Rutas");
        addRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRutasActionPerformed(evt);
            }
        });
        jMenu2.add(addRutas);

        verRutas.setText("Consultar Rutas");
        verRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRutasActionPerformed(evt);
            }
        });
        jMenu2.add(verRutas);

        editarRutas.setText("Editar Rutas");
        editarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarRutasActionPerformed(evt);
            }
        });
        jMenu2.add(editarRutas);

        eliminarRutas.setText("Eliminar Rutas");
        eliminarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRutasActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarRutas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administrar Destinos");

        addDestinos.setText("Agregar Destinos");
        addDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDestinosActionPerformed(evt);
            }
        });
        jMenu3.add(addDestinos);

        verDestinos.setText("Consultar Destinos");
        verDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDestinosActionPerformed(evt);
            }
        });
        jMenu3.add(verDestinos);

        EditarDestinos.setText("Editar Destinos");
        EditarDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDestinosActionPerformed(evt);
            }
        });
        jMenu3.add(EditarDestinos);

        eliminarDestinos.setText("Eliminar Destinos");
        eliminarDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDestinosActionPerformed(evt);
            }
        });
        jMenu3.add(eliminarDestinos);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRutasActionPerformed
        
        this.setVisible(false);
        AgregarRutas ar =new AgregarRutas();
        ar.setVisible(true);
        
    }//GEN-LAST:event_addRutasActionPerformed

    private void verRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRutasActionPerformed
        
        this.setVisible(false);
        new ConsultarRutas().setVisible(true);
        
    }//GEN-LAST:event_verRutasActionPerformed

    private void addDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDestinosActionPerformed
        
        this.setVisible(false);
        new AgregarDestinos().setVisible(true);
        
    }//GEN-LAST:event_addDestinosActionPerformed

    private void verDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDestinosActionPerformed
        
        this.setVisible(false);
        new ConsultarDestinos().setVisible(true);
        
    }//GEN-LAST:event_verDestinosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        this.setVisible(false);
        new LoginUsers().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void editarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarRutasActionPerformed
        
        this.setVisible(false);
        new EditarRutas().setVisible(true);
        
    }//GEN-LAST:event_editarRutasActionPerformed

    private void eliminarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRutasActionPerformed
        
        this.setVisible(false);
        new EliminarRutas().setVisible(true);
        
    }//GEN-LAST:event_eliminarRutasActionPerformed

    private void EditarDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDestinosActionPerformed
        
        this.setVisible(false);
        new EditarDestinos().setVisible(true);
        
    }//GEN-LAST:event_EditarDestinosActionPerformed

    private void eliminarDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDestinosActionPerformed
        
        this.setVisible(false);
        new EliminarDestinos().setVisible(true);
        
    }//GEN-LAST:event_eliminarDestinosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EditarDestinos;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuItem addDestinos;
    private javax.swing.JMenuItem addRutas;
    private javax.swing.JMenuItem editarRutas;
    private javax.swing.JMenuItem eliminarDestinos;
    private javax.swing.JMenuItem eliminarRutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem verDestinos;
    private javax.swing.JMenuItem verRutas;
    // End of variables declaration//GEN-END:variables
}
