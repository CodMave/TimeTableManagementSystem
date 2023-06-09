package Admin;

import classes.Resource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class AddEditResources extends javax.swing.JFrame {

    /**
     * Creates new form UserSettings
     */
    public AddEditResources() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSpinQuan = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jAddRes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(64, 134, 200));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White Board", "Projectors", "Markers" }));
        jComboBox2.setBorder(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 170, 30));

        jTextField1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(64, 134, 200));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, 30));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Faculty");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 30));

        jSpinQuan.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jSpinQuan.setBorder(null);
        getContentPane().add(jSpinQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 170, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 190, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 20));

        jComboBox1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(64, 134, 200));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cls1", "cls2", "cls3", "cls4", "cls5" }));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 170, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Classroom");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 20));

        jAddRes.setBackground(new java.awt.Color(38, 106, 169));
        jAddRes.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        jAddRes.setForeground(new java.awt.Color(255, 255, 255));
        jAddRes.setText("Add");
        jAddRes.setAlignmentY(0.0F);
        jAddRes.setBorder(null);
        jAddRes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jAddRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddResActionPerformed(evt);
            }
        });
        getContentPane().add(jAddRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 130, 40));

        jButton1.setBackground(new java.awt.Color(237, 30, 121));
        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, 40));

        jLabel2.setBackground(new java.awt.Color(237, 30, 121));
        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Resources");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 320, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg-08.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.toBack();
        setVisible(false);
        new Resources().toFront();
        new Resources().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

          private void jAddResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddResActionPerformed
                    // TODO add your handling code here:
                    
                    String faculty = jTextField1.getText().toLowerCase();
                    String classroom = jComboBox1.getSelectedItem().toString().toLowerCase();
                    String type = jComboBox2.getSelectedItem().toString().toLowerCase();
                    int projQun = ((Integer) jSpinQuan.getValue());
                    
                    Resource obj = new Resource();
                    
        try {
            obj.add(classroom, faculty,type, projQun);
        } catch (SQLException ex) {
            Logger.getLogger(AddEditResources.class.getName()).log(Level.SEVERE, null, ex);
        }
          }//GEN-LAST:event_jAddResActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEditResources().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddRes;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinQuan;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
