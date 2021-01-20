package traffic;

import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import traffic.ComboBox.CapturarDatos;

/**
 *
 * @author Alexis
 */
public class EditarDestinos extends javax.swing.JFrame {

    public EditarDestinos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDestinos();
        llenarCb();
    }

    /**
     * ****************************************************************************************
     */

    public void llenarCb() {
        try {
            CapturarDatos cd = new CapturarDatos();
            cbRutas.setModel(cd.CapturarNumeroDeRuta());
            cbLetras.setModel(cd.CapturarLetraDeRuta());
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error en llenado de cb");
        }
    }

    public void capturarDatosDeTable() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tbDestinos.getModel();
            String id = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 0));
            String pInicio = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 1));
            String nDestino = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 2));
            String nRuta = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 3));
            String letra = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 4));
            String tarifa = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 5));
            String tTransporte = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 6));
            String tiempo = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 7));
            String recorrido = String.valueOf(modelo.getValueAt(tbDestinos.getSelectedRow(), 8));

            txtId.setText(id);
            txtPInicial.setText(pInicio);
            txtNDestino.setText(nDestino);
            cbRutas.setSelectedItem(nRuta);
            cbLetras.setSelectedItem(letra);
            txtTarifa.setText(tarifa);
            cbTipoTransporte.setSelectedItem(tTransporte);
            txtTiempo.setText(tiempo);
            txtRecorrido.setText(recorrido);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error en captura de datos");
        }
    }

    //-------------------------------------------------------------------------------------------
    public void cargarDestinos() {

        try {
            conexion con = new conexion("localhost", "root", "123456", "db_traffic");
            DefaultTableModel modelo = new DefaultTableModel();
            ResultSet rs = con.ejecutarSelect("select * from view_destinos");
            ResultSetMetaData md = rs.getMetaData();

            int columnas = md.getColumnCount();
            for (int i = 1; i <= columnas; i++) {
                modelo.addColumn(md.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
                fila = null;
            }
            tbDestinos.setModel(modelo);
            con.desconectar();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error de Base de Datos");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPInicial = new javax.swing.JTextField();
        txtNDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbRutas = new javax.swing.JComboBox();
        cbLetras = new javax.swing.JComboBox();
        cbTipoTransporte = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        txtTarifa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRecorrido = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDestinos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULARIO PARA EDITAR DESTINOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del destino:");

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel8.setText("Punto de Inicio:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel3.setText("No. Ruta:");

        cbRutas.setFocusable(false);
        cbRutas.setLightWeightPopupEnabled(false);

        cbLetras.setName(""); // NOI18N

        cbTipoTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Autobus", "Coaster" }));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de transporte:");

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel9.setText("Tiempo estimado de llegada:");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel6.setText("Tarifa $:");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel7.setText("Recorrido:");

        btnSelect.setText("Seleccionar");
        btnSelect.setContentAreaFilled(false);
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setText("Letra:");

        tbDestinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDestinos);
        if (tbDestinos.getColumnModel().getColumnCount() > 0) {
            tbDestinos.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbDestinos.getColumnModel().getColumn(3).setPreferredWidth(5);
            tbDestinos.getColumnModel().getColumn(4).setPreferredWidth(20);
            tbDestinos.getColumnModel().getColumn(5).setPreferredWidth(5);
            tbDestinos.getColumnModel().getColumn(6).setPreferredWidth(20);
            tbDestinos.getColumnModel().getColumn(9).setPreferredWidth(15);
        }

        jLabel10.setText("ID Destino:");

        txtId.setEnabled(false);

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbLetras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTiempo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPInicial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNDestino)))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(btnSelect)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cbRutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7))
                                    .addComponent(txtRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegresar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnSelect)
                .addContainerGap())
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        capturarDatosDeTable();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        this.setVisible(false);
        new Principal().setVisible(true);

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_traffic?useSSL=false", "root", "123456");
            CallableStatement sql = con.prepareCall("Call sp_alterDestinos(?,?,?,?,?,?,?,?,?)");
            sql.setInt(1, Integer.parseInt(txtId.getText()));
            sql.setString(2, txtPInicial.getText());
            sql.setString(3, txtNDestino.getText());
            sql.setString(4, txtRecorrido.getText());
            sql.setString(5, cbTipoTransporte.getSelectedItem().toString());
            sql.setString(6, txtTiempo.getText());
            sql.setString(7, cbRutas.getSelectedItem().toString());
            sql.setString(8, cbLetras.getSelectedItem().toString());
            sql.setFloat(9, Float.parseFloat(txtTarifa.getText()));
            sql.execute();
            JOptionPane.showMessageDialog(null, "Registro modificado con exito!");
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error de bd");
        }
        txtId.setText("");
        txtPInicial.setText("");
        txtNDestino.setText("");
        cbRutas.setSelectedIndex(0);
        cbLetras.setSelectedIndex(0);
        cbTipoTransporte.setSelectedIndex(0);
        txtTarifa.setText("");
        txtTiempo.setText("");
        txtRecorrido.setText("");
        cargarDestinos();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDestinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditarDestinos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox cbLetras;
    private javax.swing.JComboBox cbRutas;
    private javax.swing.JComboBox cbTipoTransporte;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDestinos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNDestino;
    private javax.swing.JTextField txtPInicial;
    private javax.swing.JTextField txtRecorrido;
    private javax.swing.JTextField txtTarifa;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
