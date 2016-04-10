/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import ClasesTipo.Proyecto;
import Conexion.Enlace.*;
import CRUD.Ingresar;
import ClasesTipo.Grupo;
import ClasesTipo.Inversion;
import Conexion.Enlace;
import com.mxrck.autocompleter.TextAutoCompleter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando Ambrosio
 */
public class BusProyectos extends javax.swing.JFrame {

    /**
     * Creates new form Inversionistas
     */
    public BusProyectos() {
        this.setUndecorated (true);
       initComponents();
        setLocationRelativeTo(null);
        
         jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (jTable1.getSelectedRow()!=-1){
                    int fila= jTable1.getSelectedRow();
                    codigo.setText(jTable1.getValueAt(fila,0).toString());
                    nombre.setText(jTable1.getValueAt(fila,1).toString());
                    descripcion.setText(jTable1.getValueAt(fila,2).toString());
                    presupuesto.setText(jTable1.getValueAt(fila,3).toString()); 
                    finicio.setText(jTable1.getValueAt(fila,4).toString());
                    ffinal.setText(jTable1.getValueAt(fila,5).toString());
                   

               }
            }
        } );
         
         
         ResultSet rs;  
        TextAutoCompleter textAutoAcompleter1 = new TextAutoCompleter(codigo);
        try {
            PreparedStatement pstm = Enlace.GetConnection().prepareStatement("SELECT DISTINCT idProyecto FROM proyecto ");
               rs= pstm.executeQuery(); 
        
               while( rs.next() )

            {

            textAutoAcompleter1.addItem( rs.getString( "idProyecto" ) );
            

            }
        } catch (SQLException ex) {
            //Logger.getLogger(Cheques.class.getName()).log(Level.SEVERE, null, ex);
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

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        presupuesto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        finicio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ffinal = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setColor1(new java.awt.Color(250, 250, 250));
        jcMousePanel1.setColor2(new java.awt.Color(102, 102, 102));
        jcMousePanel1.setgPosX2(0.0F);
        jcMousePanel1.setgPosY1(200.0F);
        jcMousePanel1.setModo(3);
        jcMousePanel1.setVisibleLogo(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("PROYECTOS");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        codigo.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        nombre.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Descripcion:");

        descripcion.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Presupuesto:");

        presupuesto.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("F. Incio:");

        finicio.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Im2/Home.jpg"))); // NOI18N
        jButton1.setText("Menu");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Im3/Home.jpg"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Im1/Home.jpg"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("F. Final:");

        ffinal.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        buscar.setBackground(new java.awt.Color(0, 0, 0));
        buscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(0, 0, 0));
        modificar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("MODIFiCAR");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock", "Tipo", "Medida", "Numero", "Marca", "Costo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(finicio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ffinal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(descripcion)
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(presupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(finicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(ffinal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu nuevo = new Menu();
        nuevo.setVisible(true);
        nuevo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        int idProyecto = Integer.parseInt(codigo.getText());


        Enlace cn = new Enlace();
        ResultSet res = cn.Proyectos(idProyecto);
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);

        modelo.setColumnIdentifiers(new Object[]{"idProyecto", "Nombre", "Descripcion", "Presupuesto", "Fecha Inicio", "Fecha Final"});
        try {
            while (res.next()) {
                modelo.addRow(new Object[]{res.getInt("idProyecto"), res.getString("nombreProyecto"), res.getString("descripcionProyecto"), res.getDouble("presupuesto"), res.getString("fechaInicio"), res.getString("fechaFinal")});
            }
            JOptionPane.showMessageDialog(this, "Dato Encontrado Correctamente");
        } catch (SQLException | HeadlessException e) {
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:

        try {
            int Codigo = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese Codigo de Proyecto ", "Modificar", JOptionPane.QUESTION_MESSAGE));

            if (Codigo == 0) {
                return;
            }

            Connection miConexion = (Connection) Enlace.GetConnection();
            try {
                Statement statement = (Statement) miConexion.createStatement();


                
                String Nombre = nombre.getText();
                String Descripcion = descripcion.getText();
                Double Presupuesto = Double.parseDouble(presupuesto.getText());
                String FechaInicio = finicio.getText();
                String FechaFinal = ffinal.getText();
                
                
                PreparedStatement pstm = Enlace.GetConnection().prepareStatement(" UPDATE proyecto "
                        
                        + " SET nombreProyecto = ? ,"
                        + " descripcionProyecto = ? ,"
                        + " presupuesto = ?, "
                        + "fechaInicio = ? ,"
                        + "fechaFinal = ? "
                        + "WHERE idProyecto = ? ");

                pstm.setString(1, Nombre);
                pstm.setString(2, Descripcion);
                pstm.setDouble(3, Presupuesto);
                pstm.setString(4, FechaInicio);
                pstm.setString(5, FechaFinal);
                pstm.setInt(6, Codigo);


                JOptionPane.showMessageDialog(this, "Datos Modificados correctamente");
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_modificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BusProyectos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField ffinal;
    private javax.swing.JTextField finicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField presupuesto;
    // End of variables declaration//GEN-END:variables
}
